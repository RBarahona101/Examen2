package examenp2_rigobertobarahona;


public class Carros {
    String marca;
    String modelo;
    int ano;
    int estado;
    double costo;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Carros(String marca, String modelo, int ano, int estado, double costo) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.estado = estado;
        this.costo = costo;
    }

    @Override
    public String toString() {
        return modelo + ": " + marca;
    }
    
}
