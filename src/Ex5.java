import java.text.NumberFormat;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getInstance();
        int valor = 0;

        System.out.println("Digite número para fatorar: ");
        valor = ler.nextInt();

        long fatorial = 1;

        for (int i = 1; i <= valor; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + valor + " é: " + nf.format(fatorial));
    }
}
