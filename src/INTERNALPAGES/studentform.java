/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INTERNALPAGES;

import canonodesign.dashboards;
import static com.sun.webkit.perf.WCFontPerfLogger.reset;
import config.Dbconfiguration;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author canono
 */
public class studentform extends javax.swing.JFrame {

    /**
     * Creates new form studentform
     */
    public studentform() {
        initComponents();
    }
        public void close(){
            this.dispose();
        dashboards ds = new dashboards();
      ds.setVisible(true);
      
      USERPAGE up = new USERPAGE();
        ds.maindesktop.add(up).setVisible(true);
        }
    

    Color navcolor = new Color(0,153,255);
        Color headcolor = new Color(0,204,204);
        Color bodycolor = new Color(204,255,255);
        
        public String gender;
        public String action;
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        st_label = new javax.swing.JPanel();
        label = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        female = new javax.swing.JRadioButton();
        male = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        st_address = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        st_id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        mname = new javax.swing.JTextField();
        st_name = new javax.swing.JTextField();
        st_status = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        violation = new javax.swing.JComboBox<>();
        clear = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("STUDENT FORM");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 11, 280, 20);

        exit.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel2.add(exit);
        exit.setBounds(480, 0, 50, 40);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 531, 40));

        st_label.setBackground(new java.awt.Color(0, 153, 255));
        st_label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        st_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                st_labelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                st_labelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                st_labelMouseExited(evt);
            }
        });

        label.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setText("DONE");

        javax.swing.GroupLayout st_labelLayout = new javax.swing.GroupLayout(st_label);
        st_label.setLayout(st_labelLayout);
        st_labelLayout.setHorizontalGroup(
            st_labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
        );
        st_labelLayout.setVerticalGroup(
            st_labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        jPanel1.add(st_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 110, 30));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Student ID:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 100, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Father's Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 100, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Gender:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 100, -1));

        female.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        female.setText("FEMALE");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        jPanel1.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 70, 20));

        male.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        male.setText("MALE");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        jPanel1.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 70, 20));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Violation:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 100, -1));

        st_address.setColumns(20);
        st_address.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        st_address.setRows(5);
        jScrollPane1.setViewportView(st_address);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 190, 110));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("   Contact :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 110, -1));

        fname.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        fname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fname.setOpaque(false);
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 150, 20));

        st_id.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        st_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        st_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        st_id.setEnabled(false);
        st_id.setOpaque(false);
        jPanel1.add(st_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 150, 20));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Student Name:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 100, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Mother's Name:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 100, -1));

        contact.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        contact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contact.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        contact.setOpaque(false);
        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 150, 20));

        mname.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        mname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mname.setOpaque(false);
        jPanel1.add(mname, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 150, 20));

        st_name.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        st_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        st_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        st_name.setOpaque(false);
        jPanel1.add(st_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 150, 20));

        st_status.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        st_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married", " " }));
        jPanel1.add(st_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 150, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Address:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 70, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Status");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 100, -1));

        violation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(violation, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 150, -1));

        clear.setBackground(new java.awt.Color(204, 255, 255));
        clear.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 180, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void st_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st_labelMouseClicked
        if (action.equals("Add")){
             Dbconfiguration dbc = new Dbconfiguration();
        
           int result = 0;
            try {
                result = dbc.insertData("INSERT INTO tbl_student (st_name, st_address, st_status, st_gender, contact, mname, fname, violation) "
                        + "VALUES ('"+st_name.getText()+"', '"+st_address.getText()+"','"+st_status.getSelectedItem()+"','"+gender+"','"+contact.getText()+"', '"+mname.getText()+"', '"+fname.getText()+"', '"+violation.getSelectedItem()+"')");
            } catch (SQLException ex) {
                Logger.getLogger(studentform.class.getName()).log(Level.SEVERE, null, ex);
            }
        if(result == 1){
            JOptionPane.showMessageDialog(null, "Successfully Save!");
            
            close();
            } else {System.out.println("Saving Data Failed");}
        
        }else if (action.equals("Update")){
        
          Dbconfiguration dbc = new Dbconfiguration();
        int num = dbc.updateData("UPDATE tbl_student "
                + "SET st_name = '"+st_name.getText()+"', st_address='"+st_address.getText()+"', "
                        + "st_status ='"+st_status.getSelectedItem()+"', st_gender='"+gender+"', contact='"+contact.getText()+"', mname='"+mname.getText()+"', fname='"+fname.getText()+"', violation='"+violation.getSelectedItem()+"'  "
                                + "WHERE st_id = '"+st_id.getText()+"'");
        
        close ();
       
        if(num == 0){
           
        }else{
           JOptionPane.showMessageDialog(null, "Updated Successfully!");
           
           reset();
        }
         
         
        
        }
    }//GEN-LAST:event_st_labelMouseClicked

    private void st_labelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st_labelMouseEntered
        st_label.setBackground(bodycolor);
    }//GEN-LAST:event_st_labelMouseEntered

    private void st_labelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st_labelMouseExited
        st_label.setBackground(navcolor);
    }//GEN-LAST:event_st_labelMouseExited

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        male.setSelected(false);
        if(female.isSelected()){
            gender = "Female";
        }else{
            gender = null;
        }
    }//GEN-LAST:event_femaleActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
 close();
      
      
    }//GEN-LAST:event_exitMouseClicked

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        female.setSelected(false);
        if(male.isSelected()){
            gender = "Male";
        }else{
            gender = null;
        }
    }//GEN-LAST:event_maleActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        
        st_name.setText(null);
        st_address.setText(null);
        st_status.setSelectedItem(null);
        female.setSelected(false);
        male.setSelected(false);
        contact.setText(null);
        mname.setText(null);
        fname.setText(null);
        violation.setSelectedItem(null);
    }//GEN-LAST:event_clearActionPerformed

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
            java.util.logging.Logger.getLogger(studentform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    public javax.swing.JTextField contact;
    private javax.swing.JLabel exit;
    public javax.swing.JRadioButton female;
    public javax.swing.JTextField fname;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel label;
    public javax.swing.JRadioButton male;
    public javax.swing.JTextField mname;
    public javax.swing.JTextArea st_address;
    public javax.swing.JTextField st_id;
    public javax.swing.JPanel st_label;
    public javax.swing.JTextField st_name;
    public javax.swing.JComboBox<String> st_status;
    public javax.swing.JComboBox<String> violation;
    // End of variables declaration//GEN-END:variables
}
