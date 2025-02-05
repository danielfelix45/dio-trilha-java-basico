import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        // String name = args[0];
        // String lastName = args[1];
        // int age = Integer.valueOf(args[2]);
        // double height = Double.valueOf(args[3]);

        // Criando Objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale(java.util.Locale.US);

        System.out.println("Enter your name: ");
        String name = scanner.next();

        System.out.println("Enter your last name: ");
        String lastName = scanner.next();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Enter your height: ");
        double height = scanner.nextDouble();

        System.out.println("Hello, my name is " + name + " " + lastName);
        System.out.println("and I'm " + age + " years old");
        System.out.println("I'm " + height + "m tall.");
    }
}