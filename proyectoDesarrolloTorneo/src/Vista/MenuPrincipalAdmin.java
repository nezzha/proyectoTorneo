/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

//import Controlador.CtrlEquipo;
//import Modelo.Equipo;
//import Modelo.consultaEquipo;

/**
 *
 * @author vanessa
 */
public class MenuPrincipalAdmin extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipalAdmin
     */
    public MenuPrincipalAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        btnArbitro = new javax.swing.JButton();
        btnEstadisticas = new javax.swing.JButton();
        btnJugador = new javax.swing.JButton();
        btnEquipo = new javax.swing.JButton();
        btnTorneo = new javax.swing.JButton();
        btnPartido = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("MENU PINCIPAL ADMIN\n");

        btnArbitro.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        btnArbitro.setIcon(new javax.swing.ImageIcon("/home/vanessa/Descargas/arbitro.png")); // NOI18N
        btnArbitro.setText("Arbitro");
        btnArbitro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArbitroActionPerformed(evt);
            }
        });

        btnEstadisticas.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        btnEstadisticas.setIcon(new javax.swing.ImageIcon("/home/vanessa/Descargas/estadisticas.png")); // NOI18N
        btnEstadisticas.setText("Estadisticas");

        btnJugador.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        btnJugador.setIcon(new javax.swing.ImageIcon("/home/vanessa/Descargas/futbolista (1).png")); // NOI18N
        btnJugador.setText("Jugadores");
        btnJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugadorActionPerformed(evt);
            }
        });

        btnEquipo.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        btnEquipo.setIcon(new javax.swing.ImageIcon("/home/vanessa/Descargas/camiseta-de-futbol (3).png")); // NOI18N
        btnEquipo.setText("Equipo");
        btnEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEquipoActionPerformed(evt);
            }
        });

        btnTorneo.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        btnTorneo.setIcon(new javax.swing.ImageIcon("/home/vanessa/Descargas/futbol (2).png")); // NOI18N
        btnTorneo.setText("Torneo");
        btnTorneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTorneoActionPerformed(evt);
            }
        });

        btnPartido.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        btnPartido.setIcon(new javax.swing.ImageIcon("/home/vanessa/Descargas/futbol (4).png")); // NOI18N
        btnPartido.setText("Partido");
        btnPartido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPartidoActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jButton7.setText("Registrar Usuario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(107, 107, 107))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnJugador)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(btnPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnArbitro, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnEstadisticas)))
                                .addGap(19, 19, 19))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnJugador)
                    .addComponent(btnEquipo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPartido)
                    .addComponent(btnTorneo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEstadisticas)
                    .addComponent(btnArbitro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnArbitroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArbitroActionPerformed
    
        // TODO add your handling code here:
    }//GEN-LAST:event_btnArbitroActionPerformed

    private void btnJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugadorActionPerformed
      

        // TODO add your handling code here:
    }//GEN-LAST:event_btnJugadorActionPerformed

    private void btnEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEquipoActionPerformed
      
    }//GEN-LAST:event_btnEquipoActionPerformed

    private void btnTorneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTorneoActionPerformed
  
    }//GEN-LAST:event_btnTorneoActionPerformed

    private void btnPartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPartidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPartidoActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipalAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArbitro;
    private javax.swing.JButton btnEquipo;
    private javax.swing.JButton btnEstadisticas;
    private javax.swing.JButton btnJugador;
    private javax.swing.JButton btnPartido;
    private javax.swing.JButton btnTorneo;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
