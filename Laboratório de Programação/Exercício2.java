package exercício2;

import java.util.Scanner;

public class Exercício2 
{

    
    public static void main(String[] args) 
    {
        
        double a, b, c;
        double x = 0;
        double y = 0;
        double d = 0;
        Scanner leitura = new Scanner(System.in);
        System.out.println("Primeiro número: ");
        a = leitura.nextDouble();
        System.out.println("Segundo número: ");
        b = leitura.nextDouble();
        System.out.println("Terceiro número: ");
        c = leitura.nextDouble();
        
        d = Math.pow(b,2) - 4*a*c;
        
        if (d > 0) {
            x = (-b + Math.sqrt(d))/(2*a);
            y = (-b - Math.sqrt(d))/(2*a);
            
            System.out.println("x1 = " + x + " e x2 = " + y);
            
        }else if (d == 0) {
            x = -b/(2*a);
            
            System.out.println("x = " + x);
            
        }else{
            System.out.println("Equação não possui raízes reais!");
        }
        
    }
    
}
