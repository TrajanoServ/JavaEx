import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o limite inicial: ");
        int limiteInicial = scanner.nextInt();

        System.out.print("Informe o limite final: ");
        int limiteFinal = scanner.nextInt();

        System.out.println("Números pares entre " + limiteInicial + " e " + limiteFinal + ":");
        for (int i = limiteInicial; i <= limiteFinal; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
