/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.forms;

//import java.awt.Frame;
import javax.swing.JFrame;

/**
 *
 * @author José Henrique
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
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

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuferramentas = new javax.swing.JMenu();
        jMenuItemsair = new javax.swing.JMenuItem();
        jMenuservicos = new javax.swing.JMenu();
        jMenuItemcidades = new javax.swing.JMenuItem();
        jMenuItemclientes = new javax.swing.JMenuItem();
        jMenuItemequipamentos = new javax.swing.JMenuItem();
        jMenuItemfunc = new javax.swing.JMenuItem();
        jMenuItemlocacao = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 554, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 393, Short.MAX_VALUE)
        );

        jMenuferramentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsul/Icones/ferramentas.png"))); // NOI18N
        jMenuferramentas.setText("Ferramentas");

        jMenuItemsair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsul/Icones/icons8-erro-28.png"))); // NOI18N
        jMenuItemsair.setText("Sair");
        jMenuItemsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemsairActionPerformed(evt);
            }
        });
        jMenuferramentas.add(jMenuItemsair);

        jMenuBar1.add(jMenuferramentas);

        jMenuservicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsul/Icones/configuração.png"))); // NOI18N
        jMenuservicos.setText("Serviços");
        jMenuservicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuservicosActionPerformed(evt);
            }
        });

        jMenuItemcidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsul/Icones/icons8-casa-28.png"))); // NOI18N
        jMenuItemcidades.setText("Cidades");
        jMenuItemcidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemcidadesActionPerformed(evt);
            }
        });
        jMenuservicos.add(jMenuItemcidades);

        jMenuItemclientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsul/Icones/pessoa.png"))); // NOI18N
        jMenuItemclientes.setText("Clientes");
        jMenuItemclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemclientesActionPerformed(evt);
            }
        });
        jMenuservicos.add(jMenuItemclientes);

        jMenuItemequipamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsul/Icones/ferramentas.png"))); // NOI18N
        jMenuItemequipamentos.setText("Equipamentos");
        jMenuItemequipamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemequipamentosActionPerformed(evt);
            }
        });
        jMenuservicos.add(jMenuItemequipamentos);

        jMenuItemfunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsul/Icones/trab.png"))); // NOI18N
        jMenuItemfunc.setText("Funcionários");
        jMenuItemfunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemfuncActionPerformed(evt);
            }
        });
        jMenuservicos.add(jMenuItemfunc);

        jMenuItemlocacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsul/Icones/emprestimo.png"))); // NOI18N
        jMenuItemlocacao.setText("Locação");
        jMenuItemlocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemlocacaoActionPerformed(evt);
            }
        });
        jMenuservicos.add(jMenuItemlocacao);

        jMenuBar1.add(jMenuservicos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemsairActionPerformed
        // TODO add your handling code here:
        System.exit(0);//encera o programa
    }//GEN-LAST:event_jMenuItemsairActionPerformed

    private void jMenuItemcidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemcidadesActionPerformed
        JFrame framecidades = new JFrame("Cidades");
        framecidades.setContentPane(new Formcidades());
        framecidades.setExtendedState(JFrame.MAXIMIZED_BOTH);
        framecidades.pack();
        framecidades.setLocationRelativeTo(null);
        framecidades.setVisible(true);
    }//GEN-LAST:event_jMenuItemcidadesActionPerformed

    private void jMenuItemclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemclientesActionPerformed
        JFrame frameclientes = new JFrame("Clientes");
        frameclientes.setContentPane(new Formcliente());
        frameclientes.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frameclientes.pack();
        frameclientes.setLocationRelativeTo(null);
        frameclientes.setVisible(true);
    }//GEN-LAST:event_jMenuItemclientesActionPerformed

    private void jMenuItemequipamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemequipamentosActionPerformed
        JFrame framequipamentos = new JFrame("Equipamentos");
        framequipamentos.setContentPane(new Formequipamento());
        framequipamentos.setExtendedState(JFrame.MAXIMIZED_BOTH);
        framequipamentos.pack();
        framequipamentos.setLocationRelativeTo(null);
        framequipamentos.setVisible(true);
    }//GEN-LAST:event_jMenuItemequipamentosActionPerformed

    private void jMenuItemfuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemfuncActionPerformed
        JFrame framefuncionarios = new JFrame("Funcionários");
        framefuncionarios.setContentPane(new Formfuncionarios());
        framefuncionarios.setExtendedState(JFrame.MAXIMIZED_BOTH);
        framefuncionarios.pack();
        framefuncionarios.setLocationRelativeTo(null);
        framefuncionarios.setVisible(true);
    }//GEN-LAST:event_jMenuItemfuncActionPerformed

    private void jMenuItemlocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemlocacaoActionPerformed
        JFrame framelocacao = new JFrame("Locação");
        framelocacao.setContentPane(new Formlocacao());
        framelocacao.setExtendedState(JFrame.MAXIMIZED_BOTH);
        framelocacao.pack();
        framelocacao.setLocationRelativeTo(null);
        framelocacao.setVisible(true);
    }//GEN-LAST:event_jMenuItemlocacaoActionPerformed

    private void jMenuservicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuservicosActionPerformed

    }//GEN-LAST:event_jMenuservicosActionPerformed

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
                if ("nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            // @Override
            public void run() {
                new Home().setVisible(true);//mostra a tela ao executar ou chamar o frame
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemcidades;
    private javax.swing.JMenuItem jMenuItemclientes;
    private javax.swing.JMenuItem jMenuItemequipamentos;
    private javax.swing.JMenuItem jMenuItemfunc;
    private javax.swing.JMenuItem jMenuItemlocacao;
    private javax.swing.JMenuItem jMenuItemsair;
    private javax.swing.JMenu jMenuferramentas;
    private javax.swing.JMenu jMenuservicos;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
