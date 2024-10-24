import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 10;
        double[] numeros = new double[tamanho];
        double soma = 0;

        System.out.println("Digite 10 números:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
            soma += numeros[i];
        }

        double media = soma / tamanho;

        System.out.println("A média dos números é: " + media);

        scanner.close();
    }
}
