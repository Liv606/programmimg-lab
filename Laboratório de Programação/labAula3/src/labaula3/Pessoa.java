package labaula3;

import java.util.Date;

public class Pessoa {

    private String nome;
    private Date dataNascimento;
    private double altura;

//    public Pessoa() {
//
//    }
    public Pessoa(String nome) {
        this.nome = nome;
    }

    public double getAltura() { // get acessador
        return altura;
    }

    public void setAltura(double altura) { // set modificador
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("Altura deve ser maior que 0!");

        }

    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double obterAlturaEmPolegadas() {
        return altura / 0.0254;
    }

}
