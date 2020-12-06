/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import Beans.DanhMucBean;
import controller.MainController;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author sonso
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public MainFrame() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        List<DanhMucBean> listDanhMuc = new ArrayList<>();
        listDanhMuc.add(new DanhMucBean("TrangChu", HomejPanel5, HomejLabel1));
        listDanhMuc.add(new DanhMucBean("PhiVS", PhiVSjPanel6, PhiVSjLabel6));
        listDanhMuc.add(new DanhMucBean("PhiDongGop",PhiDGjPanel7, PhiDGjLabel7));
        
        MainController controller = new MainController(jpnBean, this);
        controller.setView(HomejPanel5, HomejLabel1, "TrangChu");
        controller.setEvent(listDanhMuc);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        HomejPanel5 = new javax.swing.JPanel();
        HomejLabel1 = new javax.swing.JLabel();
        PhiVSjPanel6 = new javax.swing.JPanel();
        PhiVSjLabel6 = new javax.swing.JLabel();
        PhiDGjPanel7 = new javax.swing.JPanel();
        PhiDGjLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jpnBean = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 34)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(6, 0, 27));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-crowdfunding-50.png"))); // NOI18N
        jLabel2.setText("QUẢN LÝ THU PHÍ ĐÓNG GÓP");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-minus-55.png"))); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(50, 50));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 102, 102));
        jLabel5.setForeground(new java.awt.Color(102, 204, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-xbox-x-50.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 316, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(4, 4, 4)
                .addComponent(jLabel4))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 204, 102));

        jPanel4.setBackground(new java.awt.Color(255, 153, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 0, 3, 0, new java.awt.Color(0, 0, 0)));
        jPanel4.setPreferredSize(new java.awt.Dimension(215, 75));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel4MouseExited(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(6, 0, 27));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-enter-60.png"))); // NOI18N
        jLabel8.setText("Thoát ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
        );

        HomejPanel5.setBackground(new java.awt.Color(0, 255, 0));
        HomejPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 0, 3, 0, new java.awt.Color(0, 0, 0)));
        HomejPanel5.setPreferredSize(new java.awt.Dimension(215, 75));
        HomejPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomejPanel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomejPanel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomejPanel5MouseExited(evt);
            }
        });

        HomejLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        HomejLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-home-70.png"))); // NOI18N
        HomejLabel1.setText("Trang Chủ");

        javax.swing.GroupLayout HomejPanel5Layout = new javax.swing.GroupLayout(HomejPanel5);
        HomejPanel5.setLayout(HomejPanel5Layout);
        HomejPanel5Layout.setHorizontalGroup(
            HomejPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomejPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(HomejLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        HomejPanel5Layout.setVerticalGroup(
            HomejPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HomejLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PhiVSjPanel6.setBackground(new java.awt.Color(255, 153, 0));
        PhiVSjPanel6.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 0, 3, 0, new java.awt.Color(0, 0, 0)));
        PhiVSjPanel6.setPreferredSize(new java.awt.Dimension(215, 75));
        PhiVSjPanel6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                PhiVSjPanel6MouseDragged(evt);
            }
        });
        PhiVSjPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PhiVSjPanel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PhiVSjPanel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PhiVSjPanel6MouseExited(evt);
            }
        });

        PhiVSjLabel6.setBackground(new java.awt.Color(255, 255, 255));
        PhiVSjLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        PhiVSjLabel6.setForeground(new java.awt.Color(6, 0, 27));
        PhiVSjLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-janitor-60.png"))); // NOI18N
        PhiVSjLabel6.setText("Phí Vệ Sinh");

        javax.swing.GroupLayout PhiVSjPanel6Layout = new javax.swing.GroupLayout(PhiVSjPanel6);
        PhiVSjPanel6.setLayout(PhiVSjPanel6Layout);
        PhiVSjPanel6Layout.setHorizontalGroup(
            PhiVSjPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PhiVSjPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PhiVSjLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PhiVSjPanel6Layout.setVerticalGroup(
            PhiVSjPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PhiVSjLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
        );

        PhiDGjPanel7.setBackground(new java.awt.Color(255, 153, 0));
        PhiDGjPanel7.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 0, 3, 0, new java.awt.Color(0, 0, 0)));
        PhiDGjPanel7.setPreferredSize(new java.awt.Dimension(215, 75));
        PhiDGjPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PhiDGjPanel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PhiDGjPanel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PhiDGjPanel7MouseExited(evt);
            }
        });

        PhiDGjLabel7.setBackground(new java.awt.Color(255, 255, 255));
        PhiDGjLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        PhiDGjLabel7.setForeground(new java.awt.Color(6, 0, 27));
        PhiDGjLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-money-box-60.png"))); // NOI18N
        PhiDGjLabel7.setText("Phí Đóng Góp");

        javax.swing.GroupLayout PhiDGjPanel7Layout = new javax.swing.GroupLayout(PhiDGjPanel7);
        PhiDGjPanel7.setLayout(PhiDGjPanel7Layout);
        PhiDGjPanel7Layout.setHorizontalGroup(
            PhiDGjPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PhiDGjPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PhiDGjLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PhiDGjPanel7Layout.setVerticalGroup(
            PhiDGjPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PhiDGjLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
        );

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(6, 0, 27));
        jLabel9.setIcon(new javax.swing.ImageIcon("D:\\ThucHanh\\CNPM_23\\src\\icon\\icons8-male-user-70.png")); // NOI18N
        jLabel9.setText("Cán Bộ Kế Toán");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
            .addComponent(HomejPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
            .addComponent(PhiVSjPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
            .addComponent(PhiDGjPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(HomejPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(PhiVSjPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(PhiDGjPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jpnBean.setBackground(new java.awt.Color(255, 204, 102));

        javax.swing.GroupLayout jpnBeanLayout = new javax.swing.GroupLayout(jpnBean);
        jpnBean.setLayout(jpnBeanLayout);
        jpnBeanLayout.setHorizontalGroup(
            jpnBeanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 703, Short.MAX_VALUE)
        );
        jpnBeanLayout.setVerticalGroup(
            jpnBeanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnBean, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnBean, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomejPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomejPanel5MouseEntered
        // TODO add your handling code here:
       // HomejPanel5.setBackground(Color.green);
        //jLabel1.setBackground(Color.green);
    }//GEN-LAST:event_HomejPanel5MouseEntered

    private void HomejPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomejPanel5MouseExited
        // TODO add your handling code here:
        //HomejPanel5.setBackground(new Color(255,153,0));
       // jLabel1.setBackground(Color.red);
    }//GEN-LAST:event_HomejPanel5MouseExited

    private void PhiVSjPanel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PhiVSjPanel6MouseEntered
        // TODO add your handling code here:
        //PhiVSjPanel6.setBackground(Color.green);
        //jLabel6.setBackground(Color.green);
    }//GEN-LAST:event_PhiVSjPanel6MouseEntered

    private void PhiVSjPanel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PhiVSjPanel6MouseExited
        // TODO add your handling code here:
       // PhiVSjPanel6.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_PhiVSjPanel6MouseExited

    private void PhiDGjPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PhiDGjPanel7MouseEntered
        // TODO add your handling code here:
        //PhiDGjPanel7.setBackground(Color.green);
    }//GEN-LAST:event_PhiDGjPanel7MouseEntered

    private void PhiDGjPanel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PhiDGjPanel7MouseExited
        // TODO add your handling code here:
       // PhiDGjPanel7.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_PhiDGjPanel7MouseExited

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
        // TODO add your handling code here:
        jPanel4.setBackground(Color.green);
        
    }//GEN-LAST:event_jPanel4MouseEntered

    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited
        // TODO add your handling code here:
        jPanel4.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jPanel4MouseExited

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, "Are you sure to close??", "Confirm", JOptionPane.YES_NO_OPTION) == 0) {
            dispose();
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
        jPanel4.setBackground(Color.green);
        if (JOptionPane.showConfirmDialog(null, "Are you sure to close??", "Confirm", JOptionPane.YES_NO_OPTION) == 0) {
            dispose();
            new LoginUI().setVisible(true);
        }else{
            jPanel4.setBackground(new Color(255,153,0));
        }
    }//GEN-LAST:event_jPanel4MouseClicked

    private void HomejPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomejPanel5MouseClicked
        // TODO add your handling code here:
        //HomejPanel5.setBackground(Color.green);
    }//GEN-LAST:event_HomejPanel5MouseClicked

    private void PhiVSjPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PhiVSjPanel6MouseClicked

    }//GEN-LAST:event_PhiVSjPanel6MouseClicked

    private void PhiDGjPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PhiDGjPanel7MouseClicked

    }//GEN-LAST:event_PhiDGjPanel7MouseClicked

    private void PhiVSjPanel6MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PhiVSjPanel6MouseDragged

    }//GEN-LAST:event_PhiVSjPanel6MouseDragged
 
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    
    
    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered

    }//GEN-LAST:event_jLabel5MouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HomejLabel1;
    private javax.swing.JPanel HomejPanel5;
    private javax.swing.JLabel PhiDGjLabel7;
    private javax.swing.JPanel PhiDGjPanel7;
    private javax.swing.JLabel PhiVSjLabel6;
    private javax.swing.JPanel PhiVSjPanel6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jpnBean;
    // End of variables declaration//GEN-END:variables
}