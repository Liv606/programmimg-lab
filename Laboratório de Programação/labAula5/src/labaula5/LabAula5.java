package labaula5;

import java.io.FileReader;

public class LabAula5 {

    public static void main(String[] args) {

        try {
            System.out.println("Teste 1");
            if (false) {
                throw new Exception();
            }
            System.out.println("Teste 1,5");
            FileReader fw = new FileReader("teste2.txt");
            System.out.println("Teste 2");
        } catch (Exception e) {
            System.out.println("Teste 3");
        } finally {
            System.out.println("Teste 4");
        }

    }

}
