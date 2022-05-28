package aula2;

public class Questao4 {

    public static boolean comparaMatrizes(int[][] m1, int[][] m2) {

        boolean x = true;
        if (m1.length != m2.length || m1[0].length != m2[0].length) {
            x = false;
        }

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {

                if (m1[i][j] != m2[i][j]) {
                    x = false;
                }

            }

        }
        return x;
    }

    public static void main(String[] args) {
        int m1[][] = Questao1.criaMatriz(1, 100, 4, 4);
        int m2[][] = Questao1.criaMatriz(1, 100, 4, 4);
        boolean x = comparaMatrizes(m1, m2);
        if (x) {
            System.out.println("São iguais!");
        } else {
            System.out.println("São diferentes!");
        }
    }

}
