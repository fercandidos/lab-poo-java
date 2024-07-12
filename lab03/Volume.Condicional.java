package lab03;

public class VolumeCondicional {
    public static void main(String[] args) {
        // Crie um programa para calcular o volume de um 
        // solido.Seu programa não deve calcular o volume
        // caso algumvalor de aresta seja menor ou igual a 
        // zero, avisando ao usuário.

      System.out.println("-----------------------------");
      System.out.println("Cálculo de Volume da Pirâmide");
      System.out.println("-----------------------------");
        
      var sc = new Scanner(System.in);
      System.out.println("Digite o valor da base:");
      var base = sc.nextInt();
      
      
      var sc = new Scanner(System.in);
      System.out.println("Digite o valor da altura:");
      var altura = sc.nextInt();

      if (altura <= 0 && base <=0) {
        var volume = base * base * altura;
        System.out.println("Não é possível calcular");
      } else {
        System.out.println("O volume é: " + volume);

      }

    }
}