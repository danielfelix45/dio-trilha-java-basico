public class BreakContinue {
    public static void main(String[] args) {
        int numeros[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // for (int i = 0; i < numeros.length; i++) {

        // if (numeros[i] == 5) {
        // Ao encontrar o número 5, o loop é interrompido
        // break;
        // }
        // System.out.println(numeros[i]);
        // }

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] % 2 != 0) {
                // Se o número for ímpar, o loop é interrompido (imprime apenas os números
                // pares)
                continue;
            }
            System.out.println(numeros[i]);
        }
    }
}
