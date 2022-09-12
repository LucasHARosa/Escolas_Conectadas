package programa;

import java.io.Serializable;
import javax.swing.JOptionPane;

public class Energia extends Chamado implements Serializable {
    private static final long serialVersionUID = 1L;
    private String prestadora;
    private String tipo;
    private float valorMensal;

    public Energia(String prestadora, String tipo, float valorMensal, int id, String data, Escola escola) {
        super(id, data, escola);
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

    
   
    @Override
    public int resolverChamado(){
        if(this.getEscola().isEnergia()==false){
            setResolvido(true);
            JOptionPane.showMessageDialog(null,"O chamado foi resolvido e está em ordem","Mensagem",JOptionPane.PLAIN_MESSAGE);
            this.getEscola().setEnergia(true);
        }   
        else{
            JOptionPane.showMessageDialog(null,"O chamado não poderá ser concluído a escola já tem energia","Mensagem",JOptionPane.PLAIN_MESSAGE);
        }
       
        return 0;
    }
    
}
