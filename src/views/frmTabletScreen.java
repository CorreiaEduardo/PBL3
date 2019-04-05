package views;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.TimerTask;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 * @author Edu
 */
public class frmTabletScreen extends javax.swing.JFrame {

    public frmTabletScreen(float pSize, float liSize, float linkSize, String pColor, String liColor, String linkColor) {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("Joogle.png")).getImage());
        listLabel.setText("<HTML><ol style='color: "+liColor+"; font-size: "+liSize+"px;'><li>Eget nunc lobortis mattis aliquam.<li>Varius quam quisque id diam vel quam elementum.<li>Cursus in hac habitasse platea dictumst quisque.");
        Link1.setText("<HTML><p style= 'color: "+linkColor+"; font-size: "+linkSize+"px;'><U>CLICK ME");
        LoremIpsum.setText("<html> <p align=\"justify\" style= 'color: "+pColor+"; font-size: "+pSize+"px;'> Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. "
                + "Sit amet volutpat consequat mauris nunc. Ornare quam viverra orci sagittis. Aliquam id diam maecenas ultricies mi eget mauris pharetra."
                + "Elementum sagittis vitae et leo duis ut diam quam." );
        
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LoremIpsum = new javax.swing.JLabel();
        listLabel = new javax.swing.JLabel();
        Link1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setTitle("Joogle Jhrome");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                JFrameWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(85, 85, 85));

        jTabbedPane1.setFocusable(false);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(null);

        jPanel5.setBackground(new java.awt.Color(153, 62, 0));
        jPanel5.setLayout(new javax.swing.OverlayLayout(jPanel5));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("                                                                    HOMEPAGE");
        jPanel5.add(jLabel1);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("           LOREM IPSUM");
        jPanel5.add(jLabel4);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(0, 0, 1280, 40);

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Book", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CORREIAEDUARDO");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(490, 670, 208, 28);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_GitHub_64px.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(420, 650, 64, 64);

        LoremIpsum.setBackground(new java.awt.Color(255, 255, 255));
        LoremIpsum.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        LoremIpsum.setForeground(new java.awt.Color(204, 204, 204));
        LoremIpsum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoremIpsum.setText("LOREM IPSUM PARAGRAPH");
        jPanel2.add(LoremIpsum);
        LoremIpsum.setBounds(410, 90, 320, 270);

        listLabel.setForeground(new java.awt.Color(204, 204, 204));
        listLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        listLabel.setText("LIST");
        jPanel2.add(listLabel);
        listLabel.setBounds(420, 380, 290, 220);

        Link1.setText("CLICK ME!");
        Link1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(Link1);
        Link1.setBounds(630, 330, 100, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/orangebg.png"))); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(-180, 40, 940, 700);

        jTabbedPane1.addTab("Nova Guia Joogle", jPanel2);

        jPanel3.setBackground(new java.awt.Color(75, 75, 75));
        jPanel3.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 763, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 738, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("JMail", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JFrameWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_JFrameWindowClosing
        frmMainScreen novaTela = new frmMainScreen();
        novaTela.pack();
        novaTela.setLocationRelativeTo(null);
        novaTela.setVisible(true);
    }//GEN-LAST:event_JFrameWindowClosing

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
            java.util.logging.Logger.getLogger(frmTabletScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTabletScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTabletScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTabletScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new frmDesktopScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Link1;
    private javax.swing.JLabel LoremIpsum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel listLabel;
    // End of variables declaration//GEN-END:variables
}
