import java.util.Scanner;

public class Prova {
    public static void main(String[] args) {
        double perda = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nome da commodity :");
        String nome1 = scanner.next();
        System.out.println("cotacao atual do " + nome1 + " :");
        double cota1 = scanner.nextDouble();
        System.out.println("perda estimada da safra: ");
        perda = scanner.nextInt();
        if (perda < 0 || perda > 100) {
            System.out.println("percentual de perda invalido!! ");
            System.out.println("insira percental valido: ");

        } else {
            perda = cota1 + (perda * 0.10);
            System.out.println("nome da commmodity: "+ nome1 + "\n"+"atual valora da safra: " + cota1 + "\n"+"valor estimado da perda: " + perda);
            }
            
            


        }
}
