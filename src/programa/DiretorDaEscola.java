package programa;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DiretorDaEscola extends Usuario implements Serializable{
    private static final long serialVersionUID = 1L;
    private long cpf;
    private String telefone;
    private Escola escola;
    private ArrayList<Pedido> pedidos = new ArrayList<>();
    
    public DiretorDaEscola(long cpf, String telefone, String login, String senha, String nome, Escola escola) {
        super(login, senha, nome);
        this.cpf = cpf;
        this.telefone = telefone;
        this.escola = escola;
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }
    
    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public void mudarNome(String nome) throws IOException, ClassNotFoundException{
        try {
            File arquivo = new File("src\\dados\\usuarios\\diretores.txt");
            setNome(nome);
            GerenciadorDeArquivos<DiretorDaEscola> gerenciadorDeArquivos = new GerenciadorDeArquivos<>();
            ArrayList<DiretorDaEscola> diretores = gerenciadorDeArquivos.lerArquivo(arquivo);
            for (int i = 0; i < diretores.size(); i++) {
                DiretorDaEscola diretor = diretores.get(i);
                if (this.getLogin().equals(diretor.getLogin()) && 
                        this.cpf == diretor.getCpf()) {
                   diretores.set(i, this);
                   gerenciadorDeArquivos.EscreverArquivo(diretores, arquivo);
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            throw e;
        } 
    }

    @Override
    public void mudarSenha(String senha) throws IOException, ClassNotFoundException {
        try {
            File arquivo = new File("src\\dados\\usuarios\\diretores.txt");
            setSenha(senha);
            GerenciadorDeArquivos<DiretorDaEscola> gerenciadorDeArquivos = new GerenciadorDeArquivos<>();
            ArrayList<DiretorDaEscola> diretores = gerenciadorDeArquivos.lerArquivo(arquivo);
            for (int i = 0; i < diretores.size(); i++) {
                DiretorDaEscola diretor = diretores.get(i);
                if (this.getLogin().equals(diretor.getLogin()) && 
                        this.cpf == diretor.getCpf()) {
                   diretores.set(i, this);
                   gerenciadorDeArquivos.EscreverArquivo(diretores, arquivo);
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            throw e;
        } 
    }
    
    public ArrayList<Pedido> getPedidos() {
        return this.pedidos;
    }
    
    public boolean fazerPedido(Pedido novoPedido) throws IOException, ClassNotFoundException{
        try {
            for (Pedido pedido : pedidos) {
                if(pedido.getTipo().equals(novoPedido.getTipo())){
                    return false;
                }
            }
            File arquivo = new File("src\\dados\\usuarios\\diretores.txt");
            pedidos.add(novoPedido);
            GerenciadorDeArquivos<DiretorDaEscola> gerenciadorDeArquivos = new GerenciadorDeArquivos<>();
            ArrayList<DiretorDaEscola> diretores = gerenciadorDeArquivos.lerArquivo(arquivo);
            for (int i = 0; i < diretores.size(); i++) {
                DiretorDaEscola diretor = diretores.get(i);
                if (this.getLogin().equals(diretor.getLogin()) && 
                        this.cpf == diretor.getCpf()) {
                    diretores.set(i, this);
                    gerenciadorDeArquivos.EscreverArquivo(diretores, arquivo);
                }
            }
            return true;
        } catch (IOException | ClassNotFoundException e) {
            throw e;
        }
    }
    
    public void removerPedido(int indice) throws IOException, ClassNotFoundException{
        try {
            File arquivo = new File("src\\dados\\usuarios\\diretores.txt");
            pedidos.remove(indice);
            GerenciadorDeArquivos<DiretorDaEscola> gerenciadorDeArquivos = new GerenciadorDeArquivos<>();
            ArrayList<DiretorDaEscola> diretores = gerenciadorDeArquivos.lerArquivo(arquivo);
            for (int i = 0; i < diretores.size(); i++) {
                DiretorDaEscola diretor = diretores.get(i);
                if (this.getLogin().equals(diretor.getLogin()) && 
                        this.cpf == diretor.getCpf()) {
                    diretores.set(i, this);
                    gerenciadorDeArquivos.EscreverArquivo(diretores, arquivo);
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            throw e;
        }
        
    }
}
