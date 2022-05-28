package aula2;

public class Questao3 {

    public static double somaMaiores(double[][] m, double x) {

        double soma = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {

                if (m[i][j] > x) {
                    soma = soma + m[i][j];
                }

            }
        }
        return soma;
    }

    public static double[][] criaMatriz(double min, double max, int lin, int col) {
        double m[][] = new double[lin][col];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {

                m[i][j] = (Math.random() * (max - min)) + min;

            }
        }
        return m;
    }

    public static void main(String[] args) {
        double m[][] = criaMatriz(1, 100, 3, 3);
        double soma = somaMaiores(m, 7);
        System.out.println("Os números maiores que 7 na matriz são: " + soma);
    }

}
