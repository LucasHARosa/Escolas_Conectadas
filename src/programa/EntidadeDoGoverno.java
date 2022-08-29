package programa;

public class EntidadeDoGoverno extends Usuario {
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
    
}
