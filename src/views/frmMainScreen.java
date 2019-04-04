package views;

import java.awt.Color;
import Logics.*;

/**
 * @author Edu
 */
public class frmMainScreen extends javax.swing.JFrame {
    int xMouse;
    int yMouse;
    static Paragrafo p1;
    static Lista list1;
    static Link l1;
    public frmMainScreen() {
        initComponents();
        ControlBar.setBackground(new Color(45, 45, 45, 170));
        Widget1.setBackground(new Color(45, 45, 45, 210));
        Widget2.setBackground(new Color(45, 45, 45, 210));
        Widget3.setBackground(new Color(45, 45, 45, 210));
        Widget4.setBackground(new Color(45, 45, 45, 210));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ControlBar = new javax.swing.JPanel();
        btnFechar = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JLabel();
        Widget1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Widget2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Widget3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Widget4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(271, 514));
        setResizable(false);
        setSize(new java.awt.Dimension(271, 514));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bgWater.jpg"))); // NOI18N
        jLabel1.setOpaque(true);

        ControlBar.setBackground(new java.awt.Color(45, 45, 45));
        ControlBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                ControlBarMouseDragged(evt);
            }
        });
        ControlBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ControlBarMousePressed(evt);
            }
        });

        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CloseButton.png"))); // NOI18N
        btnFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFecharMouseClicked(evt);
            }
        });

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MinimizeButton.png"))); // NOI18N
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ControlBarLayout = new javax.swing.GroupLayout(ControlBar);
        ControlBar.setLayout(ControlBarLayout);
        ControlBarLayout.setHorizontalGroup(
            ControlBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ControlBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMinimizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFechar)
                .addGap(15, 15, 15))
        );
        ControlBarLayout.setVerticalGroup(
            ControlBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlBarLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(ControlBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFechar)
                    .addComponent(btnMinimizar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Widget1.setBackground(new java.awt.Color(45, 45, 45));
        Widget1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Widget1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Widget1MouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Workstation_64px_1.png"))); // NOI18N

        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("DESKTOP");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout Widget1Layout = new javax.swing.GroupLayout(Widget1);
        Widget1.setLayout(Widget1Layout);
        Widget1Layout.setHorizontalGroup(
            Widget1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Widget1Layout.createSequentialGroup()
                .addGroup(Widget1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Widget1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel4))
                    .addGroup(Widget1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Widget1Layout.setVerticalGroup(
            Widget1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Widget1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(5, 5, 5)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Widget2.setBackground(new java.awt.Color(45, 45, 45));
        Widget2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Widget2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Widget2MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Laptop_64px_1.png"))); // NOI18N

        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("NOTEBOOK");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout Widget2Layout = new javax.swing.GroupLayout(Widget2);
        Widget2.setLayout(Widget2Layout);
        Widget2Layout.setHorizontalGroup(
            Widget2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Widget2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(23, 23, 23))
            .addGroup(Widget2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Widget2Layout.setVerticalGroup(
            Widget2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Widget2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        Widget3.setBackground(new java.awt.Color(45, 45, 45));
        Widget3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Widget3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Widget3MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Android_Tablet_64px_1.png"))); // NOI18N

        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("TABLET");

        javax.swing.GroupLayout Widget3Layout = new javax.swing.GroupLayout(Widget3);
        Widget3.setLayout(Widget3Layout);
        Widget3Layout.setHorizontalGroup(
            Widget3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Widget3Layout.createSequentialGroup()
                .addGroup(Widget3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Widget3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5))
                    .addGroup(Widget3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel8)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        Widget3Layout.setVerticalGroup(
            Widget3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Widget3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(2, 2, 2)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Widget4.setBackground(new java.awt.Color(45, 45, 45));
        Widget4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_iPhone_64px_1.png"))); // NOI18N

        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("SMARTPHONE");

        javax.swing.GroupLayout Widget4Layout = new javax.swing.GroupLayout(Widget4);
        Widget4.setLayout(Widget4Layout);
        Widget4Layout.setHorizontalGroup(
            Widget4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Widget4Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(Widget4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Widget4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Widget4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(12, 12, 12))))
        );
        Widget4Layout.setVerticalGroup(
            Widget4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Widget4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(3, 3, 3)
                .addComponent(jLabel9)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ControlBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Widget1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Widget3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Widget2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Widget4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(ControlBar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Widget1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Widget2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Widget4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Widget3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(189, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 280, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ControlBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ControlBarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_ControlBarMouseDragged

    private void ControlBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ControlBarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_ControlBarMousePressed

    private void btnFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFecharMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnFecharMouseClicked

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarMouseClicked

    private void Widget1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Widget1MouseClicked
        Desktop d = new Desktop();
        this.setVisible(false);
        frmDesktopScreen novaTela = new frmDesktopScreen(
                (p1.getSize()*d.renderizar(p1)),
                (list1.getSize()*d.renderizar(list1)),
                (l1.getSize()*d.renderizar(l1)),
                p1.getColor(),
                list1.getColor(),
                l1.getColor()
        );
        novaTela.pack();
        novaTela.setLocationRelativeTo(null);
        novaTela.setVisible(true);
    }//GEN-LAST:event_Widget1MouseClicked

    private void Widget2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Widget2MouseClicked
        Notebook n = new Notebook();
        this.setVisible(false);
        frmNotebookScreen novaTela = new frmNotebookScreen(
                (p1.getSize()*n.renderizar(p1)),
                (list1.getSize()*n.renderizar(list1)),
                (l1.getSize()*n.renderizar(l1)),
                p1.getColor(),
                list1.getColor(),
                l1.getColor()
        );
        novaTela.pack();
        novaTela.setLocationRelativeTo(null);
        novaTela.setVisible(true);
    }//GEN-LAST:event_Widget2MouseClicked

    private void Widget3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Widget3MouseClicked
        Tablet t = new Tablet();
        this.setVisible(false);
        frmTabletScreen novaTela = new frmTabletScreen(
                (p1.getSize()*t.renderizar(p1)),
                (list1.getSize()*t.renderizar(list1)),
                (l1.getSize()*t.renderizar(l1)),
                p1.getColor(),
                list1.getColor(),
                l1.getColor()
        );
        novaTela.pack();
        novaTela.setLocationRelativeTo(null);
        novaTela.setVisible(true);
    }//GEN-LAST:event_Widget3MouseClicked

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
            java.util.logging.Logger.getLogger(frmMainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmMainScreen novaTela = new frmMainScreen();
                novaTela.pack();
                novaTela.setLocationRelativeTo(null);
                novaTela.setVisible(true);
                
                p1 = new Paragrafo();
                p1.setSize(5f);
                p1.setColor("black");
                
                list1 = new Lista();
                list1.setSize(5f);
                list1.setColor("black");
                
                l1 = new Link();
                l1.setSize(5f);
                l1.setColor("black");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ControlBar;
    private javax.swing.JPanel Widget1;
    private javax.swing.JPanel Widget2;
    private javax.swing.JPanel Widget3;
    private javax.swing.JPanel Widget4;
    private javax.swing.JLabel btnFechar;
    private javax.swing.JLabel btnMinimizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
