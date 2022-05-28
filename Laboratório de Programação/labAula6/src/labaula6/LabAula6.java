package labaula6;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LabAula6 {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter("E:\\Facamp\\Segundo Semestre\\Laboratório de Programação\\aula6.txt", true);
            for (int i = 0; i < 10; i++) {
                System.out.print("Linha " + (i + 1) + ":");
                String linha = leitura.nextLine();
                fileWriter.write(linha + "\n");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            try {
                fileWriter.close();
            } catch (IOException ex) {
            }
        }

    }

}
