package Telas;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import programa.DiretorDaEscola;
import programa.Energia;
import programa.EntidadeDoGoverno;
import programa.Escola;
import programa.GerenciadorDeArquivos;
import programa.Pedido;


public class TelaPedidos extends javax.swing.JFrame {
    private JFrame paginaAnterior;
    private EntidadeDoGoverno entidade;
    private ArrayList<DiretorDaEscola> listaDiretores;
    private ArrayList<DiretorDaEscola> listaDiretoresnovo;
    private ArrayList<EntidadeDoGoverno> listaEntidade;
    private int indice;
    private int line;
    private Escola escola;
    Pedido pedidoselecionado;
    
    
    
    public TelaPedidos(JFrame paginaAnterior,EntidadeDoGoverno entidade)  {
        this.paginaAnterior = paginaAnterior;
        this.entidade = entidade;
        initComponents();
        btChamado.setEnabled(false);
        this.listaDiretores = new ArrayList();
        this.listaDiretoresnovo=new ArrayList();
        listaDiretores = carregarDiretores();
        carregarTabelaPedidos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JScrollPane = new javax.swing.JScrollPane();
        tbPedidos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtDiretor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAceito = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtObservacao = new javax.swing.JTextField();
        btChamado = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btVoltar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtEscola = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pedidos");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Imagens/brasil.png")).getImage());

        tbPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Diretor", "Escola", "Tipo", "Aceito", "Observação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPedidosMouseClicked(evt);
            }
        });
        JScrollPane.setViewportView(tbPedidos);
        if (tbPedidos.getColumnModel().getColumnCount() > 0) {
            tbPedidos.getColumnModel().getColumn(0).setResizable(false);
            tbPedidos.getColumnModel().getColumn(1).setResizable(false);
            tbPedidos.getColumnModel().getColumn(2).setResizable(false);
            tbPedidos.getColumnModel().getColumn(2).setPreferredWidth(10);
            tbPedidos.getColumnModel().getColumn(3).setResizable(false);
            tbPedidos.getColumnModel().getColumn(3).setPreferredWidth(10);
            tbPedidos.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel1.setText("Diretor");

        txtDiretor.setEditable(false);

        jLabel2.setText("Tipo");

        txtTipo.setEditable(false);

        jLabel3.setText("Aceito");

        txtAceito.setEditable(false);

        jLabel4.setText("Observação");

        txtObservacao.setEditable(false);

        btChamado.setText("Fazer Chamado");
        btChamado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btChamadoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel5.setText("Selecione o pedido para realizar o chamado:");

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        jLabel6.setText("Escola");

        txtEscola.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEscola))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTipo))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtAceito))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(99, 99, 99)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btChamado)
                                        .addGap(18, 18, 18)
                                        .addComponent(btVoltar))))
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtObservacao)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEscola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btChamado)
                            .addComponent(btVoltar))
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtAceito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
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
       
    private void btChamadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btChamadoActionPerformed
        String tipoChamado = txtTipo.getText();
        if(pedidoselecionado.isApto() == true){
            JOptionPane.showMessageDialog(null,"Chamado ja realizado","Menssagem",JOptionPane.PLAIN_MESSAGE);
        }
        else if(tipoChamado.equals("Energia")){
            
            try {
                entidade.criaChamadoEnergia(escola);
            } catch (IOException ex) {
                Logger.getLogger(TelaPedidos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TelaPedidos.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null,"Chamado criado com sucesso!","Menssagem",JOptionPane.PLAIN_MESSAGE);
            listaDiretores = carregarDiretores();
            for(int i =0;i<listaDiretores.size();i++){
                DiretorDaEscola diretor = listaDiretores.get(i);
                if(pedidoselecionado.getDiretorDaEscola().getCpf() == diretor.getCpf() && pedidoselecionado.getDiretorDaEscola().getNome().equals(diretor.getNome())){
                    for(int j= 0;j<diretor.getPedidos().size();j++){
                        if(pedidoselecionado.getTipo().equals(diretor.getPedidos().get(j).getTipo())){
                            listaDiretores.get(i).getPedidos().get(j).atualizacao(true, " Pedido Realizado");
                            //JOptionPane.showMessageDialog(null,"pedido atualizado","Menssagem",JOptionPane.PLAIN_MESSAGE);
                        }
                    }
                }
            }
            
            
            atualizarPedidos(listaDiretores);
            
        }
        else if(tipoChamado.equals("Computador")){
            try {
                entidade.criaChamadoComputador(escola);
            } catch (IOException ex) {
                Logger.getLogger(TelaPedidos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TelaPedidos.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null,"Chamado criado com sucesso!","Menssagem",JOptionPane.PLAIN_MESSAGE);
            listaDiretores = carregarDiretores();
            for(int i =0;i<listaDiretores.size();i++){
                DiretorDaEscola diretor = listaDiretores.get(i);
                if(pedidoselecionado.getDiretorDaEscola().getCpf() == diretor.getCpf() && pedidoselecionado.getDiretorDaEscola().getNome().equals(diretor.getNome())){
                    for(int j= 0;j<diretor.getPedidos().size();j++){
                        if(pedidoselecionado.getTipo().equals(diretor.getPedidos().get(j).getTipo())){
                            listaDiretores.get(i).getPedidos().get(j).atualizacao(true, " Pedido Realizado");
                            
                        }
                    }
                }
            }
            
            
            atualizarPedidos(listaDiretores);
            
        }
        else if(tipoChamado.equals("Internet")){
            try {
                entidade.criaChamadoInternet(escola);
            } catch (IOException ex) {
                Logger.getLogger(TelaPedidos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TelaPedidos.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null,"Chamado criado com sucesso!","Menssagem",JOptionPane.PLAIN_MESSAGE);
            listaDiretores = carregarDiretores();
            for(int i =0;i<listaDiretores.size();i++){
                DiretorDaEscola diretor = listaDiretores.get(i);
                if(pedidoselecionado.getDiretorDaEscola().getCpf() == diretor.getCpf() && pedidoselecionado.getDiretorDaEscola().getNome().equals(diretor.getNome())){
                    for(int j= 0;j<diretor.getPedidos().size();j++){
                        if(pedidoselecionado.getTipo().equals(diretor.getPedidos().get(j).getTipo())){
                            listaDiretores.get(i).getPedidos().get(j).atualizacao(true, " Pedido Realizado");
                            //JOptionPane.showMessageDialog(null,"pedido atualizado","Menssagem",JOptionPane.PLAIN_MESSAGE);
                        }
                    }
                }
            }
            
            
            
            atualizarPedidos(listaDiretores);
            
        }
        
        else{
            JOptionPane.showMessageDialog(null,"Não foi possivel criar o chamado!","Erro",JOptionPane.ERROR);
        }
        txtDiretor.setText("");
        txtEscola.setText("");
        txtTipo.setText("");
        txtAceito.setText("");
        txtObservacao.setText("");
        btChamado.setEnabled(false);
        this.listaDiretores = carregarDiretores();
        carregarTabelaPedidos();
    }//GEN-LAST:event_btChamadoActionPerformed

    private void tbPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPedidosMouseClicked
        indice = tbPedidos.getSelectedRow();
        listaDiretores = carregarDiretores();
        ArrayList<Pedido> pedidos =new ArrayList<>();
        for(DiretorDaEscola dir : listaDiretores){
            pedidos.addAll(dir.getPedidos());
        }
        
        pedidoselecionado = pedidos.get(indice);
        escola = pedidoselecionado.getDiretorDaEscola().getEscola();
        txtDiretor.setText(pedidoselecionado.getDiretorDaEscola().getNome());
        txtEscola.setText(pedidoselecionado.getDiretorDaEscola().getEscola().getNome());
        txtTipo.setText(pedidoselecionado.getTipo());
        txtAceito.setText(String.valueOf(pedidoselecionado.isApto()));
        txtObservacao.setText(pedidoselecionado.getObs());
                   

        
        btChamado.setEnabled(true);
    }//GEN-LAST:event_tbPedidosMouseClicked

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        paginaAnterior.setVisible(true);
        this.setVisible(false);
        this.dispose(); 
    }//GEN-LAST:event_btVoltarActionPerformed
    public void carregarTabelaPedidos(){
        
        listaDiretores = carregarDiretores();
        ArrayList<Pedido> pedidos =new ArrayList<>();
        for(DiretorDaEscola dir : listaDiretores){
            pedidos.addAll(dir.getPedidos());
        }
        Object[] colunas = new Object[]{"Diretor","Escola","Aceito","Tipo","Observação"};
        Object[][] dadosPedidos = new Object[pedidos.size()][colunas.length]; 
        for(int i=0;i<pedidos.size();i++){    
                Object linha[]=new Object[]{pedidos.get(i).getDiretorDaEscola().getNome(),
                                            pedidos.get(i).getDiretorDaEscola().getEscola().getNome(),
                                            pedidos.get(i).isApto(),
                                            pedidos.get(i).getTipo(),
                                            pedidos.get(i).getObs()};
                dadosPedidos[i] = linha;  
                   
        }
        DefaultTableModel modelo = new DefaultTableModel(dadosPedidos,colunas);
        tbPedidos.setModel(modelo);
    }
    public ArrayList<DiretorDaEscola> carregarDiretores(){
        
        try{
            File arquivoDiretores = new File("src\\dados\\usuarios\\diretores.txt");
            GerenciadorDeArquivos<DiretorDaEscola> gerenciadorDeArquivosDiretores = new GerenciadorDeArquivos<>();
            if (!arquivoDiretores.isDirectory() && arquivoDiretores.exists()) {
                    this.listaDiretores = gerenciadorDeArquivosDiretores.lerArquivo(arquivoDiretores);
                }
        }catch (IOException | ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null,"Ocorreu um Erro ao abrir os arquivo de Diretores aqui (" + e.toString() + ")" ,"ERRO" ,JOptionPane.ERROR_MESSAGE);
                //this.dispose();
        }
        return this.listaDiretores;
    }
    
    public void atualizarPedidos(ArrayList<DiretorDaEscola> listaDiretores){
        this.listaDiretores = listaDiretores;
        try{
            File arquivoDiretores = new File("src\\dados\\usuarios\\diretores.txt");
            GerenciadorDeArquivos<DiretorDaEscola> gerenciadorDeArquivosDiretores = new GerenciadorDeArquivos<>();
            if (!arquivoDiretores.isDirectory() && arquivoDiretores.exists()) {
                   gerenciadorDeArquivosDiretores.EscreverArquivo(listaDiretores,arquivoDiretores);
                }
        }catch (IOException e) {
                JOptionPane.showMessageDialog(null,"Ocorreu um Erro Durante a escrita do Arquivo de Diretores aqui(" + e.toString() + ")" ,"ERRO" ,JOptionPane.ERROR_MESSAGE);
                //this.dispose();
        }
    }
    public ArrayList<EntidadeDoGoverno> carregarEntidades(){
        
        try{
            File arquivo = new File("src\\dados\\usuarios\\entidades.txt");
            GerenciadorDeArquivos<EntidadeDoGoverno> gerenciadorDeArquivos = new GerenciadorDeArquivos<>();
            if (!arquivo.isDirectory() && arquivo.exists()) {
                    this.listaEntidade = gerenciadorDeArquivos.lerArquivo(arquivo);
                }
        }catch (IOException | ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null,"Ocorreu um Erro ao abrir os arquivo de Entidades (" + e.toString() + ")" ,"ERRO" ,JOptionPane.ERROR_MESSAGE);
                //this.dispose();
        }
        return this.listaEntidade;
    }
    
    public void atualizarEntidades(ArrayList<EntidadeDoGoverno> listaEntidade){
        this.listaEntidade = listaEntidade;
        try{
            File arquivo = new File("src\\dados\\usuarios\\entidades.txt");
            GerenciadorDeArquivos<EntidadeDoGoverno> gerenciadorDeArquivos = new GerenciadorDeArquivos<>();
            if (!arquivo.isDirectory() && arquivo.exists()) {
                   gerenciadorDeArquivos.EscreverArquivo(listaEntidade,arquivo);
                }
        }catch (IOException e) {
                JOptionPane.showMessageDialog(null,"Ocorreu um Erro Durante a escrita do Arquivo de Entidades (" + e.toString() + ")" ,"ERRO" ,JOptionPane.ERROR_MESSAGE);
                //this.dispose();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane JScrollPane;
    private javax.swing.JButton btChamado;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable tbPedidos;
    private javax.swing.JTextField txtAceito;
    private javax.swing.JTextField txtDiretor;
    private javax.swing.JTextField txtEscola;
    private javax.swing.JTextField txtObservacao;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
