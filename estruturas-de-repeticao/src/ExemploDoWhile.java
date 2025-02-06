import java.util.Scanner;

public class ExemploDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        do {
            System.out.println("Digite um número positivo (ou um número negativo para sair). ");
            numero = scanner.nextInt();

            if (numero >= 0) {
                System.out.println("Você digitou o número " + numero);
            }
        } while (numero >= 0);
        System.out.println("Número negativo digitado. Programa encerrado!.");

        scanner.close();
    }
}
