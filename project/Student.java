/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Chinnu
 */
public class Student extends javax.swing.JFrame {
Connection connect=null;
    ResultSet rst=null;
    PreparedStatement pst=null;
    /**
     * Creates new form Student
     */
    public Student() {
        initComponents();
        connect=(Connection)Course.connDB();
        this.setBounds(300, 100, 710, 500);
    }
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Jokerman", 1, 24)); // NOI18N
        jLabel1.setText("STUDENT INFORMATION");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 10, 380, 40);

        jLabel2.setFont(new java.awt.Font("Bodoni MT Black", 0, 14)); // NOI18N
        jLabel2.setText("Student_id");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(211, 60, 80, 29);

        jLabel3.setFont(new java.awt.Font("Bodoni MT Black", 0, 14)); // NOI18N
        jLabel3.setText("Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(211, 101, 80, 24);

        jLabel4.setFont(new java.awt.Font("Bodoni MT Black", 0, 14)); // NOI18N
        jLabel4.setText("Sem");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(211, 141, 80, 22);

        jLabel5.setFont(new java.awt.Font("Bodoni MT Black", 0, 14)); // NOI18N
        jLabel5.setText("Branch_id");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(211, 175, 80, 24);

        jLabel6.setFont(new java.awt.Font("Bodoni MT Black", 0, 14)); // NOI18N
        jLabel6.setText("Reciept_no");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(211, 210, 80, 22);

        jLabel7.setFont(new java.awt.Font("Bodoni MT Black", 0, 14)); // NOI18N
        jLabel7.setText("Mobile");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(211, 245, 80, 26);

        jLabel8.setFont(new java.awt.Font("Bodoni MT Black", 0, 14)); // NOI18N
        jLabel8.setText("Address");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(211, 292, 80, 17);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(308, 60, 105, 29);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(308, 100, 105, 28);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(308, 141, 105, 23);

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextField4);
        jTextField4.setBounds(308, 176, 105, 23);

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextField5);
        jTextField5.setBounds(308, 210, 105, 23);

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextField6);
        jTextField6.setBounds(308, 247, 105, 23);

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextField7);
        jTextField7.setBounds(308, 289, 105, 23);

        jButton1.setFont(new java.awt.Font("Ravie", 0, 14)); // NOI18N
        jButton1.setText("INSERT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(50, 350, 110, 29);

        jButton2.setFont(new java.awt.Font("Ravie", 0, 14)); // NOI18N
        jButton2.setText("DELETE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(220, 350, 110, 29);

        jButton3.setFont(new java.awt.Font("Ravie", 0, 14)); // NOI18N
        jButton3.setText("UPDATE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(380, 350, 110, 29);

        jButton4.setFont(new java.awt.Font("Ravie", 0, 14)); // NOI18N
        jButton4.setText("DISPLAY");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(510, 350, 120, 29);

        jButton5.setFont(new java.awt.Font("Ravie", 0, 14)); // NOI18N
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(10, 10, 80, 30);

        jButton6.setFont(new java.awt.Font("Ravie", 0, 14)); // NOI18N
        jButton6.setText("DISPLAY RECORDS");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(250, 410, 203, 29);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/digital-wallpaper-1.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(-190, -90, 900, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try {
Statement s=connect.createStatement();
String sql = "insert into Student values('"+jTextField1.getText()+"','"+jTextField2.getText()+"','"+jTextField3.getText()+"','"+jTextField4.getText()+"','"+jTextField5.getText()+"','"+jTextField6.getText()+"','"+jTextField7.getText()+"')";
s.executeUpdate(sql);
JOptionPane.showMessageDialog(null, "Success !");
jTextField1.setText(" ");
jTextField2.setText(" ");
jTextField3.setText(" ");
jTextField4.setText(" ");
jTextField5.setText(" ");
jTextField6.setText(" ");
jTextField7.setText(" ");

}
catch (HeadlessException | SQLException e) {
System.out.println("errorrr");
JOptionPane.showMessageDialog(null," Enter the correct values");
}
    
            // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
try
{
    String sql1="delete from Enters where student_id='"+jTextField1.getText()+"'";
Statement s1=connect.createStatement();
s1.executeUpdate(sql1);
String sql="delete from Student where student_id='"+jTextField1.getText()+"'";
Statement s=connect.createStatement();
s.executeUpdate(sql);
JOptionPane.showMessageDialog(null," Student Records Deleted Succssfully... ");
jTextField1.setText("");
jTextField2.setText("");
jTextField3.setText("");
jTextField4.setText("");
jTextField5.setText("");
jTextField6.setText("");
jTextField7.setText("");
jTextField1.requestFocusInWindow();
}
catch(Exception ee)
{
    JOptionPane.showMessageDialog(null,"Enter the values correctly");
}// TODO add your handling code here:
         // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
try
{
String sql="update Student set name='"+jTextField2.getText()+"',sem='"+jTextField3.getText()+"',branch_id='"+jTextField4.getText()+"',receipt_no='"+jTextField5.getText()+"',mobile='"+jTextField6.getText()+"',address='"+jTextField7.getText()+"' where student_id='"+jTextField1.getText()+"'";
Statement s=connect.createStatement();
s.executeUpdate(sql);
JOptionPane.showMessageDialog(null," Student Records UPdated Succssfully... ");
/*jTextField1.setText("");
jTextField2.setText("");
jTextField3.setText("");
jTextField4.setText("");
jTextField5.setText("");
jTextField6.setText("");
jTextField7.setText("");*/
jTextField1.requestFocusInWindow();
}
catch(Exception ee)
{
JOptionPane.showMessageDialog(null," Erro="+ee);
}        // TODO add your handling code here:
         // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
try
{
String sql="select * from Student where student_id='"+jTextField1.getText()+"'";
Statement s=connect.createStatement();
rst=s.executeQuery(sql);
if(rst.next()==false)
{
JOptionPane.showMessageDialog(null," No Such Records Invalid sid");
jTextField1.setText("");
jTextField1.requestFocusInWindow();
}
else
{
jTextField2.setText(rst.getString(2));
jTextField3.setText(rst.getString(3));
jTextField4.setText(rst.getString(4));
jTextField5.setText(rst.getString(5));
jTextField6.setText(rst.getString(6));
jTextField7.setText(rst.getString(7));
}
}
catch(Exception ee)
{
}        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
setVisible(false);
Menu home=new Menu();
home.setVisible(true);// TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
 tablemysql frame = new tablemysql();
                frame.pack();
        frame.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}