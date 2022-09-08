package programa;

import java.io.IOException;
import java.io.Serializable;


public abstract class Usuario  implements Serializable{
    private static final long serialVersionUID = 1L;
    private String login;
    private String senha;
    private String nome;

    public Usuario(String login, String senha, String nome) {
        this.login = login;
        this.senha = senha;
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }
    
     public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    abstract public void mudarNome(String nome) throws IOException, ClassNotFoundException;
    
    abstract public void mudarSenha(String senha) throws IOException, ClassNotFoundException; 
}
