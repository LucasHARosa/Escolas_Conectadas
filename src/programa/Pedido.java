package programa;

import java.io.Serializable;


public class Pedido implements Serializable{
    private static final long serialVersionUID = 1L;
    private String tipo;
    private boolean apto;
    private String obs;
    private DiretorDaEscola diretorDaEscola;

    public Pedido(String tipo, DiretorDaEscola diretorDaEscola, String obs) {
        this.tipo = tipo;
        this.obs = obs;
        this.diretorDaEscola = diretorDaEscola;
    }
    
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isApto() {
        return apto;
    }

    public void setApto(boolean apto) {
        this.apto = apto;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public DiretorDaEscola getDiretorDaEscola() {
        return diretorDaEscola;
    }

    public void setDiretorDaEscola(DiretorDaEscola diretorDaEscola) {
        this.diretorDaEscola = diretorDaEscola;
    }

    public void atualizacao (boolean apto,String obs1){
        this.apto = apto;
        String barra = "| |";
        String obs2 = obs1.concat(barra).concat(this.obs);
        setObs(obs2);
    }
}
