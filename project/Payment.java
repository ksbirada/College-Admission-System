/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Chinnu
 */
public class Payment extends javax.swing.JFrame {
    Connection connect=null;
    ResultSet rst=null;
    PreparedStatement pst=null;

    /**
     * Creates new form Payment
     */
    public Payment() {
        initComponents();
        connect=(Connection)Course.connDB();
        this.setBounds(300, 100, 700, 420);
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
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Jokerman", 0, 24)); // NOI18N
        jLabel1.setText("PAYMENT   INFORMATION");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 20, 360, 37);

        jLabel2.setFont(new java.awt.Font("Bodoni MT Black", 0, 14)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(179, 78, 107, 31);

        jLabel3.setFont(new java.awt.Font("Bodoni MT Black", 0, 14)); // NOI18N
        jLabel3.setText("Receipt_no");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(179, 127, 107, 32);

        jLabel4.setFont(new java.awt.Font("Bodoni MT Black", 0, 14)); // NOI18N
        jLabel4.setText("Tution fees");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(179, 177, 107, 30);

        jLabel5.setFont(new java.awt.Font("Bodoni MT Black", 0, 14)); // NOI18N
        jLabel5.setText("Date of reciept");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(179, 225, 107, 28);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(304, 77, 204, 31);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(304, 131, 204, 23);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextField3);
        jTextField3.setBounds(304, 180, 204, 23);

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(304, 225, 204, 28);

        jButton1.setFont(new java.awt.Font("Ravie", 0, 14)); // NOI18N
        jButton1.setText("INSERT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(33, 279, 101, 29);

        jButton2.setFont(new java.awt.Font("Ravie", 0, 14)); // NOI18N
        jButton2.setText("DELETE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(187, 279, 103, 29);

        jButton3.setFont(new java.awt.Font("Ravie", 0, 14)); // NOI18N
        jButton3.setText("UPDATE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(338, 279, 105, 29);

        jButton4.setFont(new java.awt.Font("Ravie", 0, 14)); // NOI18N
        jButton4.setText("DISPLAY");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(507, 279, 111, 29);

        jButton5.setFont(new java.awt.Font("Ravie", 0, 11)); // NOI18N
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(10, 13, 67, 23);

        jButton6.setFont(new java.awt.Font("Ravie", 0, 14)); // NOI18N
        jButton6.setText("DISPLAY RECORDS");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(251, 336, 203, 29);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/digital-wallpaper-1.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-170, 0, 880, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try {
Statement s=connect.createStatement();
String sql = "insert into Payment values('"+jTextField1.getText()+"','"+jTextField2.getText()+"','"+jTextField3.getText()+"','"+jTextField4.getText()+"')";
s.executeUpdate(sql);
JOptionPane.showMessageDialog(null, "Success !");
jTextField1.setText(" ");
jTextField2.setText(" ");
jTextField3.setText(" ");
jTextField4.setText(" ");

}
catch (HeadlessException | SQLException e) {
System.out.println("errorrr");
}
    
            // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
try
{
String sql="delete from Payment where receipt_no='"+jTextField2.getText()+"'";
Statement s=connect.createStatement();
s.executeUpdate(sql);
JOptionPane.showMessageDialog(null," Payment Records Deleted Succssfully... ");
jTextField1.setText("");
jTextField2.setText("");
jTextField3.setText("");
jTextField4.setText("");
jTextField2.requestFocusInWindow();
}
catch(Exception ee)
{
}// TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
try
{
String sql="update Payment set name='"+jTextField1.getText()+"',tution_fees='"+jTextField3.getText()+"',date_of_receipt='"+jTextField4.getText()+"' where receipt_no='"+jTextField2.getText()+"'";
Statement s=connect.createStatement();
s.executeUpdate(sql);
JOptionPane.showMessageDialog(null," Payment Records UPdated Succssfully... ");
jTextField1.setText("");
jTextField2.setText("");
jTextField3.setText("");
jTextField4.setText("");
jTextField2.requestFocusInWindow();
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
String sql="select * from Payment where receipt_no='"+jTextField2.getText()+"'";
Statement s=connect.createStatement();
rst=s.executeQuery(sql);
if(rst.next()==false)
{
JOptionPane.showMessageDialog(null," No Such Records Invalid Pid");
jTextField2.setText("");
jTextField2.requestFocusInWindow();
}
else
{
jTextField1.setText(rst.getString(1));
jTextField3.setText(rst.getString(3));
jTextField4.setText(rst.getString(4));
}
}
catch(Exception ee)
{
}    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
setVisible(false);
Menu home=new Menu();
home.setVisible(true);// TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
tablemysql3 frame = new tablemysql3();
        frame.pack();
        frame.setVisible(true);        // TODO add your handling code here:
         // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
