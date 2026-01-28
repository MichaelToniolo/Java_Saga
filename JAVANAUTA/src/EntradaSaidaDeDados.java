import java.util.Scanner;

public class EntradaSaidaDeDados {
    public static void main(String[] args) {
//        System.out.println("Olá, Imprime e Pula");
//        System.out.print("Faço a impressão na mesma linha");
//        System.out.printf("Faço a impressão formatada");

        Scanner scanner = new Scanner(System.in);
        System.out.println("DIGITE SEU NOME: ");
        String nome = scanner.nextLine();

        System.out.println("DIGITE SUA IDADE: ");
        int idade = scanner.nextInt();
        System.out.println("DIGITE SUA ALTURA");
        double altura = scanner.nextDouble();

        System.out.println(nome);
    }
}
