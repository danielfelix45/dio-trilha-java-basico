public class SistemaCadastro {
    public static void main(String[] args) throws Exception {
        // Criamos uma pessoa no cadastro
        Pessoa pessoa = new Pessoa("João da Silva", "031.589.456-89");

        // Definimos o endereço da pessoa
        pessoa.setEndereco("Rua dos Bobos");

        System.out.println("Nome da pessoa: " + pessoa.getNome() + " " + " CPF da pessoa " + pessoa.getCpf());

    }
}
