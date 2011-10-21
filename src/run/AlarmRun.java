/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package run;

import javax.swing.UIManager;

/**
 *
 * @author Owner
 */
public class AlarmRun {

    /**
     * @param Run the main method
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                } catch (Exception ex) {
                    System.out.println("Exception: " + ex);
                }
                new gui.AlarmGui().setVisible(true);
                logic.AlarmLogic.getTime();
            }
        });
    }
}
