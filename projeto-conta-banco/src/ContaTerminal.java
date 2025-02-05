import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da sua conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência:");
        String numeroAgencia = scanner.next();

        System.out.println("Por favor, digite o saldo da sua conta:");
        double saldo = scanner.nextDouble();

        System.out.println("Por favor, digite o nome do titular da conta:");
        String nomeCliente = scanner.next();

        System.out.println(
                "Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia
                        + ", conta " + numeroConta + " e seu saldo R$" + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
