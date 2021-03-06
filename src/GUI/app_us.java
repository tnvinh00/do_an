/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.NGUOIDUNG_BUS;
import DAO.DataAccess;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author duyhuy
 */
public class app_us extends javax.swing.JFrame {

    /**
     * Creates new form app_us
     */
    private static String usr = "";
    private static String pwd = "";
    
    int x,y;
    public app_us() {
        usr = "U47377";
        pwd = "47377";
        khoitao();
    }
    public app_us(String user, String pass){
        usr = "U"+user;
        pwd = pass;
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

        p_header = new javax.swing.JPanel();
        l_h_drag = new javax.swing.JLabel();
        b_h_close = new javax.swing.JButton();
        b_h_mini = new javax.swing.JButton();
        p_bottom = new javax.swing.JPanel();
        tb_card = new javax.swing.JTabbedPane();
        p_phong = new javax.swing.JPanel();
        jsp_phong = new javax.swing.JScrollPane();
        jt_phong = new javax.swing.JTable();
        p_dv = new javax.swing.JPanel();
        jsp_dv = new javax.swing.JScrollPane();
        jt_dv = new javax.swing.JTable();
        jsp_dkkm = new javax.swing.JScrollPane();
        jt_dkkm = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        p_kh = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        p_info = new javax.swing.JPanel();
        l_info_dmk = new javax.swing.JLabel();
        l_info_info = new javax.swing.JLabel();
        js_info = new javax.swing.JSeparator();
        l_info_mkc = new javax.swing.JLabel();
        tp_info_mkc = new javax.swing.JPasswordField();
        l_info_mkm = new javax.swing.JLabel();
        tp_info_mkm = new javax.swing.JPasswordField();
        l_info_xnl = new javax.swing.JLabel();
        tp_info_xnl = new javax.swing.JPasswordField();
        l_info_er_mkc = new javax.swing.JLabel();
        l_info_er_mkm = new javax.swing.JLabel();
        l_info_er_xnl = new javax.swing.JLabel();
        b_info_dmk = new javax.swing.JButton();
        b_info_dx = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 600));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(900, 600));
        setResizable(false);

        p_header.setBackground(new java.awt.Color(57, 62, 70));
        p_header.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        p_header.setPreferredSize(new java.awt.Dimension(100, 25));
        p_header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l_h_drag.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                l_h_dragMouseDragged(evt);
            }
        });
        l_h_drag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                l_h_dragMousePressed(evt);
            }
        });
        p_header.add(l_h_drag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 25));

        b_h_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icon_login/close.png"))); // NOI18N
        b_h_close.setBorder(null);
        b_h_close.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icon_login/close-1.png"))); // NOI18N
        b_h_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_h_closeActionPerformed(evt);
            }
        });
        p_header.add(b_h_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 40, 25));

        b_h_mini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icon_login/mini.png"))); // NOI18N
        b_h_mini.setBorder(null);
        b_h_mini.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icon_login/mini-1.png"))); // NOI18N
        b_h_mini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_h_miniActionPerformed(evt);
            }
        });
        p_header.add(b_h_mini, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 40, 25));

        getContentPane().add(p_header, java.awt.BorderLayout.PAGE_START);

        p_bottom.setBackground(new java.awt.Color(57, 62, 70));
        p_bottom.setPreferredSize(new java.awt.Dimension(100, 25));
        getContentPane().add(p_bottom, java.awt.BorderLayout.PAGE_END);

        tb_card.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tb_card.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        p_phong.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jsp_phong.setFocusable(false);

        jt_phong.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jt_phong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phiếu thuê", "Số phòng", "CMND"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jt_phong.setFocusable(false);
        jt_phong.setSelectionBackground(new java.awt.Color(36, 122, 135));
        jt_phong.getTableHeader().setReorderingAllowed(false);
        jsp_phong.setViewportView(jt_phong);

        p_phong.add(jsp_phong, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 440, 320));

        tb_card.addTab("   Phòng    ", p_phong);

        p_dv.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jsp_dv.setFocusable(false);

        jt_dv.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jt_dv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phiếu thuê", "Mã dịch vụ", "Ngày"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jt_dv.setFocusable(false);
        jt_dv.setSelectionBackground(new java.awt.Color(36, 122, 135));
        jt_dv.getTableHeader().setReorderingAllowed(false);
        jsp_dv.setViewportView(jt_dv);

        p_dv.add(jsp_dv, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 430, 270));

        jsp_dkkm.setFocusable(false);

        jt_dkkm.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jt_dkkm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã dịch vụ", "Tên dịch vụ", "Giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jt_dkkm.setFocusable(false);
        jt_dkkm.setSelectionBackground(new java.awt.Color(36, 122, 135));
        jt_dkkm.getTableHeader().setReorderingAllowed(false);
        jsp_dkkm.setViewportView(jt_dkkm);

        p_dv.add(jsp_dkkm, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 440, 270));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Dịch vụ đã đăng ký");
        p_dv.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Danh sách dịch vụ");
        p_dv.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, -1, 30));

        tb_card.addTab("   Dịch vụ   ", p_dv);

        p_kh.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Tên khách hàng");
        p_kh.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("CMND");
        p_kh.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Loại khách");
        p_kh.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Địa chỉ");
        p_kh.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        p_kh.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 40, 290));

        tb_card.addTab("Khách hàng", p_kh);

        p_info.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l_info_dmk.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        l_info_dmk.setText("Đổi mật khẩu ");
        p_info.add(l_info_dmk, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        l_info_info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icon_us/info.jpg"))); // NOI18N
        p_info.add(l_info_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 460, 510));

        js_info.setOrientation(javax.swing.SwingConstants.VERTICAL);
        js_info.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        p_info.add(js_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 0, 10, 520));

        l_info_mkc.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        l_info_mkc.setText("Mật khẩu cũ");
        p_info.add(l_info_mkc, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        tp_info_mkc.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tp_info_mkc.setText("jPassword");
        tp_info_mkc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tp_info_mkcFocusGained(evt);
            }
        });
        p_info.add(tp_info_mkc, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 170, -1));

        l_info_mkm.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        l_info_mkm.setText("Mật khẩu mới");
        p_info.add(l_info_mkm, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        tp_info_mkm.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tp_info_mkm.setText("jPassword");
        tp_info_mkm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tp_info_mkmFocusGained(evt);
            }
        });
        p_info.add(tp_info_mkm, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 170, -1));

        l_info_xnl.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        l_info_xnl.setText("Xác nhận lại");
        p_info.add(l_info_xnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        tp_info_xnl.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tp_info_xnl.setText("jPassword");
        tp_info_xnl.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tp_info_xnlFocusGained(evt);
            }
        });
        p_info.add(tp_info_xnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 170, -1));

        l_info_er_mkc.setForeground(new java.awt.Color(153, 0, 0));
        p_info.add(l_info_er_mkc, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 170, 20));

        l_info_er_mkm.setForeground(new java.awt.Color(153, 0, 0));
        p_info.add(l_info_er_mkm, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 170, 20));

        l_info_er_xnl.setForeground(new java.awt.Color(153, 0, 0));
        p_info.add(l_info_er_xnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 170, 20));

        b_info_dmk.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        b_info_dmk.setText("Đổi mật khẩu");
        b_info_dmk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_info_dmkActionPerformed(evt);
            }
        });
        p_info.add(b_info_dmk, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 130, -1));

        b_info_dx.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        b_info_dx.setText("Đăng xuất");
        b_info_dx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_info_dxActionPerformed(evt);
            }
        });
        p_info.add(b_info_dx, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, -1, -1));

        tb_card.addTab("       Info app        ", p_info);

        getContentPane().add(tb_card, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void l_h_dragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_h_dragMouseDragged
        // TODO add your handling code here:
        int _x = evt.getXOnScreen();
        int _y = evt.getYOnScreen();
        this.setLocation(_x-x, _y-y);
    }//GEN-LAST:event_l_h_dragMouseDragged

    private void l_h_dragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_h_dragMousePressed
        // TODO add your handling code here:
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_l_h_dragMousePressed

    private void b_h_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_h_closeActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        dispose();
    }//GEN-LAST:event_b_h_closeActionPerformed

    private void b_h_miniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_h_miniActionPerformed
        // TODO add your handling code here:
        this.setState(app_man.ICONIFIED);
    }//GEN-LAST:event_b_h_miniActionPerformed

    private void tp_info_mkcFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tp_info_mkcFocusGained
        // TODO add your handling code here:
        tp_info_mkc.setText("");
    }//GEN-LAST:event_tp_info_mkcFocusGained

    private void tp_info_mkmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tp_info_mkmFocusGained
        // TODO add your handling code here:
        tp_info_mkm.setText("");
    }//GEN-LAST:event_tp_info_mkmFocusGained

    private void tp_info_xnlFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tp_info_xnlFocusGained
        // TODO add your handling code here:
        tp_info_xnl.setText("");
    }//GEN-LAST:event_tp_info_xnlFocusGained

    private void b_info_dmkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_info_dmkActionPerformed
        String mkc = tp_info_mkc.getText();
        String mkm = tp_info_mkm.getText();
        String xnl = tp_info_xnl.getText();

        NGUOIDUNG_BUS up_ql = null;
        try {
            up_ql = new NGUOIDUNG_BUS();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            up_ql.doimk_QL(pwd, mkc, mkm, xnl);
        } catch (Exception ex) {
            if(ex.getMessage().contains("*M")){
                l_info_er_mkc.setText(ex.getMessage());
                l_info_er_mkm.setText("");
                l_info_er_xnl.setText("");
            }
            else if (ex.getMessage().contains("*T")){
                l_info_er_mkc.setText("");
                l_info_er_mkm.setText(ex.getMessage());
                l_info_er_xnl.setText("");
            }
            else if (ex.getMessage().contains("*X")){
                l_info_er_mkc.setText("");
                l_info_er_mkm.setText("");
                l_info_er_xnl.setText(ex.getMessage());
            }
            else{
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
                l_info_er_mkc.setText("");
                l_info_er_mkm.setText("");
                l_info_er_xnl.setText("");
            }
            return;
        }
        l_info_er_mkc.setText("");
        l_info_er_mkm.setText("");
        l_info_er_xnl.setText("");
        JOptionPane.showMessageDialog(null, "Đổi mật khẩu thành công", "Thông báo", JOptionPane.NO_OPTION);

    }//GEN-LAST:event_b_info_dmkActionPerformed

    private void b_info_dxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_info_dxActionPerformed
        // TODO add your handling code here:
        login logi = new login();
        logi.setVisible(true);
        b_h_close.doClick();
    }//GEN-LAST:event_b_info_dxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(app_us.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(app_us.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(app_us.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(app_us.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        FlatLightLaf.install();
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new app_us().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_h_close;
    private javax.swing.JButton b_h_mini;
    private javax.swing.JButton b_info_dmk;
    private javax.swing.JButton b_info_dx;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator js_info;
    private javax.swing.JScrollPane jsp_dkkm;
    private javax.swing.JScrollPane jsp_dv;
    private javax.swing.JScrollPane jsp_phong;
    private javax.swing.JTable jt_dkkm;
    private javax.swing.JTable jt_dv;
    private javax.swing.JTable jt_phong;
    private javax.swing.JLabel l_h_drag;
    private javax.swing.JLabel l_info_dmk;
    private javax.swing.JLabel l_info_er_mkc;
    private javax.swing.JLabel l_info_er_mkm;
    private javax.swing.JLabel l_info_er_xnl;
    private javax.swing.JLabel l_info_info;
    private javax.swing.JLabel l_info_mkc;
    private javax.swing.JLabel l_info_mkm;
    private javax.swing.JLabel l_info_xnl;
    private javax.swing.JPanel p_bottom;
    private javax.swing.JPanel p_dv;
    private javax.swing.JPanel p_header;
    private javax.swing.JPanel p_info;
    private javax.swing.JPanel p_kh;
    private javax.swing.JPanel p_phong;
    private javax.swing.JTabbedPane tb_card;
    private javax.swing.JPasswordField tp_info_mkc;
    private javax.swing.JPasswordField tp_info_mkm;
    private javax.swing.JPasswordField tp_info_xnl;
    // End of variables declaration//GEN-END:variables
}
