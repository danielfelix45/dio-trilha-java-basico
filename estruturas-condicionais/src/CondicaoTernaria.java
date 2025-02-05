public class CondicaoTernaria {
    public static void main(String[] args) {
        double notaAluno = 4.5;

        // String resultado = notaAluno >= 7.0 ? "Aprovado" : "Reprovado";
        String resultado = notaAluno >= 7.0 ? "Aprovado"
                : notaAluno >= 4 && notaAluno < 7.0 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);
    }
}