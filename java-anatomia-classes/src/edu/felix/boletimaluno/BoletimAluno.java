package edu.felix.boletimaluno;

public class BoletimAluno {

    public static void main(String[] args) {
        int notaAluno = 7;
        if (notaAluno < 7) {
            System.out.println("Reprovado");
        } else if (notaAluno == 7) {
            System.out.println("Prova Minerva");
        } else {
            System.out.println("Aprovado");
        }
    }
}
