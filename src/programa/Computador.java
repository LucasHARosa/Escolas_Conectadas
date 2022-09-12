package programa;

import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class Computador extends Chamado {
    private String empresa;
    private int quantComputador;
    private String modelo;
    private float valorTotal;

    public Computador(String empresa, int quantComputador, String modelo, float valorTotal, int id, String data, Escola escola) {
        super(id, data, escola);
        this.empresa = empresa;
        this.quantComputador = quantComputador;
        this.modelo = modelo;
        this.valorTotal = valorTotal;
    }

    

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getQuantComputador() {
        return quantComputador;
    }

    public void setQuantComputador(int quantComputador) {
        this.quantComputador = quantComputador;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    
    @Override
    public int resolverChamado(){
        int opcao=0;
        System.out.println(this.quantComputador);
        System.out.println(this.getEscola().getNumMatriculas());
        System.out.println(this.getEscola().getNumComputador());
        if(this.quantComputador > 0){
            setResolvido(true);
            if(this.getEscola().isEnergia()==false){
                opcao=10;    
            }
            if(this.getEscola().isInternet()==false){
                opcao++;
            }
            JOptionPane.showMessageDialog(null,"O chamado foi resolvido e está em ordem","Mensagem",JOptionPane.PLAIN_MESSAGE);
            this.getEscola().setNumComputador(this.getEscola().getNumMatriculas());
        }   
        else{
            JOptionPane.showMessageDialog(null,"O chamado não poderá ser concluído a escola já tem Computadores","Mensagem",JOptionPane.PLAIN_MESSAGE);
        }
        return opcao;
    }
}
