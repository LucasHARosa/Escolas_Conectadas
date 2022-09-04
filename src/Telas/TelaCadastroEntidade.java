/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import programa.DiretorDaEscola;
import programa.EntidadeDoGoverno;
import programa.GerenciadorDeArquivos;

/**
 *
 * @author Marcos Eduardo
 */
public class TelaCadastroEntidade extends javax.swing.JFrame {
    private JFrame paginaAnterior;
    private ArrayList<EntidadeDoGoverno> entidades = new ArrayList<EntidadeDoGoverno>();
    private ArrayList<DiretorDaEscola> diretores = new ArrayList<>();
    /**
     * Creates new form NewJFrame
     */
    public TelaCadastroEntidade(JFrame paginaAnterior) {
        this.paginaAnterior = paginaAnterior;
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

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        campoNome = new javax.swing.JTextField();
        campoLogin = new javax.swing.JTextField();
        campoCargo = new javax.swing.JTextField();
        campoSenha = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        botaoCadastro = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();
        campoIdentificacao = new javax.swing.JFormattedTextField();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Entidade do Governo");

        jLabel3.setText("Nome:");

        jLabel4.setText("Login:");

        jLabel5.setText("Senha:");

        jLabel6.setText("Cargo:");

        jLabel7.setText(" Identificação:");

        botaoCadastro.setText("Cadastrar");
        botaoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastroActionPerformed(evt);
            }
        });

        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        try {
            campoIdentificacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(botaoCadastro)
                        .addGap(18, 18, 18)
                        .addComponent(botaoVoltar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoSenha)
                            .addComponent(campoLogin)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(campoCargo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoIdentificacao)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(campoCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campoIdentificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCadastro)
                    .addComponent(botaoVoltar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastroActionPerformed
        if(campoCargo.getText().isBlank() || 
                campoIdentificacao.getText().isBlank() ||
                campoLogin.getText().isBlank() || 
                campoNome.getText().isBlank() ||
                new String(campoSenha.getPassword()).isBlank()
                ){ 
            JOptionPane.showMessageDialog(null,"Por favor preencha todos os campos para o cadastro","AVISO" ,JOptionPane.WARNING_MESSAGE);
        }
        else{
            try {
                boolean loginJaExiste = false;
                File arquivoEntidades = new File("src\\dados\\usuarios\\entidades.txt" );
                File arquivoDiretores = new File("src\\dados\\usuarios\\diretores.txt");
                GerenciadorDeArquivos<EntidadeDoGoverno> gerenciadorDeArquivosEntidades = new GerenciadorDeArquivos<>();
                GerenciadorDeArquivos<DiretorDaEscola> gerenciadorDeArquivosDiretor = new GerenciadorDeArquivos<>();
                if (!arquivoEntidades.isDirectory() && arquivoEntidades.exists()) {
                    entidades = gerenciadorDeArquivosEntidades.lerArquivo(arquivoEntidades);
                }
                if (!arquivoDiretores.isDirectory() && arquivoDiretores.exists()) {
                    diretores = gerenciadorDeArquivosDiretor.lerArquivo(arquivoDiretores);
                }
                EntidadeDoGoverno novaEntidade = new EntidadeDoGoverno(campoCargo.getText(),
                Integer.parseInt(campoIdentificacao.getText()),
                campoLogin.getText(),
                new String(campoSenha.getPassword()),
                campoNome.getText());
                
                for (EntidadeDoGoverno entidade : entidades) {
                    if(entidade.getLogin().equals(novaEntidade.getLogin())|| 
                        entidade.getIdentificacao() == novaEntidade.getIdentificacao()){
                        loginJaExiste = true;
                    }
                }
                for (DiretorDaEscola diretor : diretores) {
                     if(diretor.getLogin().equals(novaEntidade.getLogin())){
                        loginJaExiste = true;
                    }
                }
                if (!loginJaExiste) {
                    entidades.add(novaEntidade);
                    gerenciadorDeArquivosEntidades.EscreverArquivo(entidades, arquivoEntidades);
                    ((TelaInicial) paginaAnterior).setEntidadesCadastradas(entidades);
                    botaoVoltarActionPerformed(evt);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Este usuário já existe, por favor verifique seu login ou sua identificação","AVISO" ,JOptionPane.WARNING_MESSAGE);
                }
            }
            catch (HeadlessException | IOException | ClassNotFoundException | NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Ocorreu um Erro com o Arquivo de Entidades (" + e.toString() + ")" ,"ERRO" ,JOptionPane.ERROR_MESSAGE);
                botaoVoltarActionPerformed(evt);
            } 
        }
    }//GEN-LAST:event_botaoCadastroActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        paginaAnterior.setVisible(true);
        this.setVisible(false);
        this.dispose();       // TODO add your handling code here:
    }//GEN-LAST:event_botaoVoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastro;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JTextField campoCargo;
    private javax.swing.JFormattedTextField campoIdentificacao;
    private javax.swing.JTextField campoLogin;
    private javax.swing.JTextField campoNome;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
