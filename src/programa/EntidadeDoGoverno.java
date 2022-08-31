package programa;

import java.io.Serializable;

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
    
}
