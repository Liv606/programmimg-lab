package labaula3.parte2;

public class Carro {

    private String cor;
    private String modelo;
    private String tamanho;
    private double preco;

    private Carro() {
    }

    public static Carro getInstance(String cor, String modelo, String tamanho, double preco) {
        Carro carro = null;
        if (cor != null && !cor.equals("") && modelo != null && !modelo.equals("")) {

            carro = new Carro();
            carro.setCor(cor);
            carro.setModelo(modelo);
            carro.setPreco(preco);
            carro.setTamanho(tamanho);

        }
        return carro;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
