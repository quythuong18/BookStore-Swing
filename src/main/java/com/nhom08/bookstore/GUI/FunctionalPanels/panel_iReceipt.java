/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.nhom08.bookstore.GUI.FunctionalPanels;

/**
 *
 * @author quythuong
 */
public class panel_iReceipt extends javax.swing.JPanel {

	/**
	 * Creates new form panel_iRecept
	 */
	public panel_iReceipt() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        panelCustom2 = new Custom.PanelCustom();
        buttonCustom2 = new Custom.ButtonCustom();
        buttonCustom3 = new Custom.ButtonCustom();
        buttonCustom4 = new Custom.ButtonCustom();
        panelCustom3 = new Custom.PanelCustom();
        panelCustom4 = new Custom.PanelCustom();
        jPanel1 = new javax.swing.JPanel();
        textFieldCustom3 = new com.nhom08.bookstore.GUI.TextFieldCustom();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        textFieldCustom4 = new com.nhom08.bookstore.GUI.TextFieldCustom();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        textFieldCustom5 = new com.nhom08.bookstore.GUI.TextFieldCustom();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        textFieldCustom6 = new com.nhom08.bookstore.GUI.TextFieldCustom();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        textFieldCustom7 = new com.nhom08.bookstore.GUI.TextFieldCustom();
        jLabel8 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        textFieldCustom8 = new com.nhom08.bookstore.GUI.TextFieldCustom();
        jLabel9 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        textFieldCustom9 = new com.nhom08.bookstore.GUI.TextFieldCustom();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 254, 251));
        setPreferredSize(new java.awt.Dimension(1056, 740));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Lexend", 0, 30)); // NOI18N
        jLabel2.setText("I-Receipts Management");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 25, -1, -1));

        panelCustom2.setPreferredSize(new java.awt.Dimension(695, 68));
        panelCustom2.setRoundBottomLeft(10);
        panelCustom2.setRoundBottomRigt(10);
        panelCustom2.setRoundTopLeft(10);
        panelCustom2.setRoundTopRigt(10);
        panelCustom2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonCustom2.setBackground(new java.awt.Color(217, 217, 217));
        buttonCustom2.setBorder(null);
        buttonCustom2.setText("Add");
        buttonCustom2.setBorderColor(new java.awt.Color(217, 217, 217));
        buttonCustom2.setFont(new java.awt.Font("Lexend", 0, 24)); // NOI18N
        buttonCustom2.setPreferredSize(new java.awt.Dimension(160, 42));
        buttonCustom2.setRadius(20);
        buttonCustom2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCustom2ActionPerformed(evt);
            }
        });
        panelCustom2.add(buttonCustom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 14, -1, -1));

        buttonCustom3.setBackground(new java.awt.Color(217, 217, 217));
        buttonCustom3.setBorder(null);
        buttonCustom3.setText("Edit");
        buttonCustom3.setBorderColor(new java.awt.Color(217, 217, 217));
        buttonCustom3.setFont(new java.awt.Font("Lexend", 0, 24)); // NOI18N
        buttonCustom3.setPreferredSize(new java.awt.Dimension(160, 42));
        buttonCustom3.setRadius(20);
        buttonCustom3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCustom3ActionPerformed(evt);
            }
        });
        panelCustom2.add(buttonCustom3, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 14, -1, -1));

        buttonCustom4.setBackground(new java.awt.Color(217, 217, 217));
        buttonCustom4.setBorder(null);
        buttonCustom4.setText("Delete");
        buttonCustom4.setBorderColor(new java.awt.Color(217, 217, 217));
        buttonCustom4.setFont(new java.awt.Font("Lexend", 0, 24)); // NOI18N
        buttonCustom4.setPreferredSize(new java.awt.Dimension(160, 42));
        buttonCustom4.setRadius(20);
        buttonCustom4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCustom4ActionPerformed(evt);
            }
        });
        panelCustom2.add(buttonCustom4, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 14, -1, -1));

        add(panelCustom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 103, -1, -1));

        panelCustom3.setPreferredSize(new java.awt.Dimension(695, 515));
        panelCustom3.setRoundBottomLeft(10);
        panelCustom3.setRoundBottomRigt(10);
        panelCustom3.setRoundTopLeft(10);
        panelCustom3.setRoundTopRigt(10);

        javax.swing.GroupLayout panelCustom3Layout = new javax.swing.GroupLayout(panelCustom3);
        panelCustom3.setLayout(panelCustom3Layout);
        panelCustom3Layout.setHorizontalGroup(
            panelCustom3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 695, Short.MAX_VALUE)
        );
        panelCustom3Layout.setVerticalGroup(
            panelCustom3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 515, Short.MAX_VALUE)
        );

        add(panelCustom3, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 200, -1, -1));

        panelCustom4.setPreferredSize(new java.awt.Dimension(248, 612));
        panelCustom4.setRoundBottomLeft(10);
        panelCustom4.setRoundBottomRigt(10);
        panelCustom4.setRoundTopLeft(10);
        panelCustom4.setRoundTopRigt(10);
        panelCustom4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textFieldCustom3.setPreferredSize(new java.awt.Dimension(210, 33));
        textFieldCustom3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCustom3ActionPerformed(evt);
            }
        });
        jPanel1.add(textFieldCustom3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 210, 32));

        jLabel4.setFont(new java.awt.Font("Lexend", 0, 15)); // NOI18N
        jLabel4.setText("XXXXX.");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        panelCustom4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 21, -1, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textFieldCustom4.setPreferredSize(new java.awt.Dimension(210, 33));
        textFieldCustom4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCustom4ActionPerformed(evt);
            }
        });
        jPanel3.add(textFieldCustom4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 210, 32));

        jLabel5.setFont(new java.awt.Font("Lexend", 0, 15)); // NOI18N
        jLabel5.setText("XXXXX.");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        panelCustom4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 90, -1, -1));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textFieldCustom5.setPreferredSize(new java.awt.Dimension(210, 33));
        textFieldCustom5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCustom5ActionPerformed(evt);
            }
        });
        jPanel4.add(textFieldCustom5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 210, 32));

        jLabel6.setFont(new java.awt.Font("Lexend", 0, 15)); // NOI18N
        jLabel6.setText("XXXXX.");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        panelCustom4.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 159, -1, -1));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textFieldCustom6.setPreferredSize(new java.awt.Dimension(210, 33));
        textFieldCustom6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCustom6ActionPerformed(evt);
            }
        });
        jPanel5.add(textFieldCustom6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 210, 32));

        jLabel7.setFont(new java.awt.Font("Lexend", 0, 15)); // NOI18N
        jLabel7.setText("XXXXX.");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        panelCustom4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 228, -1, -1));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textFieldCustom7.setPreferredSize(new java.awt.Dimension(210, 33));
        textFieldCustom7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCustom7ActionPerformed(evt);
            }
        });
        jPanel6.add(textFieldCustom7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 210, 32));

        jLabel8.setFont(new java.awt.Font("Lexend", 0, 15)); // NOI18N
        jLabel8.setText("XXXXX.");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        panelCustom4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 297, -1, -1));

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textFieldCustom8.setPreferredSize(new java.awt.Dimension(210, 33));
        textFieldCustom8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCustom8ActionPerformed(evt);
            }
        });
        jPanel7.add(textFieldCustom8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 210, 32));

        jLabel9.setFont(new java.awt.Font("Lexend", 0, 15)); // NOI18N
        jLabel9.setText("XXXXX.");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        panelCustom4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 366, -1, -1));

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textFieldCustom9.setPreferredSize(new java.awt.Dimension(210, 33));
        textFieldCustom9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCustom9ActionPerformed(evt);
            }
        });
        jPanel8.add(textFieldCustom9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 210, 32));

        jLabel10.setFont(new java.awt.Font("Lexend", 0, 15)); // NOI18N
        jLabel10.setText("XXXXX.");
        jPanel8.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        panelCustom4.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 435, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cancle.png"))); // NOI18N
        panelCustom4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 556, 40, 38));

        add(panelCustom4, new org.netbeans.lib.awtextra.AbsoluteConstraints(766, 103, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 254, 251));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/arrow-small-right.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel12)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(978, 25, 40, 38));
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCustom2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCustom2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCustom2ActionPerformed

    private void buttonCustom3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCustom3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCustom3ActionPerformed

    private void buttonCustom4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCustom4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCustom4ActionPerformed

    private void textFieldCustom3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCustom3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCustom3ActionPerformed

    private void textFieldCustom4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCustom4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCustom4ActionPerformed

    private void textFieldCustom5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCustom5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCustom5ActionPerformed

    private void textFieldCustom6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCustom6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCustom6ActionPerformed

    private void textFieldCustom7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCustom7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCustom7ActionPerformed

    private void textFieldCustom8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCustom8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCustom8ActionPerformed

    private void textFieldCustom9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCustom9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCustom9ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Custom.ButtonCustom buttonCustom2;
    private Custom.ButtonCustom buttonCustom3;
    private Custom.ButtonCustom buttonCustom4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private Custom.PanelCustom panelCustom2;
    private Custom.PanelCustom panelCustom3;
    private Custom.PanelCustom panelCustom4;
    private com.nhom08.bookstore.GUI.TextFieldCustom textFieldCustom3;
    private com.nhom08.bookstore.GUI.TextFieldCustom textFieldCustom4;
    private com.nhom08.bookstore.GUI.TextFieldCustom textFieldCustom5;
    private com.nhom08.bookstore.GUI.TextFieldCustom textFieldCustom6;
    private com.nhom08.bookstore.GUI.TextFieldCustom textFieldCustom7;
    private com.nhom08.bookstore.GUI.TextFieldCustom textFieldCustom8;
    private com.nhom08.bookstore.GUI.TextFieldCustom textFieldCustom9;
    // End of variables declaration//GEN-END:variables
}
