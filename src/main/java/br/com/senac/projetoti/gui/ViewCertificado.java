
package br.com.senac.projetoti.gui;

import br.com.senac.projetoti.DAO.CertificadoDAO;
import br.com.senac.projetoti.persistencia.Certificado;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ViewCertificado extends javax.swing.JFrame {
     
    public ViewCertificado() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNomeEmpresa = new javax.swing.JLabel();
        lblUf = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblParametrizacao = new javax.swing.JLabel();
        lblCnpj = new javax.swing.JLabel();
        txtNomeEmpresa = new javax.swing.JTextField();
        txtCnpj = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlCertificados = new javax.swing.JTable();
        lblTabelaGereneciamento = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        txtParametrizacao = new javax.swing.JTextField();
        txtStatusCertificado = new javax.swing.JTextField();
        txtUf = new javax.swing.JTextField();
        fmtData = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastrar Certificado Digital", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        lblNomeEmpresa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNomeEmpresa.setText("Nome Empresa:");

        lblUf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblUf.setText("UF:");

        lblStatus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblStatus.setText("Status:");

        lblParametrizacao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblParametrizacao.setText("Parametrização:");

        lblCnpj.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCnpj.setText("CNPJ:");

        jLabel6.setText("Data de vencimento:");

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        pnlCertificados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Título 1", "Título 2", "Título 3", "Título 4", "Título 5", "Título 6", "Título 7"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(pnlCertificados);

        lblTabelaGereneciamento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTabelaGereneciamento.setText("Tabela de Gerenciamento");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        txtParametrizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParametrizacaoActionPerformed(evt);
            }
        });

        txtUf.setPreferredSize(new java.awt.Dimension(50, 22));

        fmtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        jLabel1.setText("Pesquisar por Nome");

        btnPesquisar.setText("Pesquisar/Listar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTabelaGereneciamento)
                                .addGap(85, 85, 85)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPesquisar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblNomeEmpresa)
                                    .addComponent(jLabel6)
                                    .addComponent(lblStatus))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(fmtData)
                                            .addComponent(txtStatusCertificado, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(225, 225, 225)
                                                .addComponent(lblUf)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtUf, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(97, 97, 97))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblParametrizacao)
                                                    .addComponent(lblCnpj))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtParametrizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCadastrar)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir)
                .addGap(18, 18, 18)
                .addComponent(btnLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeEmpresa)
                    .addComponent(txtNomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCnpj)
                    .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblParametrizacao)
                    .addComponent(txtParametrizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fmtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatus)
                    .addComponent(txtStatusCertificado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUf)
                    .addComponent(txtUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTabelaGereneciamento)
                    .addComponent(jLabel1)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnExcluir)
                    .addComponent(btnLimpar)
                    .addComponent(btnVoltar))
                .addGap(22, 22, 22))
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtParametrizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParametrizacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtParametrizacaoActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        txtNomeEmpresa.setText("");
        txtCnpj.setText("");
        fmtData.setText("");
        txtUf.setText("");
        txtStatusCertificado.setText("");
        txtParametrizacao.setText("");
        
        txtNomeEmpresa.requestFocus();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
        try{
          if(pnlCertificados.getSelectedRow() >= 0){ //verifica se há algo selecionado na tabela
              //obtém o valor da coluna id da linha selecionada
              String id = (String)pnlCertificados.getValueAt(pnlCertificados.getSelectedRow(), 0);
              //janela de confirmação
              int resposta = JOptionPane.showConfirmDialog(this, "Deseja mesmo excluir o registro " + id + "?");
              if(resposta == 0)//0- yes, 1- no, 2- cancel
              {   
                  //realizando a exclusão
                  CertificadoDAO certificadosDAO = new CertificadoDAO();            
                  certificadosDAO.excluir(Integer.parseInt(id));
                  JOptionPane. showMessageDialog(this, "Registro excluído com sucesso");
                  //refazendo a pesquisa para atualizar a tabela na tela
                  btnPesquisarActionPerformed(evt);
              }
          }
      }catch(Exception e){
          JOptionPane.showMessageDialog(this, "Ocorreu uma falha:\n" + e.getMessage());
      }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        try{
            Certificado certificado = new Certificado();

            certificado.setCnpj(txtCnpj.getText());
            certificado.setData(LocalDate.parse(fmtData.getText(),DateTimeFormatter.ofPattern("dd/MM/y")));
            certificado.setUf(txtUf.getText());
            certificado.setNome(txtNomeEmpresa.getText());
            certificado.setParametrizacao(txtParametrizacao.getText());
            certificado.setStatusCertificado(txtStatusCertificado.getText());

            CertificadoDAO saveCertificado = new CertificadoDAO();
            saveCertificado.cadastrar(certificado);
            
            JOptionPane.showMessageDialog(this, "Cadastrado com Sucesso!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Ocorreu uma falha:\n" + e.getMessage());
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try{
          CertificadoDAO certificadoDAO = new CertificadoDAO();
          List<Certificado> certificado = 
              certificadoDAO.listar(txtFiltro.getText());
          
          preencheTabela(certificado);
      }catch(Exception e){
          JOptionPane.showMessageDialog(this, "Ocorreu uma falha:\n" + e.getMessage());
      }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCertificado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JFormattedTextField fmtData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCnpj;
    private javax.swing.JLabel lblNomeEmpresa;
    private javax.swing.JLabel lblParametrizacao;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTabelaGereneciamento;
    private javax.swing.JLabel lblUf;
    private javax.swing.JTable pnlCertificados;
    private javax.swing.JTextField txtCnpj;
    private javax.swing.JTextField txtFiltro;
    private javax.swing.JTextField txtNomeEmpresa;
    private javax.swing.JTextField txtParametrizacao;
    private javax.swing.JTextField txtStatusCertificado;
    private javax.swing.JTextField txtUf;
    // End of variables declaration//GEN-END:variables
    
        private boolean emptyFields(){

         boolean empty = true; 

         if(txtNomeEmpresa.getText().trim().isEmpty()){

             JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Nome Empresa não pode ser vazio.");
         } else if(txtCnpj.getText().trim().isEmpty()){

              JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! CNPJ não pode ser vazio.");
         } else if(fmtData.getText().trim().isEmpty()){

              JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Data Vencimento não pode ser vazio.");
         } else{

             empty = false;
         }
         return empty;
      }
        
        public void preencheTabela(List<Certificado> certificado){
        String colunas[] = {"Id", "Nome", "CNPJ", "UF", "DATA", "Status","Parametro"};
        String dados[][] = new String[certificado.size()][colunas.length];

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/y");
        int i=0;
        for(Certificado r: certificado){
            dados[i] = new String[]{ 
                String.valueOf(r.getId()), 
                r.getNome(), 
                r.getCnpj(), 
                r.getUf(),
                r.getData().format(formatter),
                r.getStatusCertificado(),
                r.getParametrizacao()
            };
            i++;
        }

        DefaultTableModel model = new DefaultTableModel(dados, colunas);
        pnlCertificados.setModel(model);
        }
      
}
