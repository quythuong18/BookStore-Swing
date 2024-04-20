/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.nhom08.bookstore;

/**
 *
 * @author Admin
 */
public class CashierFrame extends javax.swing.JFrame {

    /**
     * Creates new form CashierFrame
     */
    public CashierFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Header = new javax.swing.JPanel();
        lbl_userIcon = new javax.swing.JLabel();
        lbl_accountName = new javax.swing.JLabel();
        textFieldCustom1 = new com.nhom08.bookstore.GUI.TextFieldCustom();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 254, 251));
        setPreferredSize(new java.awt.Dimension(1280, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_Header.setBackground(new java.awt.Color(219, 235, 247));
        panel_Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_userIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_userIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user_filled.png"))); // NOI18N
        panel_Header.add(lbl_userIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 12, 40, 40));

        lbl_accountName.setFont(new java.awt.Font("Lexend SemiBold", 0, 20)); // NOI18N
        lbl_accountName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_accountName.setText("Account name");
        panel_Header.add(lbl_accountName, new org.netbeans.lib.awtextra.AbsoluteConstraints(1098, 18, -1, -1));
        panel_Header.add(textFieldCustom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 11, 338, 41));

        getContentPane().add(panel_Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(CashierFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CashierFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CashierFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CashierFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CashierFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl_accountName;
    private javax.swing.JLabel lbl_userIcon;
    private javax.swing.JPanel panel_Header;
    private com.nhom08.bookstore.GUI.TextFieldCustom textFieldCustom1;
    // End of variables declaration//GEN-END:variables
}
