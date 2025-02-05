package edu.felix.aluno;

public class Aluno {

    public static void main(String[] args) {
        String nome = "João";
        String sobrenome = "Silva";
        int idade = 30;

        String nomeCompleto = nomeCompleto(nome, sobrenome, idade);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String nome, String sobrenome, int idade) {
        return " Meu nome é: " + nome + " " + sobrenome + " e tenho " + idade + " anos";
    }
}