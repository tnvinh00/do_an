/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.NGUOIDUNG_BUS;
import DAO.DataAccess;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author duyhuy
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    private static String usr = "do_an";
    private static String pwd = "do_an";
    int x, y;
    public login() {
        DataAccess.setUsr_Pwd(usr, pwd);
        khoitao();
    }
    public void khoitao(){
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        try {
            DataAccess.load_driver();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Không load được driver", "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p_body = new javax.swing.JPanel();
        t_un = new javax.swing.JTextField();
        tp_p = new javax.swing.JPasswordField();
        b_login = new javax.swing.JButton();
        l_er_un = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jc_showp = new javax.swing.JCheckBox();
        l_bg = new javax.swing.JLabel();
        p_header = new javax.swing.JPanel();
        b_close = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login_qlks");
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(550, 405));

        p_body.setBackground(new Color(0,0,0,0)
        );
        p_body.setMinimumSize(new java.awt.Dimension(550, 380));
        p_body.setPreferredSize(new java.awt.Dimension(550, 380));
        p_body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t_un.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        t_un.setForeground(new java.awt.Color(192, 192, 192));
        t_un.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        t_un.setText("system");
        t_un.setBorder(null);
        t_un.setOpaque(false);
        t_un.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                t_unFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                t_unFocusLost(evt);
            }
        });
        p_body.add(t_un, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 180, 40));

        tp_p.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tp_p.setForeground(new java.awt.Color(192, 192, 192));
        tp_p.setText("password");
        tp_p.setBorder(null);
        tp_p.setOpaque(false);
        tp_p.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tp_pFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tp_pFocusLost(evt);
            }
        });
        p_body.add(tp_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 180, 40));

        b_login.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        b_login.setText("Login");
        b_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_loginActionPerformed(evt);
            }
        });
        p_body.add(b_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 130, 40));

        l_er_un.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        l_er_un.setForeground(new java.awt.Color(204, 0, 0));
        p_body.add(l_er_un, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 250, 20));

        jSeparator1.setForeground(new java.awt.Color(57, 62, 70));
        p_body.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 180, -1));

        jSeparator2.setForeground(new java.awt.Color(57, 62, 70));
        p_body.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 180, 10));

        jc_showp.setText("Show Password");
        jc_showp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc_showpActionPerformed(evt);
            }
        });
        p_body.add(jc_showp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 160, -1));

        l_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icon_login/background.jpg"))); // NOI18N
        l_bg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p_body.add(l_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 380));

        getContentPane().add(p_body, java.awt.BorderLayout.CENTER);

        p_header.setBackground(new java.awt.Color(57, 62, 70));
        p_header.setPreferredSize(new java.awt.Dimension(307, 25));

        b_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icon_login/close.png"))); // NOI18N
        b_close.setBorder(null);
        b_close.setMaximumSize(new java.awt.Dimension(41, 30));
        b_close.setMinimumSize(new java.awt.Dimension(41, 30));
        b_close.setPreferredSize(new java.awt.Dimension(41, 30));
        b_close.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icon_login/close-1.png"))); // NOI18N
        b_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_closeActionPerformed(evt);
            }
        });

        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout p_headerLayout = new javax.swing.GroupLayout(p_header);
        p_header.setLayout(p_headerLayout);
        p_headerLayout.setHorizontalGroup(
            p_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_headerLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_close, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        p_headerLayout.setVerticalGroup(
            p_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(b_close, javax.swing.GroupLayout.PREFERRED_SIZE, 25, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(p_header, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_loginActionPerformed
         
        NGUOIDUNG_BUS bus = null;
        try {
            bus = new NGUOIDUNG_BUS();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Không kết nối được CSDL", "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        }
        try{
            if(bus.kt_nguoidung(t_un.getText(), tp_p.getText())){
                if (t_un.getText().equals("system")){
                    app_man app = new app_man(tp_p.getText());
                    app.setVisible(true);
                    b_close.doClick();
                }
                else{
                    app_us app = new app_us(t_un.getText(),tp_p.getText());
                    app.setVisible(true);
                    b_close.doClick();
                }
            }
            else{
                l_er_un.setText("Sai người dùng hoặc mật khẩu");
            }
        }
        catch (Exception ex){
            if(ex.getMessage().contains("*")){
                l_er_un.setText(ex.getMessage());
            }
            else{
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_b_loginActionPerformed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        // TODO add your handling code here:
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        // TODO add your handling code here:
        int _x = evt.getXOnScreen();
        int _y = evt.getYOnScreen();
        this.setLocation(_x-x, _y-y);
    }//GEN-LAST:event_jLabel1MouseDragged

    private void b_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_closeActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        dispose();
    }//GEN-LAST:event_b_closeActionPerformed

    private void t_unFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_unFocusGained
        // TODO add your handling code here:
        if(t_un.getText().equals("system")){
            t_un.setText("");
            t_un.setForeground(new Color(34,40,49));
        }
    }//GEN-LAST:event_t_unFocusGained

    private void tp_pFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tp_pFocusGained
        // TODO add your handling code here:
        if (tp_p.getText().equals("password")){
            tp_p.setText("");
            tp_p.setForeground(new Color(34,40,49));
        }
    }//GEN-LAST:event_tp_pFocusGained

    private void t_unFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_unFocusLost
        // TODO add your handling code here:
        if(t_un.getText().equals("")){
            t_un.setText("system");
            t_un.setForeground(new Color(192,192,192));
        }
    }//GEN-LAST:event_t_unFocusLost

    private void jc_showpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jc_showpActionPerformed
        // TODO add your handling code here:
        if (jc_showp.isSelected())
            tp_p.setEchoChar((char)0);
        else
            tp_p.setEchoChar('•');
    }//GEN-LAST:event_jc_showpActionPerformed

    private void tp_pFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tp_pFocusLost
        // TODO add your handling code here:
        if(tp_p.getText().equals("")){
            tp_p.setText("password");
            tp_p.setForeground(new Color(192,192,192));
        }
    }//GEN-LAST:event_tp_pFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        FlatLightLaf.install();
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_close;
    private javax.swing.JButton b_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JCheckBox jc_showp;
    private javax.swing.JLabel l_bg;
    private javax.swing.JLabel l_er_un;
    private javax.swing.JPanel p_body;
    private javax.swing.JPanel p_header;
    private javax.swing.JTextField t_un;
    private javax.swing.JPasswordField tp_p;
    // End of variables declaration//GEN-END:variables
}
