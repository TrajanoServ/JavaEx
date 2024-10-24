import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int cont = 1; cont == 1;) {

            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            if (primo(numero)) {
                System.out.println("O número " + numero + " é primo.");
            } else {
                System.out.println("O número " + numero + " não é primo.");
            }

            System.out.println("Quer testar outro número? Sim(1) ou não(0)");
            cont = scanner.nextInt();
        }

        scanner.close();
    }

    public static boolean primo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
