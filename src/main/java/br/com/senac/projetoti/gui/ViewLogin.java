
package br.com.senac.projetoti.gui;

import br.com.senac.projetoti.DAO.UsuarioDAO;
import br.com.senac.projetoti.persistencia.Usuario;
import javax.swing.JOptionPane;

public class ViewLogin extends javax.swing.JFrame {

    public ViewLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlInputEntrada = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        btnEntrar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlInputEntrada.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gerenciamento de TI", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        lblLogin.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblLogin.setText("Login");

        txtLogin.setPreferredSize(new java.awt.Dimension(65, 30));
        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });

        lblSenha.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblSenha.setText("Senha");

        txtSenha.setPreferredSize(new java.awt.Dimension(65, 30));
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar-se");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlInputEntradaLayout = new javax.swing.GroupLayout(pnlInputEntrada);
        pnlInputEntrada.setLayout(pnlInputEntradaLayout);
        pnlInputEntradaLayout.setHorizontalGroup(
            pnlInputEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInputEntradaLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInputEntradaLayout.createSequentialGroup()
                .addContainerGap(283, Short.MAX_VALUE)
                .addGroup(pnlInputEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInputEntradaLayout.createSequentialGroup()
                        .addGroup(pnlInputEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLogin)
                            .addComponent(lblSenha))
                        .addGap(24, 24, 24)
                        .addGroup(pnlInputEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlInputEntradaLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnRegistrar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEntrar)))
                .addGap(280, 280, 280))
        );
        pnlInputEntradaLayout.setVerticalGroup(
            pnlInputEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInputEntradaLayout.createSequentialGroup()
                .addContainerGap(201, Short.MAX_VALUE)
                .addGroup(pnlInputEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogin)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlInputEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSenha)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(pnlInputEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntrar)
                    .addComponent(btnRegistrar))
                .addGap(180, 180, 180)
                .addComponent(btnSair)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlInputEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlInputEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
       
    }//GEN-LAST:event_txtLoginActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
       
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
       ViewNewUsuario newUser = new ViewNewUsuario();
       newUser.setVisible(true);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        Usuario usuario = new Usuario();

        // Atribuimos os valores Login e Senha baseado nos dados dos componentes JTextField
        usuario.setLoginUsuario(txtLogin.getText());
        usuario.setSenhaUsuario(txtSenha.getText());        

        // Exemplo de SQL Injection baseada em booleano
        usuario = UsuarioDAO.validarUsuarioSeguro(usuario);


        // "Reescrevemos" os valores do objeto baseado na resposta do método
        // Se nenhum registro for encontrado, teremos um usuário NULO           
        if (usuario != null) {
            // Dependendo do tipo de usuário, levamos a uma página diferente
                JOptionPane.showMessageDialog(null, "Bem-vindo, " + usuario.getNomeUsuario());
                dispose();
                ViewFerramentas telaPrincipal = new ViewFerramentas();
                telaPrincipal.setVisible(true);
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JPanel pnlInputEntrada;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables
    
}
