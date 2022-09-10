package programa;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class EntidadeDoGoverno extends Usuario implements Serializable{
    private static final long serialVersionUID = 1L;
    private String cargo;
    private int identificacao;
    private ArrayList<Energia> chamadoEnergia;
    private ArrayList<Internet> chamadoInternet;
    private ArrayList<Computador> chamadoComputador;

    public EntidadeDoGoverno() {
        super(null, null, null);
    }
    public EntidadeDoGoverno(String cargo, int identificacao, String login, String senha, String nome) {
        super(login, senha, nome);
        this.cargo = cargo;
        this.identificacao = identificacao;
    }
    public ArrayList<Energia> getChamadoEnergia() {
        return chamadoEnergia;
    }

    public void setAdicionaChamadoEnergia(Energia chamadoEnergia) {
        this.chamadoEnergia.add(chamadoEnergia);
    }


    public ArrayList<Internet> getChamadoInternet() {
        return chamadoInternet;
    }

    public void setAdicionaChamadoInternet(Internet chamadoInternet) {
        this.chamadoInternet.add(chamadoInternet);
    }

    public ArrayList<Computador> getChamadoComputador() {
        return chamadoComputador;
    }

    public void setAdicionaChamadoComputador(Computador chamadoComputador) {
        this.chamadoComputador.add(chamadoComputador);
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
    public void criaChamadoEnergia(Escola escola){
        Energia novoEnergia = new Energia("Provedora De Energia Local",
                "Rede pública",
                1200-(this.chamadoEnergia.size()*10),
                this.chamadoEnergia.size()+1,
                "Outubro",
                escola);
        
        novoEnergia.setResolvido(false);
        setAdicionaChamadoEnergia(novoEnergia);
    }
    public void criaChamadoInternet(Escola escola){
        int quantidadePontos = escola.getNumMatriculas()/10;
        Internet novoInternet = new Internet("Provedora De Internet Local",
                quantidadePontos,
                (this.chamadoInternet.size()*10)+100,
                quantidadePontos*150,
                this.chamadoEnergia.size()+1,
                "Outubro",
                escola);
        
        novoInternet.setResolvido(false);
        setAdicionaChamadoInternet(novoInternet);
    }
    public void criaChamadoComputador(Escola escola){
        int quantidadeComputador = escola.getNumMatriculas()-escola.getNumComputador();
        Computador novoComputador;
        if(quantidadeComputador<0){
            quantidadeComputador = 0;
            novoComputador = new Computador("Nenhum",
                quantidadeComputador,
                "Nenhum",
                0,
                this.chamadoComputador.size()+1,
                "Outubro",
                escola);
        }
        else{
            novoComputador = new Computador("Empresa local",
                quantidadeComputador,
                "Marca",
                quantidadeComputador*1000,
                this.chamadoComputador.size()+1,
                "Outubro",
                escola);
            
        }
        novoComputador.setResolvido(false);
        setAdicionaChamadoComputador(novoComputador);
    }
}
