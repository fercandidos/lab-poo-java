package lab03;

import java.util.Scanner;

public class ConceitoNota {
    
    public static void main(String[] args) {var sc = new Scanner(System.in);

       
        System.out.println("Informe o seu conceito:");
        var conceito = sc.next();
        switch (conceito) {
            case "A" -> System.out.println("Nota 100");
            case "B" -> System.out.println("Nota 90");
            case "C" -> System.out.println("Nota 80");
            case "D" -> System.out.println("Nota 70");
            case "E" -> System.out.println("Nota 60");
           
        }
        sc.close();
        




   
    }


}