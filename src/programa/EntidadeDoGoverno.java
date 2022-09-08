package programa;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class EntidadeDoGoverno extends Usuario implements Serializable{
    private static final long serialVersionUID = 1L;
    private String cargo;
    private int identificacao;

    public EntidadeDoGoverno() {
        super(null, null, null);
    }
    
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
    
}
