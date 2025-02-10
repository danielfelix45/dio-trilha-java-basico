import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        String[] candidatos = { "Felipe", "João", "Maria", "José", "Ana" };

        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    public static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atenderCandidato();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO!");
            }

        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println(
                    "CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA REALIZADA.");
        } else {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MÁXIMO DE TENTATIVAS: "
                    + tentativasRealizadas + " REALIZADAS");
        }
    }

    // Método auxiliar
    public static boolean atenderCandidato() {
        return new Random().nextInt(3) == 1;
    }

    public static void imprimirSelecionados() {
        String[] candidatos = { "Felipe", "João", "Maria", "José", "Ana" };

        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento.");
        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de número: " + (indice + 1) + " é o " + candidatos[indice]);
        }

        System.out.println("Forma abreviada de interação Foreach");
        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    public static void selecaoCandidatos() {
        String[] candidatos = { "Felipe", "João", "Maria", "José", "Ana", "Carlos", "Pedro", "Paula", "Lucas",
                "Mariana" };

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato: " + candidato + " solicitou este valor de salário." + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    public static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }

    public static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
