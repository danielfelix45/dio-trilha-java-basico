public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = { "João", "Maria", "José", "Pedro", "Ana" };

        // for (int i = 0; i < alunos.length; i++) {
        // System.out.println("O aluno do índice " + i + " é " + alunos[i]);
        // }

        for (String aluno : alunos) {
            System.out.println("Aluno: " + aluno);

        }
    }
}
