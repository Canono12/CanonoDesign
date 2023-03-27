    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INTERNALPAGES;

import canonodesign.loginform;
import static com.sun.webkit.perf.WCFontPerfLogger.reset;
import config.Dbconfiguration;
import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import config.Dbconnector;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author canono
 */
public class USERPAGE extends javax.swing.JInternalFrame {

    /**
     * Creates new form USERPAGE
     */
    public USERPAGE() {
        initComponents();
        
       
 
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
        sgen.setOpaque(false);
        sgen.setBackground(new Color (0,0,0,0));
        
        
        
    }
   
    
    
    
    
    
    public void displayData(){
       
        try{
       
            Dbconfiguration dbc = new Dbconfiguration();
            ResultSet rs = dbc.getData("SELECT * FROM tbl_student");
            table.setModel(DbUtils.resultSetToTableModel(rs));
       
        }catch(SQLException ex){
            System.out.println("Error Message: "+ex);
       
        }
    }
    
    
     public void fillTable()throws SQLException{
         
       try{  
         Dbconfiguration dbc = new Dbconfiguration();
         ResultSet rs = dbc.getData("SELECT*FROM tbl_student");
         table.setModel(DbUtils.resultSetToTableModel(rs));
         
     }catch(SQLException ex){
}
     }
        Color navcolor = new Color(0,153,255);
        Color headcolor = new Color(0,204,204);
        Color bodycolor = new Color(204,255,255);

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        sgen = new javax.swing.JTextField();
        jlabel = new javax.swing.JTextField();
        sname = new javax.swing.JTextField();
        sadd = new javax.swing.JTextField();
        sstat = new javax.swing.JTextField();
        insert = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        ref = new javax.swing.JButton();
        add = new javax.swing.JButton();
        edit = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("STUDENTS");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 1, 280, 40);

        jPanel4.setBackground(new java.awt.Color(0, 153, 255));
        jPanel4.setLayout(null);
        jPanel2.add(jPanel4);
        jPanel4.setBounds(360, 0, 140, 50);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 531, 40));

        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 310, 240));

        sgen.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        sgen.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sgen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        sgen.setOpaque(false);
        sgen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sgenActionPerformed(evt);
            }
        });
        jPanel1.add(sgen, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 190, 30));

        jlabel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jlabel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jlabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jlabel.setOpaque(false);
        jlabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlabelActionPerformed(evt);
            }
        });
        jPanel1.add(jlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 190, 30));

        sname.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        sname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        sname.setOpaque(false);
        sname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snameActionPerformed(evt);
            }
        });
        jPanel1.add(sname, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 190, 30));

        sadd.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        sadd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sadd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        sadd.setOpaque(false);
        sadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saddActionPerformed(evt);
            }
        });
        jPanel1.add(sadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 190, 30));

        sstat.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        sstat.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sstat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        sstat.setOpaque(false);
        sstat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sstatActionPerformed(evt);
            }
        });
        jPanel1.add(sstat, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 190, 30));

        insert.setText("Insert");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });
        jPanel1.add(insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, -1, -1));

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, -1));

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, -1, -1));

        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 80, 20));

        ref.setText("REFRESH");
        ref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refActionPerformed(evt);
            }
        });
        jPanel1.add(ref, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 100, 20));

        add.setText("ADD");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 80, 20));

        edit.setText("EDIT");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        jPanel1.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 80, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int rowIndex = table.getSelectedRow();
       if(rowIndex < 0){
           JOptionPane.showMessageDialog(null, "Please select a data first");
       }else{
            TableModel model = table.getModel();
            Object value = model.getValueAt(rowIndex, 0);
            String id = value.toString();
             int a=JOptionPane.showConfirmDialog(null,"Are you sure?");  
                    if(a==JOptionPane.YES_OPTION){  
                            Dbconfiguration dbc = new Dbconfiguration();
                            dbc.deleteData(Integer.parseInt(id));
                            displayData();
                            reset();
                    }    
       }
    }//GEN-LAST:event_deleteActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
      jlabel.setText(null);
      sname.setText(null);
      sadd.setText(null);
      sstat.setText(null);
      sgen.setText(null);
    }//GEN-LAST:event_clearActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        Dbconfiguration dbc = new Dbconfiguration();
        try {
            dbc.insertData("INSERT INTO tbl_student (st_name, st_address, st_status, st_gender) "
                    + "VALUES ('"+sname.getText()+"', '"+sadd.getText()+"','"+sstat.getText()+"','"+sgen.getText()+"')");
        } catch (SQLException ex) {
            Logger.getLogger(USERPAGE.class.getName()).log(Level.SEVERE, null, ex);
        }
        displayData();
        reset();
    }//GEN-LAST:event_insertActionPerformed

    private void sstatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sstatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sstatActionPerformed

    private void saddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saddActionPerformed

    private void snameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_snameActionPerformed

    private void jlabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jlabelActionPerformed

    private void refActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refActionPerformed
        
        
        try {
            fillTable();
        } catch (SQLException ex) {
            Logger.getLogger(USERPAGE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_refActionPerformed

    private void sgenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sgenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sgenActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
       Dbconfiguration dbc = new Dbconfiguration();
        int num = dbc.updateData("UPDATE tbl_student "
                + "SET st_name = '"+sname.getText()+"', st_address='"+sadd.getText()+"', "
                        + "st_status ='"+sstat.getText()+"', st_gender='"+sgen.getText()+"'  "
                                + "WHERE st_id = '"+jlabel.getText()+"'");
       
        if(num == 0){
           
        }else{
           JOptionPane.showMessageDialog(null, "Updated Successfully!");
           displayData();
           reset();
        }
    }//GEN-LAST:event_updateActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int rowIndex = table.getSelectedRow();
        if(rowIndex < 0){
        
        }else{
            TableModel model = table.getModel();
            jlabel.setText(""+model.getValueAt(rowIndex, 0));
             sname.setText(""+model.getValueAt(rowIndex, 1));
              sadd.setText(""+model.getValueAt(rowIndex, 2));
               sstat.setText(""+model.getValueAt(rowIndex, 3));
                sgen.setText(""+model.getValueAt(rowIndex, 4));
            
        }
    }//GEN-LAST:event_tableMouseClicked

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editActionPerformed

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
       studentform up = new studentform();
       up.setVisible(true);
      JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        mainFrame.dispose();
      
        
    }//GEN-LAST:event_addMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jlabel;
    private javax.swing.JButton ref;
    private javax.swing.JTextField sadd;
    private javax.swing.JTextField sgen;
    private javax.swing.JTextField sname;
    private javax.swing.JTextField sstat;
    private javax.swing.JTable table;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

   
}
