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
public class studentPage extends javax.swing.JInternalFrame {

    /**
     * Creates new form USERPAGE
     */
    public studentPage() {
        initComponents();
        
       
 
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
        
        
        
    }
   
    
    
    
    
    
    public void displayData(){
       
        try{
       
            Dbconfiguration dbc = new Dbconfiguration();
            ResultSet rs = dbc.getData("SELECT * FROM tbl_student");
            table.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
       
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 510, 240));

        delete.setBackground(new java.awt.Color(0, 153, 255));
        delete.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 100, 30));

        ref.setBackground(new java.awt.Color(0, 153, 255));
        ref.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        ref.setText("REFRESH");
        ref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refActionPerformed(evt);
            }
        });
        jPanel1.add(ref, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 100, 30));

        add.setBackground(new java.awt.Color(0, 153, 255));
        add.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
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
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 100, 30));

        edit.setBackground(new java.awt.Color(0, 153, 255));
        edit.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        edit.setText("EDIT");
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
        });
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        jPanel1.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 100, 30));

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
                            int st_id =Integer.parseInt(id);
                            dbc.deleteData(st_id,"tbl_student", "st_id");
                            displayData();
                           
                    }    
       }
    }//GEN-LAST:event_deleteActionPerformed

    private void refActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refActionPerformed
        
        
        try {
            fillTable();
        } catch (SQLException ex) {
            Logger.getLogger(studentPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_refActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
       
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
        up.action = "Add";
        up.label.setText("SAVE");
      
        
    }//GEN-LAST:event_addMouseClicked

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
            int rowIndex = table.getSelectedRow();
        if(rowIndex < 0){
            JOptionPane.showMessageDialog(null,"Please Select an Item!");
        
        }else{
            TableModel model = table.getModel();
            studentform stf = new studentform();
            stf.st_id.setText(""+model.getValueAt(rowIndex, 0));
            stf.st_name.setText(""+model.getValueAt(rowIndex, 1));
            stf.st_address.setText(model.getValueAt(rowIndex, 2).toString());
            stf.st_status.setSelectedItem(model.getValueAt(rowIndex, 3).toString());
            
            
            
            stf.gender = model.getValueAt(rowIndex, 4).toString();
            
            String gend = model.getValueAt(rowIndex, 4).toString();
            if(gend.equals("MALE")){
                stf.male.setSelected(true);
            }
            if(gend.equals("FEMALE")){
                stf.female.setSelected(true);
            
            }
             if(gend.equals("male")){
                stf.male.setSelected(true);
            }
            if(gend.equals("female")){
                stf.female.setSelected(true);
            
            }
             if(gend.equals("Male")){
                stf.male.setSelected(true);
            }
            if(gend.equals("Female")){
                stf.female.setSelected(true);
            
            }
            
            stf.contact.setText(model.getValueAt(rowIndex, 5).toString());
            stf.mname.setText(""+model.getValueAt(rowIndex, 6));
            stf.fname.setText(""+model.getValueAt(rowIndex, 7));
            stf.violation.setSelectedItem(model.getValueAt(rowIndex, 8).toString());
            stf.setVisible(true);
            stf.action = "Update";
            stf.label.setText("UPDATE");
            JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
             mainFrame.dispose();
            
        }
    }//GEN-LAST:event_editMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton ref;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

   
}
