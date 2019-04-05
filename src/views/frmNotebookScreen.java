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
public class frmNotebookScreen extends javax.swing.JFrame {

    public frmNotebookScreen(float pSize, float liSize, float linkSize, String pColor, String liColor, String linkColor) {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("Joogle.png")).getImage());
        Timer every10millis; 
        every10millis = new Timer(10, new ActionListener() {
            private int count=0;
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                jProgressBar1.setValue(count);
                if (count==100) {
                     
                }
            }
        });
        every10millis.start();
        listLabel.setText("<HTML><ol style='color: "+liColor+"; font-size: "+liSize+"px;'><li>Eget nunc lobortis mattis aliquam.<li>Varius quam quisque id diam vel quam elementum.<li>Cursus in hac habitasse platea dictumst quisque.");
        Link1.setText("<HTML><p style= 'color: "+linkColor+"; font-size: "+linkSize+"px;'><U>CLICK ME");
        LoremIpsum.setText("<html> <p align=\"justify\" style= 'color: "+pColor+"; font-size: "+pSize+"px;'> Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. "
                + "Sit amet volutpat consequat mauris nunc. Ornare quam viverra orci sagittis. Aliquam id diam maecenas ultricies mi eget mauris pharetra."
                + "Elementum sagittis vitae et leo duis ut diam quam. Neque ornare aenean euismod elementum nisi quis eleifend. "
                + "Aliquam ut porttitor leo a diam sollicitudin tempor id eu. Dui sapien eget mi proin. Ut tristique et egestas quis ipsum. "
                + "Viverra tellus in hac habitasse platea dictumst vestibulum." );
        
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
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Link1 = new javax.swing.JLabel();
        listLabel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        LoremIpsum = new javax.swing.JLabel();
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

        jPanel2.setBackground(new java.awt.Color(85, 98, 113));
        jPanel2.setLayout(null);
        jPanel2.add(jProgressBar1);
        jProgressBar1.setBounds(0, 0, 1364, 9);

        jPanel4.setBackground(new java.awt.Color(255, 153, 0));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_GitHub_64px.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Book", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CORREIAEDUARDO");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(518, 518, 518)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addGap(16, 16, 16)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4);
        jPanel4.setBounds(0, 642, 1364, 100);

        Link1.setText("CLICK ME");
        Link1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(Link1);
        Link1.setBounds(1045, 452, 120, 30);

        listLabel.setForeground(new java.awt.Color(204, 204, 204));
        listLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        listLabel.setText("LIST");
        jPanel2.add(listLabel);
        listLabel.setBounds(723, 151, 316, 317);

        jPanel5.setBackground(new java.awt.Color(255, 153, 0));

        LoremIpsum.setBackground(new java.awt.Color(255, 255, 255));
        LoremIpsum.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        LoremIpsum.setForeground(new java.awt.Color(204, 204, 204));
        LoremIpsum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoremIpsum.setText("LOREM IPSUM PARAGRAPH");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(LoremIpsum, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(LoremIpsum, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5);
        jPanel5.setBounds(0, 70, 617, 518);

        jTabbedPane1.addTab("Nova Guia Joogle", jPanel2);

        jPanel3.setBackground(new java.awt.Color(75, 75, 75));
        jPanel3.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1364, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 742, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("JMail", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(frmNotebookScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmNotebookScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmNotebookScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmNotebookScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel listLabel;
    // End of variables declaration//GEN-END:variables
}
