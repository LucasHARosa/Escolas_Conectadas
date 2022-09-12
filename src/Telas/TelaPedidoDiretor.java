package Telas;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import programa.DiretorDaEscola;
import programa.GerenciadorDeArquivos;
import programa.Pedido;


public class TelaPedidoDiretor extends javax.swing.JFrame {
    private JFrame paginaAnterior;
    private DiretorDaEscola diretor;
    private String tipoEscolhido = "";
    
    /**
     * Creates new form TelaPedidoDiretor
     */
    public TelaPedidoDiretor(JFrame paginaAnterior, DiretorDaEscola diretor) {
        this.paginaAnterior = paginaAnterior;
        this.diretor = diretor;
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoDePedido = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        observacao = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        botaoPedido = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fazer Pedido");

        jLabel1.setText("Selecione o Tipo de Pedido: ");

        tipoDePedido.add(jRadioButton1);
        jRadioButton1.setText("Energia");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        tipoDePedido.add(jRadioButton2);
        jRadioButton2.setText("Computador");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        tipoDePedido.add(jRadioButton3);
        jRadioButton3.setText("Internet");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        observacao.setColumns(20);
        observacao.setRows(5);
        jScrollPane1.setViewportView(observacao);

        jLabel2.setText("Observações:");

        botaoPedido.setText("Fazer Pedido");
        botaoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPedidoActionPerformed(evt);
            }
        });

        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botaoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton1)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton2)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoPedido)
                    .addComponent(botaoVoltar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPedidoActionPerformed
        
        if (tipoEscolhido.isBlank()) {
            JOptionPane.showMessageDialog(null,"Por favor selecione um tipo de pedido","AVISO" ,JOptionPane.WARNING_MESSAGE);
        } 
        else{
            try {
                Pedido novoPedido = new Pedido(tipoEscolhido, diretor, observacao.getText());
                
                boolean pedidoFoiRealizado = diretor.fazerPedido(novoPedido);
                if (!pedidoFoiRealizado) {
                    JOptionPane.showMessageDialog(null,"Um pedido desse tipo já foi realizado, por favor exclua-o caso seja necessário realizar outro",
                            "AVISO" ,JOptionPane.WARNING_MESSAGE);
                }
                else{
                    botaoVoltarActionPerformed(evt);   
                }
            } catch (IOException | ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null,"Ocorreu um Erro Durante a Realização do Pedido (" + e.toString() + ")" ,"ERRO" ,JOptionPane.ERROR_MESSAGE);
                botaoVoltarActionPerformed(evt);
            }
        }
    }//GEN-LAST:event_botaoPedidoActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        tipoEscolhido = jRadioButton3.getText();
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        tipoEscolhido = jRadioButton2.getText();
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        tipoEscolhido = jRadioButton1.getText();
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        paginaAnterior.setVisible(true);
        this.setVisible(false);
        this.dispose(); 
    }//GEN-LAST:event_botaoVoltarActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoPedido;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea observacao;
    private javax.swing.ButtonGroup tipoDePedido;
    // End of variables declaration//GEN-END:variables
}
