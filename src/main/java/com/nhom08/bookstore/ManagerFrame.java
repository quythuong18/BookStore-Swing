/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.nhom08.bookstore;


import com.nhom08.bookstore.GUI.FunctionalPanels.panel_accounts;
import com.nhom08.bookstore.GUI.FunctionalPanels.panel_books;
import com.nhom08.bookstore.GUI.FunctionalPanels.panel_employees;
import com.nhom08.bookstore.GUI.FunctionalPanels.panel_home;
import com.nhom08.bookstore.GUI.FunctionalPanels.panel_publishers;
import com.nhom08.bookstore.GUI.FunctionalPanels.panel_statistics;
import com.nhom08.bookstore.GUI.PanelCustom;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.swing.BoxLayout;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author quythuong
 */
public class ManagerFrame extends javax.swing.JFrame {

	/**
	 * Creates new form MainFrame
	 */
	public PanelCustom preTabBtn;
	public Color clickedButtonBackgroundColor = new Color(126, 152, 255);
	public Color sideBarBackgroundColor = new Color(149,189,255);
	public ManagerFrame() {
		initComponents();
		this.setSize(1280, 800);
		
		TabbedPane.addTab("Home", new panel_home());
		TabbedPane.addTab("Employees", new panel_employees());
		TabbedPane.addTab("Publishers", new panel_publishers());
		TabbedPane.addTab("Books", new panel_books());
		TabbedPane.addTab("Statistics", new panel_statistics());
		TabbedPane.addTab("Accounts", new panel_accounts());
		
		preTabBtn = panel_homeBtn;
		panel_homeBtn.setBackground(clickedButtonBackgroundColor);
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                panel_Sidebar = new com.nhom08.bookstore.GUI.PanelCustom();
                panel_homeBtn = new com.nhom08.bookstore.GUI.PanelCustom();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                panel_employeeBtn = new com.nhom08.bookstore.GUI.PanelCustom();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                panel_publisherBtn = new com.nhom08.bookstore.GUI.PanelCustom();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                panel_bookBtn = new com.nhom08.bookstore.GUI.PanelCustom();
                jLabel7 = new javax.swing.JLabel();
                jLabel8 = new javax.swing.JLabel();
                panel_statsBtn = new com.nhom08.bookstore.GUI.PanelCustom();
                jLabel9 = new javax.swing.JLabel();
                jLabel10 = new javax.swing.JLabel();
                panel_accountBtn = new com.nhom08.bookstore.GUI.PanelCustom();
                jLabel11 = new javax.swing.JLabel();
                jLabel12 = new javax.swing.JLabel();
                panel_logoutBtn = new com.nhom08.bookstore.GUI.PanelCustom();
                jLabel13 = new javax.swing.JLabel();
                jLabel14 = new javax.swing.JLabel();
                lbl_menuIcon1 = new javax.swing.JLabel();
                panel_Header = new javax.swing.JPanel();
                lbl_userIcon = new javax.swing.JLabel();
                lbl_accountName = new javax.swing.JLabel();
                textFieldCustom1 = new com.nhom08.bookstore.GUI.TextFieldCustom();
                TabbedPane = new javax.swing.JTabbedPane();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("Book Store");
                setBackground(new java.awt.Color(204, 204, 204));
                setResizable(false);
                setSize(new java.awt.Dimension(1280, 800));
                getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                panel_Sidebar.setBackground(new java.awt.Color(149, 189, 255));
                panel_Sidebar.setRoundBottomRight(20);
                panel_Sidebar.setRoundTopRight(20);
                panel_Sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                panel_homeBtn.setBackground(new java.awt.Color(149, 189, 255));
                panel_homeBtn.setRoundBottomLeft(20);
                panel_homeBtn.setRoundBottomRight(20);
                panel_homeBtn.setRoundTopLeft(20);
                panel_homeBtn.setRoundTopRight(20);
                panel_homeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                panel_homeBtnMouseClicked(evt);
                        }
                });
                panel_homeBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home.png"))); // NOI18N
                panel_homeBtn.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 40));

                jLabel2.setFont(new java.awt.Font("Lexend SemiBold", 0, 20)); // NOI18N
                jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel2.setText("Home");
                panel_homeBtn.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 110, 30));

                panel_Sidebar.add(panel_homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 106, 198, 65));

                panel_employeeBtn.setBackground(new java.awt.Color(149, 189, 255));
                panel_employeeBtn.setRoundBottomLeft(20);
                panel_employeeBtn.setRoundBottomRight(20);
                panel_employeeBtn.setRoundTopLeft(20);
                panel_employeeBtn.setRoundTopRight(20);
                panel_employeeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                panel_employeeBtnMouseClicked(evt);
                        }
                });
                panel_employeeBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/employee.png"))); // NOI18N
                panel_employeeBtn.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 40));

                jLabel4.setFont(new java.awt.Font("Lexend SemiBold", 0, 20)); // NOI18N
                jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel4.setText("Employees");
                panel_employeeBtn.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 110, 30));

                panel_Sidebar.add(panel_employeeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 204, 198, 65));

                panel_publisherBtn.setBackground(new java.awt.Color(149, 189, 255));
                panel_publisherBtn.setRoundBottomLeft(20);
                panel_publisherBtn.setRoundBottomRight(20);
                panel_publisherBtn.setRoundTopLeft(20);
                panel_publisherBtn.setRoundTopRight(20);
                panel_publisherBtn.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                panel_publisherBtnMouseClicked(evt);
                        }
                });
                panel_publisherBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/publisher.png"))); // NOI18N
                panel_publisherBtn.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 40));

                jLabel6.setFont(new java.awt.Font("Lexend SemiBold", 0, 20)); // NOI18N
                jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel6.setText("Publishers");
                panel_publisherBtn.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 110, 30));

                panel_Sidebar.add(panel_publisherBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 300, 198, 65));

                panel_bookBtn.setBackground(new java.awt.Color(149, 189, 255));
                panel_bookBtn.setRoundBottomLeft(20);
                panel_bookBtn.setRoundBottomRight(20);
                panel_bookBtn.setRoundTopLeft(20);
                panel_bookBtn.setRoundTopRight(20);
                panel_bookBtn.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                panel_bookBtnMouseClicked(evt);
                        }
                });
                panel_bookBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/books.png"))); // NOI18N
                panel_bookBtn.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 40));

                jLabel8.setFont(new java.awt.Font("Lexend SemiBold", 0, 20)); // NOI18N
                jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel8.setText("Books");
                panel_bookBtn.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 110, 30));

                panel_Sidebar.add(panel_bookBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 396, 198, 65));

                panel_statsBtn.setBackground(new java.awt.Color(149, 189, 255));
                panel_statsBtn.setRoundBottomLeft(20);
                panel_statsBtn.setRoundBottomRight(20);
                panel_statsBtn.setRoundTopLeft(20);
                panel_statsBtn.setRoundTopRight(20);
                panel_statsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                panel_statsBtnMouseClicked(evt);
                        }
                });
                panel_statsBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/stats.png"))); // NOI18N
                panel_statsBtn.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 40));

                jLabel10.setFont(new java.awt.Font("Lexend SemiBold", 0, 20)); // NOI18N
                jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel10.setText("Statistics");
                panel_statsBtn.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 110, 30));

                panel_Sidebar.add(panel_statsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 492, 198, 65));

                panel_accountBtn.setBackground(new java.awt.Color(149, 189, 255));
                panel_accountBtn.setRoundBottomLeft(20);
                panel_accountBtn.setRoundBottomRight(20);
                panel_accountBtn.setRoundTopLeft(20);
                panel_accountBtn.setRoundTopRight(20);
                panel_accountBtn.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                panel_accountBtnMouseClicked(evt);
                        }
                });
                panel_accountBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user_filled.png"))); // NOI18N
                panel_accountBtn.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 40));

                jLabel12.setFont(new java.awt.Font("Lexend SemiBold", 0, 20)); // NOI18N
                jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel12.setText("Accounts");
                panel_accountBtn.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 110, 30));

                panel_Sidebar.add(panel_accountBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 588, 198, 65));

                panel_logoutBtn.setBackground(new java.awt.Color(149, 189, 255));
                panel_logoutBtn.setRoundBottomLeft(20);
                panel_logoutBtn.setRoundBottomRight(20);
                panel_logoutBtn.setRoundTopLeft(20);
                panel_logoutBtn.setRoundTopRight(20);
                panel_logoutBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sign_out.png"))); // NOI18N
                panel_logoutBtn.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 40));

                jLabel14.setFont(new java.awt.Font("Lexend SemiBold", 0, 20)); // NOI18N
                jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel14.setText("Logout!");
                panel_logoutBtn.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 110, 30));

                panel_Sidebar.add(panel_logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 684, 198, 65));

                lbl_menuIcon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lbl_menuIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/menu-burger.png"))); // NOI18N
                panel_Sidebar.add(lbl_menuIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 21, -1, -1));

                getContentPane().add(panel_Sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 224, 800));

                panel_Header.setBackground(new java.awt.Color(219, 235, 247));
                panel_Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                lbl_userIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lbl_userIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user_filled.png"))); // NOI18N
                panel_Header.add(lbl_userIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 12, 40, 40));

                lbl_accountName.setFont(new java.awt.Font("Lexend SemiBold", 0, 20)); // NOI18N
                lbl_accountName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lbl_accountName.setText("Account name");
                panel_Header.add(lbl_accountName, new org.netbeans.lib.awtextra.AbsoluteConstraints(1098, 14, 148, 25));
                panel_Header.add(textFieldCustom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 11, 338, 41));

                getContentPane().add(panel_Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 60));
                panel_Header.getAccessibleContext().setAccessibleName("");

                TabbedPane.setBackground(new java.awt.Color(0, 204, 0));
                getContentPane().add(TabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 30, 1056, 770));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void panel_homeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_homeBtnMouseClicked
                // TODO add your handling code here:
		TabbedPane.setSelectedIndex(0);
		if(panel_homeBtn.getBackground().equals(clickedButtonBackgroundColor))
			return;
		panel_homeBtn.setBackground(clickedButtonBackgroundColor);
		preTabBtn.setBackground(sideBarBackgroundColor);
		preTabBtn = panel_homeBtn;
        }//GEN-LAST:event_panel_homeBtnMouseClicked

        private void panel_employeeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_employeeBtnMouseClicked
                // TODO add your handling code here:
		TabbedPane.setSelectedIndex(1);
		if(panel_employeeBtn.getBackground().equals(clickedButtonBackgroundColor))
			return;
		panel_employeeBtn.setBackground(clickedButtonBackgroundColor);
		preTabBtn.setBackground(sideBarBackgroundColor);
		preTabBtn = panel_employeeBtn;
        }//GEN-LAST:event_panel_employeeBtnMouseClicked

        private void panel_publisherBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_publisherBtnMouseClicked
                // TODO add your handling code here:
		TabbedPane.setSelectedIndex(2);
		if(panel_publisherBtn.getBackground().equals(clickedButtonBackgroundColor))
			return;
		panel_publisherBtn.setBackground(clickedButtonBackgroundColor);
		preTabBtn.setBackground(sideBarBackgroundColor);
		preTabBtn = panel_publisherBtn;
        }//GEN-LAST:event_panel_publisherBtnMouseClicked

        private void panel_bookBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_bookBtnMouseClicked
                // TODO add your handling code here:
		TabbedPane.setSelectedIndex(3);
		if(panel_bookBtn.getBackground().equals(clickedButtonBackgroundColor))
			return;
		panel_bookBtn.setBackground(clickedButtonBackgroundColor);
		preTabBtn.setBackground(sideBarBackgroundColor);
		preTabBtn = panel_bookBtn;
        }//GEN-LAST:event_panel_bookBtnMouseClicked

        private void panel_statsBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_statsBtnMouseClicked
                // TODO add your handling code here:
		TabbedPane.setSelectedIndex(4);
		if(panel_statsBtn.getBackground().equals(clickedButtonBackgroundColor))
			return;
		panel_statsBtn.setBackground(clickedButtonBackgroundColor);
		preTabBtn.setBackground(sideBarBackgroundColor);
		preTabBtn = panel_statsBtn;
        }//GEN-LAST:event_panel_statsBtnMouseClicked

        private void panel_accountBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_accountBtnMouseClicked
                // TODO add your handling code here:
		TabbedPane.setSelectedIndex(5);
		if(panel_accountBtn.getBackground().equals(clickedButtonBackgroundColor))
			return;
		panel_accountBtn.setBackground(clickedButtonBackgroundColor);
		preTabBtn.setBackground(sideBarBackgroundColor);
		preTabBtn = panel_accountBtn;
		
        }//GEN-LAST:event_panel_accountBtnMouseClicked

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
			java.util.logging.Logger.getLogger(ManagerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ManagerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ManagerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ManagerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ManagerFrame().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JTabbedPane TabbedPane;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel12;
        private javax.swing.JLabel jLabel13;
        private javax.swing.JLabel jLabel14;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JLabel lbl_accountName;
        private javax.swing.JLabel lbl_menuIcon1;
        private javax.swing.JLabel lbl_userIcon;
        private javax.swing.JPanel panel_Header;
        private com.nhom08.bookstore.GUI.PanelCustom panel_Sidebar;
        private com.nhom08.bookstore.GUI.PanelCustom panel_accountBtn;
        private com.nhom08.bookstore.GUI.PanelCustom panel_bookBtn;
        private com.nhom08.bookstore.GUI.PanelCustom panel_employeeBtn;
        private com.nhom08.bookstore.GUI.PanelCustom panel_homeBtn;
        private com.nhom08.bookstore.GUI.PanelCustom panel_logoutBtn;
        private com.nhom08.bookstore.GUI.PanelCustom panel_publisherBtn;
        private com.nhom08.bookstore.GUI.PanelCustom panel_statsBtn;
        private com.nhom08.bookstore.GUI.TextFieldCustom textFieldCustom1;
        // End of variables declaration//GEN-END:variables
}
