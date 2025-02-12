package atendimento.cozinha;

public class Almoxarife {
    private void controlarEntrada() {
        System.out.println("CONTROLANDO A ENTRADA DOS INTENS");
    }

    private void controlarSaida() {
        System.out.println("CONTROLANDO A SAIDA DOS INTENS");
    }

    void entregarIngredientes() {
        System.out.println("ENTREGANDO INGREDIENTES");
        controlarSaida();
    }

    void trocarGas() {
        System.out.println("ALMOXARIFE TROCANDO O GAS");
    }
}
