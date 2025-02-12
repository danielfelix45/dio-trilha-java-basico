public class Escola {
    public static void main(String[] args) throws Exception {
        Aluno aluno = new Aluno();
        aluno.setNome("Felipe");
        aluno.setIdade(12);

        System.out.println("O aluno " + aluno.getNome() + " tem " + aluno.getIdade() + " anos.");
    }
}
