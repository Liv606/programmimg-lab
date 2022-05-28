package labaula4;

public class Veiculo {

    private String modelo;
    private String placa;
    private int ano;

    public Veiculo() {
        modelo = "Genérico";
        placa = "LIV-2306";
        ano = 2070;
    }

    public void andar() {
        System.out.println("Vrum");
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

}
