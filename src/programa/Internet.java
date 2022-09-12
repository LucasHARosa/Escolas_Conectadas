package programa;

import javax.swing.JOptionPane;


public class Internet extends Chamado{
    private String operadora;
    private int quantidadePontos;
    private float velocidade;
    private float valoMensal;

    public Internet(String operadora, int quantidadePontos, float velocidade, float valoMensal, int id, String data, Escola escola) {
        super(id, data, escola);
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

    
    
   
    @Override
    public int resolverChamado(){
        int opcao=0;
        if(this.getEscola().isInternet()==false){
            setResolvido(true);
            if(this.getEscola().isEnergia()==false){
                opcao=10;    
            }
            JOptionPane.showMessageDialog(null,"O chamado foi resolvido e está em ordem","Mensagem",JOptionPane.PLAIN_MESSAGE);
            this.getEscola().setInternet(true);
        }   
        else{
            JOptionPane.showMessageDialog(null,"O chamado não poderá ser concluído a escola já tem Internet","Mensagem",JOptionPane.PLAIN_MESSAGE);
        }
        return opcao;
    }
    
}
