/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa;

/**
 *
 * @author lucas
 */
public class Computador extends Chamado {
    private String empresa;
    private int quantComputador;
    private String modelo;
    private float valorTotal;

    public Computador(String empresa, int quantComputador, String modelo, float valorTotal, int id, String data) {
        super(id, data);
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

    public boolean isResolvido() {
        return resolvido;
    }

    public void setResolvido(boolean resolvido) {
        this.resolvido = resolvido;
    }
    
}