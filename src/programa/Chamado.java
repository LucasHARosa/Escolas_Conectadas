package programa;


public abstract class Chamado {
    protected int id;
    protected String data;
    protected boolean resolvido;
    protected EntidadeDoGoverno entidadeDoGoverno;

    public Chamado(int id, String data, EntidadeDoGoverno entidadeDoGoverno) {
        this.id = id;
        this.data = data;
        this.entidadeDoGoverno = entidadeDoGoverno;
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
    
    abstract  void resolverChamado();
    
}
