package lab03;

public class CondicionalNum {
    public static void main(String[] args){
        var nota = 60;
        if (nota >= 90 && nota <= 100) {
            System.out.println("Conceito A");
        } else if (nota >= 80 && nota <= 90) {
            System.out.println("Conceito B");
        } else if (nota >= 70 && nota <= 80) {
            System.out.println("Conceito C");
        } else if (nota >= 60 && nota <= 70) {
            System.out.println("Conceito D");
        } else if (nota >= 50 && nota <= 60) {
            System.out.println("Conceito E");
       
        }
    }
}
