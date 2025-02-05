public class CondicionalSimples {
    public static void main(String[] args) throws Exception {
        double saldo = 25.0;
        double valorSolicitado = 18.0;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;

            System.out.println("Saque realizado com sucesso!");
            System.out.println("Saldo atual: R$ " + saldo);
        }
    }
}
