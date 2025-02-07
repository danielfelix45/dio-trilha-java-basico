import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] alunos = { "Camila", "João", "Maria", "Pedro" };

        double media = calculaMediaDaTurma(alunos, scanner);

        System.out.printf("Média da turma é: %.1f\n", media);
    }

    public static double calculaMediaDaTurma(String[] alunos, Scanner scanner) {
        double soma = 0;

        for (String aluno : alunos) {
            System.out.printf("Nota do aluno %s:  ", aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }
        return soma / alunos.length;
    }
}
