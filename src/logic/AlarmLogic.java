package logic;

import gui.AlarmGui;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.Timer;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javazoom.jl.player.Player;
import java.io.FileInputStream;

/**
 *
 * @author Owner
 */
public class AlarmLogic {

    // Variables
    private static Player mp3;
    private static FileInputStream mp3_file;
    public static File musicFile;
    private static String time;
    private static String alarmTime;
    private static Timer timer;

    // Getting and setting the current time to the AlarmGui.currentTime text box.
    // Updates once a minute.
    public static void getTime() {

        final DateFormat timeFormat = new SimpleDateFormat("H:mm a");
        ActionListener timerListener = new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                Date date = new Date();
                time = timeFormat.format(date);
                gui.AlarmGui.currentTime.setText(time);
                checkAlarm();
            }
        };
        timer = new Timer(60000, timerListener);
        // to make sure it doesn't wait one second at the start
        timer.setInitialDelay(0);
        timer.start();
    }

    // Standard file chooser to choose a mp3 to wake up to.
    public static void musicFileChooser() {

        JFileChooser fileChooser = new JFileChooser();
        FileFilter ft = new FileNameExtensionFilter("Music files", "mp3");
        fileChooser.addChoosableFileFilter(ft);
        fileChooser.setDialogTitle("Music Location");
        Component aComponent = null;

        int selected = fileChooser.showOpenDialog(aComponent);
        if (selected == JFileChooser.APPROVE_OPTION) {
            musicFile = fileChooser.getSelectedFile();
            AlarmGui.musicText.setText(musicFile.getName());
        }
    }

    // Checks to see if the time and alarmTime are equal
    // If so, music plays
    public static void checkAlarm() {

        if (time.equals(alarmTime)) {

            new Thread(
                    new Runnable() {

                        @Override
                        public void run() {
                            try {
                                mp3_file = new FileInputStream(musicFile);
                                mp3 = new Player(mp3_file);
                                mp3.play();
                            } catch (Exception ex) {
                                System.out.println(ex);
                            }
                        }
                    }).start();
        }

    }

    // Stops music and adds 5 minutes to the current time.
    public static void snooze() {

        try {
            mp3.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }

        int min = AlarmGui.minuteCombo.getSelectedIndex();
        if (AlarmGui.minuteCombo.getSelectedIndex() == 12) {
            AlarmGui.minuteCombo.setSelectedIndex(1);
        } else {
            AlarmGui.minuteCombo.setSelectedIndex(min + 1);
        }
        getAlarmTime();
    }

    // Stops music.
    public static void stop() {
        
        try {
            mp3.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    // String that pulls in alarm time from the combo boxes.
    public static String getAlarmTime() {

        alarmTime = AlarmGui.hourCombo.getSelectedItem().toString() + ":" + AlarmGui.minuteCombo.getSelectedItem().toString() + " AM";

        if (AlarmGui.todCombo.getSelectedItem() == "PM") {
            int hour = 12 + AlarmGui.hourCombo.getSelectedIndex();
            String hourString = Integer.toString(hour);
            alarmTime = hourString + ":" + AlarmGui.minuteCombo.getSelectedItem().toString() + " PM";
        }

        System.out.println(alarmTime);

        return alarmTime;
    }
}
