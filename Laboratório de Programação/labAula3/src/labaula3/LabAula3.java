package labaula3;

import labaula3.parte2.Carro;

public class LabAula3 {

    public static void main(String[] args) {

//        Pessoa p = new Pessoa("José");
//        System.out.println(p.getAltura());
//        p.setAltura(1.7);
//        System.out.println(p.obterAlturaEmPolegadas());
        Carro carro = Carro.getInstance("vermelho", "Renegade", "grande", 0);
        //Carro carro = new Carro();

        if (carro == null) {
            System.out.println("Deu ruim >:(");
        } else {
            System.out.println(carro.getModelo());
            System.out.println(carro.getCor());
            System.out.println(carro.getTamanho());
            System.out.println(carro.getPreco());
        }

    }

}
