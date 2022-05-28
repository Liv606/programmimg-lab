package exercício;

import java.util.Scanner;

public class Exercício 
{

    
    public static void main(String[] args) 
    {
        
        double a, b, c;
        double p = 0;
        double A = 0;
        double r = 0;
        Scanner leitura = new Scanner(System.in);
        System.out.println("Lado 1: ");
        a = leitura.nextDouble();
        System.out.println("Lado 2: ");
        b = leitura.nextDouble();
        System.out.println("Lado 3: ");
        c = leitura.nextDouble();
        
        if (a != 0 && b != 0 && c != 0) {
            
            if (a < b + c && b < a + c && c < a + b) {
                
                p = (a+b+c)/2;
                A = p*(p-a)*(p-b)*(p-c);
                r = Math.sqrt(A);
                
                System.out.println("A área do trinângulo é : " + r);
                        
            }else{
                System.out.println("Um lado não pode ser maior que a soma dos outros dois!");
            }
            
        }else{
            System.out.println("O lado do triângulo não pode ser zero!");
        }
        
    }
    
}
