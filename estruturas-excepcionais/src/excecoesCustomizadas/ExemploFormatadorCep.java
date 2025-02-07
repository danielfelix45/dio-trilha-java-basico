package excecoesCustomizadas;

public class ExemploFormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2376506");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("Erro: O CEP informado é inválido.");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8) {
            throw new CepInvalidoException();

        }
        // Simulando um cep formatado.
        return "23.765-064";
    }
}
