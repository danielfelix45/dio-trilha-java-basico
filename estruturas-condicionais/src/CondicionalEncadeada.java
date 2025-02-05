public class CondicionalEncadeada {
    public static void main(String[] args) {
        int notaAluno = 10;

        if (notaAluno >= 7)
            System.out.println("Aluno aprovado!");

        else if (notaAluno >= 4 && notaAluno < 7)
            System.out.println("Aluno em recuperação!");

        else
            System.out.println("Aluno reprovado!");

    }
}
