package programa;


public class Internet extends Chamado{
    private String operadora;
    private int quantidadePontos;
    private float velocidade;
    private float valoMensal;

    public Internet(String operadora, int quantidadePontos, float velocidade, float valoMensal, int id, String data) {
        super(id, data);
        this.operadora = operadora;
        this.quantidadePontos = quantidadePontos;
        this.velocidade = velocidade;
        this.valoMensal = valoMensal;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public int getQuantidadePontos() {
        return quantidadePontos;
    }

    public void setQuantidadePontos(int quantidadePontos) {
        this.quantidadePontos = quantidadePontos;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public float getValoMensal() {
        return valoMensal;
    }

    public void setValoMensal(float valoMensal) {
        this.valoMensal = valoMensal;
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
