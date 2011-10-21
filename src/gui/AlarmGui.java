/*
 * @name Alarm Clock
 * @author Ben Rudi
 * Created on Jun 28, 2011, 2:07:14 PM
 */
package gui;

public class AlarmGui extends javax.swing.JFrame {

    /** Creates new form Gui */
    public AlarmGui() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        musicText = new javax.swing.JTextField();
        currentTime = new javax.swing.JTextField();
        alarmTime = new javax.swing.JTextField();
        browseButton = new javax.swing.JButton();
        snoozeButton = new javax.swing.JButton();
        stopButton = new javax.swing.JButton();
        hourCombo = new javax.swing.JComboBox();
        minuteCombo = new javax.swing.JComboBox();
        todCombo = new javax.swing.JComboBox();
        setAlarmButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alarm Clock v.01");
        setLocationByPlatform(true);
        setName("frame"); // NOI18N
        setResizable(false);

        musicText.setEditable(false);
        musicText.setFont(new java.awt.Font("Tahoma", 0, 14));
        musicText.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        currentTime.setEditable(false);
        currentTime.setFont(new java.awt.Font("Tahoma", 0, 14));
        currentTime.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        alarmTime.setFont(new java.awt.Font("Tahoma", 0, 14));
        alarmTime.setForeground(new java.awt.Color(255, 0, 0));
        alarmTime.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        alarmTime.setText("8:00:00");
        alarmTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alarmTimeActionPerformed(evt);
            }
        });

        browseButton.setText("Browse");
        browseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonActionPerformed(evt);
            }
        });

        snoozeButton.setText("Snooze");
        snoozeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snoozeButtonActionPerformed(evt);
            }
        });

        stopButton.setText("Stop");
        stopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopButtonActionPerformed(evt);
            }
        });

        hourCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hour", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        minuteCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Minute", "00", "05", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55" }));

        todCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AM", "PM" }));

        setAlarmButton.setText("Set Alarm");
        setAlarmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setAlarmButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(hourCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(minuteCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(todCombo, 0, 56, Short.MAX_VALUE))
                    .addComponent(alarmTime, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(currentTime, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(musicText, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(browseButton, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(setAlarmButton)
                    .addComponent(stopButton, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(snoozeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(musicText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(browseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currentTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(alarmTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(snoozeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hourCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minuteCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(todCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setAlarmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void browseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseButtonActionPerformed
        logic.AlarmLogic.musicFileChooser();
    }//GEN-LAST:event_browseButtonActionPerformed

    private void alarmTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alarmTimeActionPerformed
        // Currently not using the alarmTime at all
    }//GEN-LAST:event_alarmTimeActionPerformed

    private void snoozeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snoozeButtonActionPerformed
        logic.AlarmLogic.snooze();
    }//GEN-LAST:event_snoozeButtonActionPerformed

    private void stopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopButtonActionPerformed
        logic.AlarmLogic.stop();
        logic.AlarmLogic.getAlarmTime();
    }//GEN-LAST:event_stopButtonActionPerformed

    private void setAlarmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setAlarmButtonActionPerformed
        logic.AlarmLogic.getAlarmTime();
    }//GEN-LAST:event_setAlarmButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField alarmTime;
    private javax.swing.JButton browseButton;
    public static javax.swing.JTextField currentTime;
    public static javax.swing.JComboBox hourCombo;
    public static javax.swing.JComboBox minuteCombo;
    public static javax.swing.JTextField musicText;
    private javax.swing.JButton setAlarmButton;
    private javax.swing.JButton snoozeButton;
    private javax.swing.JButton stopButton;
    public static javax.swing.JComboBox todCombo;
    // End of variables declaration//GEN-END:variables
}
