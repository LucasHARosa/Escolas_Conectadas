package programa;

public class Energia extends Chamado {
    private String prestadora;
    private String tipo;
    private float valorMensal;

    public Energia(String prestadora, String tipo, float valorMensal, int id, String data, EntidadeDoGoverno entidadeDoGoverno) {
        super(id, data, entidadeDoGoverno);
        this.prestadora = prestadora;
        this.tipo = tipo;
        this.valorMensal = valorMensal;
    }

   

    public String getPrestadora() {
        return prestadora;
    }

    public void setPrestadora(String prestadora) {
        this.prestadora = prestadora;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getValorMensal() {
        return valorMensal;
    }

    public void setValorMensal(float valorMensal) {
        this.valorMensal = valorMensal;
    }

    public boolean isResolvido() {
        return resolvido;
    }

    public void setResolvido(boolean resolvido) {
        this.resolvido = resolvido;
    }
    
    @Override
    public void resolverChamado(){}
    
}
