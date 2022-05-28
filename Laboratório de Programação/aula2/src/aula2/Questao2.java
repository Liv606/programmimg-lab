package aula2;

public class Questao2 {

    public static int contaPares(int[][] m) {
        int cont = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {

                m[i][j] = (int) (Math.random() * (100 - 1 + 1)) + 1;

                if (m[i][j] % 2 == 0) {
                    cont++;
                }

            }

        }
        return cont;
    }

    public static void main(String[] args) {
        int m[][] = Questao1.criaMatriz(1, 100, 8, 8);
        int cont = contaPares(m);
        System.out.println("O número de pares é: " + cont);
    }

}
