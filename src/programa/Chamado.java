package programa;

import java.io.Serializable;


public abstract class Chamado implements Serializable {
    private static final long serialVersionUID = 1L;
    protected int id;
    protected String data;
    protected boolean resolvido;
    protected Escola escola;
    

    public Chamado(int id, String data, Escola escola) {
        this.id = id;
        this.data = data;
        this.escola = escola;
        
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isResolvido() {
        return resolvido;
    }

    public void setResolvido(boolean resolvido) {
        this.resolvido = resolvido;
    }
    
    public abstract int resolverChamado();
}
