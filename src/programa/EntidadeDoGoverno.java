package programa;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EntidadeDoGoverno extends Usuario implements Serializable{
    private static final long serialVersionUID = 1L;
    private String cargo;
    private int identificacao;
    

    public EntidadeDoGoverno(String cargo, int identificacao, String login, String senha, String nome) {
        super(login, senha, nome);
        this.cargo = cargo;
        this.identificacao = identificacao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
    }
    
    @Override
    public String toString(){
        return "Login:"  + this.getLogin()  + "\nSenha: " + this.getSenha(); 
    }

    @Override
    public void mudarNome(String nome) throws IOException, ClassNotFoundException {
        try {
            File arquivo = new File("src\\dados\\usuarios\\entidades.txt");
            setNome(nome);
            GerenciadorDeArquivos<EntidadeDoGoverno> gerenciadorDeArquivos = new GerenciadorDeArquivos<>();
            ArrayList<EntidadeDoGoverno> entidades = gerenciadorDeArquivos.lerArquivo(arquivo);
            for (int i = 0; i < entidades.size(); i++) {
                EntidadeDoGoverno entidade = entidades.get(i);
                if (this.getLogin().equals(entidade.getLogin()) && 
                        this.identificacao == entidade.getIdentificacao()) {
                   entidades.set(i, this);
                   gerenciadorDeArquivos.EscreverArquivo(entidades, arquivo);
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            throw e;
        } 
    }

    @Override
    public void mudarSenha(String senha) throws IOException, ClassNotFoundException {
        try {
            File arquivo = new File("src\\dados\\usuarios\\entidades.txt");
            setSenha(senha);
            GerenciadorDeArquivos<EntidadeDoGoverno> gerenciadorDeArquivos = new GerenciadorDeArquivos<>();
            ArrayList<EntidadeDoGoverno> entidades = gerenciadorDeArquivos.lerArquivo(arquivo);
            for (int i = 0; i < entidades.size(); i++) {
                EntidadeDoGoverno entidade = entidades.get(i);
                if (this.getLogin().equals(entidade.getLogin()) && 
                        this.identificacao == entidade.getIdentificacao()) {
                   entidades.set(i, this);
                   gerenciadorDeArquivos.EscreverArquivo(entidades, arquivo);
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            throw e;
        } 
    }
    public void criaChamadoEnergia(Escola escola) throws IOException, ClassNotFoundException {
        Energia novoEnergia = new Energia("Provedora De Energia Local",
                "Rede pública",
                1200,
                1,
                "Outubro",
                escola);
        
        novoEnergia.setResolvido(false);
        try {
            File arquivo = new File("src\\dados\\usuarios\\chamadosEnergia.txt");
            
            GerenciadorDeArquivos<Energia> gerenciadorDeArquivos = new GerenciadorDeArquivos<>();
            ArrayList<Energia> energia = new ArrayList<>();
            if (!arquivo.isDirectory() && arquivo.exists()) {
                energia = gerenciadorDeArquivos.lerArquivo(arquivo);
            }
            energia.add(novoEnergia);
            gerenciadorDeArquivos.EscreverArquivo(energia, arquivo);  
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,"Ocorreu um Erro ao abrir o arquivo aqui (" + e.toString() + ")" ,"ERRO" ,JOptionPane.ERROR_MESSAGE);
        }   
        
    }
    public void criaChamadoInternet(Escola escola) throws IOException, ClassNotFoundException{
        int quantidadePontos = escola.getNumMatriculas()/10;
        Internet novoInternet = new Internet("Provedora De Internet Local",
                quantidadePontos,
                100,
                quantidadePontos*150,
                2,
                "Outubro",
                escola);
        
        novoInternet.setResolvido(false);
        try {
            File arquivo = new File("src\\dados\\usuarios\\chamadosInternet.txt");
            
            GerenciadorDeArquivos<Internet> gerenciadorDeArquivos = new GerenciadorDeArquivos<>();
            ArrayList<Internet> internet = new ArrayList<>();
            if (!arquivo.isDirectory() && arquivo.exists()) {
                internet = gerenciadorDeArquivos.lerArquivo(arquivo);
            }
            internet.add(novoInternet);
            gerenciadorDeArquivos.EscreverArquivo(internet, arquivo);  
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,"Ocorreu um Erro ao abrir o arquivo aqui (" + e.toString() + ")" ,"ERRO" ,JOptionPane.ERROR_MESSAGE);
        }
        
    }
    public void criaChamadoComputador(Escola escola) throws IOException, ClassNotFoundException{
        int quantidadeComputador = escola.getNumMatriculas()-escola.getNumComputador();
        Computador novoComputador;
        if(quantidadeComputador <= 0){
            quantidadeComputador = 0;
            novoComputador = new Computador("Nenhum",
                quantidadeComputador,
                "Nenhum",
                0,
                3,
                "Outubro",
                escola);
        }
        else{
            novoComputador = new Computador("Empresa local",
                quantidadeComputador,
                "Marca",
                quantidadeComputador*1000,
                3,
                "Outubro",
                escola);
            
        }
        novoComputador.setResolvido(false);
        try {
            File arquivo = new File("src\\dados\\usuarios\\chamadosComputador.txt");
            
            GerenciadorDeArquivos<Computador> gerenciadorDeArquivos = new GerenciadorDeArquivos<>();
            ArrayList<Computador> computador = new ArrayList<>();
            if (!arquivo.isDirectory() && arquivo.exists()) {
                computador = gerenciadorDeArquivos.lerArquivo(arquivo);
            }
            computador.add(novoComputador);
            gerenciadorDeArquivos.EscreverArquivo(computador, arquivo);  
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,"Ocorreu um Erro ao abrir o arquivo aqui (" + e.toString() + ")" ,"ERRO" ,JOptionPane.ERROR_MESSAGE);
        }
    }
}
