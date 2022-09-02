package programa;

import java.io.Serializable;


public class DiretorDaEscola extends Usuario implements Serializable{
    private static final long serialVersionUID = 1L;
    private long cpf;
    private String telefone;
    private Escola escola;

    public DiretorDaEscola(long cpf, String telefone, String login, String senha, String nome) {
        super(login, senha, nome);
        this.cpf = cpf;
        this.telefone = telefone;
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
    
}
