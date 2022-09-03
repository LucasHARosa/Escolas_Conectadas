
package programa;

import java.io.Serializable;


public class Escola implements Serializable{
    private static final long serialVersionUID = 1L;
    private long codInep;
    private int numMatriculas;
    private int numComputador;
    private String endereco;
    private String uf;
    private String municipio;
    private long cep;
    private float latitude;
    private float longitude;
    private boolean internet;
    private boolean energia;
    private DiretorDaEscola diretor = null;
    private String nome;

    public Escola(long codInep, int numMatriculas, int numComputador, String endereco, String uf, String municipio, long cep, float latitude, float longitude, boolean internet, boolean energia, String nome) {
        this.codInep = codInep;
        this.numMatriculas = numMatriculas;
        this.numComputador = numComputador;
        this.endereco = endereco;
        this.uf = uf;
        this.municipio = municipio;
        this.cep = cep;
        this.latitude = latitude;
        this.longitude = longitude;
        this.internet = internet;
        this.energia = energia;
        this.nome = nome;
    }
   
    public long getCodInep() {
        return codInep;
    }

    public void setCodInep(long codInep) {
        this.codInep = codInep;
    }

    public int getNumMatriculas() {
        return numMatriculas;
    }

    public void setNumMatriculas(int numMatriculas) {
        this.numMatriculas = numMatriculas;
    }

    public int getNumComputador() {
        return numComputador;
    }

    public void setNumComputador(int numComputador) {
        this.numComputador = numComputador;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public long getCep() {
        return cep;
    }

    public void setCep(long cep) {
        this.cep = cep;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public boolean isInternet() {
        return internet;
    }

    public void setInternet(boolean internet) {
        this.internet = internet;
    }

    public boolean isEnergia() {
        return energia;
    }

    public void setEnergia(boolean energia) {
        this.energia = energia;
    }

    public DiretorDaEscola getDiretor() {
        return diretor;
    }

    public void setDiretor(DiretorDaEscola diretor) {
        this.diretor = diretor;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
