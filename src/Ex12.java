import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de termos da sequência de Fibonacci: ");
        int n = scanner.nextInt();

        System.out.println("Os primeiros " + n + " termos da sequência de Fibonacci são:");

        int termo1 = 0, termo2 = 1;


        if (n >= 1) {
            System.out.print(termo1);
        }

        if (n >= 2) {
            System.out.print(" " + termo2);
        }

        for (int i = 3; i <= n; i++) {
            int proximoTermo = termo1 + termo2;
            System.out.print(" " + proximoTermo);

            termo1 = termo2;
            termo2 = proximoTermo;
        }

        scanner.close();
    }
}
