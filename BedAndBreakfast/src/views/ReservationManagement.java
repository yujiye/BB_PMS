/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import DBCommands.ReservationDAO;
import classes.ErrorHandling;
import classes.Guest;
import classes.Reservation;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import javax.swing.JTable;

/**
 *
 * @author Aaron
 */
public class ReservationManagement extends javax.swing.JFrame {
        Reservation rs;
        ReservationDAO rc;
        private Date date1, date2;

    /**
     * Creates new form ReservationSearchModule
     */
    public ReservationManagement() {
        initComponents();
        rs = new Reservation();
        rc = new ReservationDAO();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelReservationManagement = new javax.swing.JPanel();
        jLabelReservationManagement = new javax.swing.JLabel();
        jPanelReservationInformation = new javax.swing.JPanel();
        jLabelCheckInDate = new javax.swing.JLabel();
        jLabeLCheckOutDate = new javax.swing.JLabel();
        jLabelRmNo = new javax.swing.JLabel();
        jLabelResvNo = new javax.swing.JLabel();
        jComboBoxRoomNumber = new javax.swing.JComboBox<String>();
        jCalendarComboBoxCheckInDate = new de.wannawork.jcalendar.JCalendarComboBox();
        jCalendarComboBoxCheckOutDate = new de.wannawork.jcalendar.JCalendarComboBox();
        jLabelReservationNumber = new javax.swing.JLabel();
        jTextFieldReservationNumber = new javax.swing.JTextField();
        jLabelStatus = new javax.swing.JLabel();
        jComboBoxReservationStatus = new javax.swing.JComboBox<String>();
        jTextFieldGuestNumber = new javax.swing.JTextField();
        jLabelGuestNumber = new javax.swing.JLabel();
        jTextFieldFirstName = new javax.swing.JTextField();
        jTextFieldLastName = new javax.swing.JTextField();
        jLabelLastName = new javax.swing.JLabel();
        jLabelFirstName = new javax.swing.JLabel();
        jButtonCheckIn = new javax.swing.JButton();
        jButtonCheckOut = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableReservationList = new javax.swing.JTable();
        jButtonSearch = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelReservationManagement.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelReservationManagement.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelReservationManagement.setText("Reservation Management ");

        jPanelReservationInformation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelCheckInDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCheckInDate.setText("Check-In-Date");

        jLabeLCheckOutDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabeLCheckOutDate.setText("Check-Out-Date");

        jLabelRmNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRmNo.setText("Room Number");

        jLabelResvNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelResvNo.setText("Reservation Search Fields");

        jLabelReservationNumber.setText("Reservation Number");

        jTextFieldReservationNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldReservationNumberActionPerformed(evt);
            }
        });

        jLabelStatus.setText("Status");

        jComboBoxReservationStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Reserved", "Checked In", "Checked Out", "Cancel", "No Show" }));

        jTextFieldGuestNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldGuestNumberActionPerformed(evt);
            }
        });

        jLabelGuestNumber.setText("Guest Number");

        jLabelLastName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelLastName.setText("Last");

        jLabelFirstName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelFirstName.setText("First");

        javax.swing.GroupLayout jPanelReservationInformationLayout = new javax.swing.GroupLayout(jPanelReservationInformation);
        jPanelReservationInformation.setLayout(jPanelReservationInformationLayout);
        jPanelReservationInformationLayout.setHorizontalGroup(
            jPanelReservationInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReservationInformationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelReservationInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelResvNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelReservationInformationLayout.createSequentialGroup()
                        .addGroup(jPanelReservationInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelReservationInformationLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanelReservationInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabeLCheckOutDate)
                                    .addComponent(jLabelCheckInDate, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelReservationInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCalendarComboBoxCheckOutDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCalendarComboBoxCheckInDate, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                                .addGap(0, 7, Short.MAX_VALUE))
                            .addGroup(jPanelReservationInformationLayout.createSequentialGroup()
                                .addGroup(jPanelReservationInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelReservationInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                                    .addComponent(jTextFieldLastName))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelReservationInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelRmNo)
                            .addComponent(jLabelStatus)
                            .addComponent(jLabelReservationNumber)
                            .addComponent(jLabelGuestNumber))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelReservationInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxRoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxReservationStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldReservationNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldGuestNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(107, 107, 107)))
                .addContainerGap())
        );
        jPanelReservationInformationLayout.setVerticalGroup(
            jPanelReservationInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelReservationInformationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelResvNo)
                .addGap(18, 18, 18)
                .addGroup(jPanelReservationInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelReservationInformationLayout.createSequentialGroup()
                        .addGroup(jPanelReservationInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelCheckInDate)
                            .addComponent(jCalendarComboBoxCheckInDate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanelReservationInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCalendarComboBoxCheckOutDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabeLCheckOutDate)))
                    .addGroup(jPanelReservationInformationLayout.createSequentialGroup()
                        .addGroup(jPanelReservationInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxRoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelRmNo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelReservationInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelStatus)
                            .addComponent(jComboBoxReservationStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelReservationInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLastName)
                    .addComponent(jLabelReservationNumber)
                    .addComponent(jTextFieldReservationNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelReservationInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFirstName)
                    .addComponent(jLabelGuestNumber)
                    .addComponent(jTextFieldGuestNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonCheckIn.setText("Check In");
        jButtonCheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCheckInActionPerformed(evt);
            }
        });

        jButtonCheckOut.setText("Check Out");

        jButtonCancel.setText("Cancel");

        jButtonExit.setText("Exit");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jScrollPane1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jScrollPane1PropertyChange(evt);
            }
        });

        jTableReservationList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Last Name", "First Name", "Check In Date", "Check Out Date", "Status", "Room"
            }
        ));
        jTableReservationList.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jTableReservationList);
        jTableReservationList.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        jButtonSearch.setText("Search");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jButtonClear.setText("Clear");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelReservationManagementLayout = new javax.swing.GroupLayout(jPanelReservationManagement);
        jPanelReservationManagement.setLayout(jPanelReservationManagementLayout);
        jPanelReservationManagementLayout.setHorizontalGroup(
            jPanelReservationManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelReservationManagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelReservationManagementLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelReservationManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelReservationInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelReservationManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelReservationManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButtonCheckOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCheckIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButtonSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1))
                .addContainerGap())
        );
        jPanelReservationManagementLayout.setVerticalGroup(
            jPanelReservationManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReservationManagementLayout.createSequentialGroup()
                .addComponent(jLabelReservationManagement)
                .addGroup(jPanelReservationManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelReservationManagementLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelReservationInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelReservationManagementLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jButtonSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonClear)))
                .addGap(8, 8, 8)
                .addGroup(jPanelReservationManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelReservationManagementLayout.createSequentialGroup()
                        .addComponent(jButtonCheckIn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCheckOut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExit)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelReservationManagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelReservationManagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldGuestNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldGuestNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldGuestNumberActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonCheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCheckInActionPerformed
        // TODO add your handling code here:
        rc.checkInReservation(rs);
    }//GEN-LAST:event_jButtonCheckInActionPerformed

    private void jTextFieldReservationNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldReservationNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldReservationNumberActionPerformed

    private void jScrollPane1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jScrollPane1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1PropertyChange

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        // TODO add your handling code here:
        ArrayList<String> searchCriteria = new ArrayList<>();
        getNewDate();
        DateFormat dataBaseFormat=new SimpleDateFormat("dd-MMM-yy");
        String inDate=dataBaseFormat.format(date1);      
        String outDate=dataBaseFormat.format(date2);
        //add search criteria to the search list
        searchCriteria.add(jTextFieldReservationNumber.getSelectedText());
        searchCriteria.add(jComboBoxRoomNumber.getSelectedItem().toString());
        searchCriteria.add(inDate);
        searchCriteria.add(outDate);
        searchCriteria.add(jTextFieldGuestNumber.getSelectedText());
        searchCriteria.add(jComboBoxReservationStatus.getSelectedItem().toString());
        searchCriteria.add(jTextFieldFirstName.getSelectedText());
        searchCriteria.add(jTextFieldLastName.getSelectedText());
        ArrayList<ArrayList<String>> reservations = 
                rc.searchReservationByResNo(searchCriteria);
        ArrayList<String> columnNames = new ArrayList<>();
        columnNames.add("Last Name");
        columnNames.add("First Name");
        columnNames.add("Check In Date");
        columnNames.add("Check Out Date");
        columnNames.add("Status");
        columnNames.add("Room");
