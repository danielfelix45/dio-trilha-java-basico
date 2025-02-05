public class SwitchCase {
    public static void main(String[] args) {
        String sigla = "M";

        // if (sigla == "M") {
        // System.out.println("Masculino");
        // } else if (sigla == "F") {
        // System.out.println("Feminino");
        // } else {
        // System.out.println("Outro");
        // }

        switch (sigla) {
            case "M":
                System.out.println("Masculino");
                break;
            case "F":
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Outro");
        }
    }
}