//        jTableReservationList.add;
//        = new JTable(reservations.toArray(),columnNames.toArray());
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Guest guest = new Guest();
        Reservation res = new Reservation();
        rc.searchReservation(rs, guest);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReservationManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservationManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservationManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservationManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservationManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonCheckIn;
    private javax.swing.JButton jButtonCheckOut;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonSearch;
    private de.wannawork.jcalendar.JCalendarComboBox jCalendarComboBoxCheckInDate;
    private de.wannawork.jcalendar.JCalendarComboBox jCalendarComboBoxCheckOutDate;
    private javax.swing.JComboBox<String> jComboBoxReservationStatus;
    private javax.swing.JComboBox<String> jComboBoxRoomNumber;
    private javax.swing.JLabel jLabeLCheckOutDate;
    private javax.swing.JLabel jLabelCheckInDate;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelGuestNumber;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelReservationManagement;
    private javax.swing.JLabel jLabelReservationNumber;
    private javax.swing.JLabel jLabelResvNo;
    private javax.swing.JLabel jLabelRmNo;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JPanel jPanelReservationInformation;
    private javax.swing.JPanel jPanelReservationManagement;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableReservationList;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldGuestNumber;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldReservationNumber;
    // End of variables declaration//GEN-END:variables
    //create dates for checkin and checkout
    private void getNewDate(){       
    //Formating Date to mmm-dd-yyyy
     DateFormat format1=SimpleDateFormat.getDateInstance();     

    //Try Catch for Date Comparision
        try{
            //Setting Check In and Checkout Dates
            date1 = format1.parse(format1.format(jCalendarComboBoxCheckInDate.getCalendar()
                    .getTime()));
            date2 = format1.parse(format1.format(jCalendarComboBoxCheckOutDate.getCalendar()
                    .getTime()));
        }        
        catch(ParseException ex){
            //Temp Error Message
            ex.printStackTrace();
        }  
    }//end getNewDate()
}
