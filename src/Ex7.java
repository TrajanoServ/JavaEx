import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a palvra: ");
        String entrada = ler.next();
        String saida = "";

        for (int i = entrada.length() - 1; i >= 0; i--){
            saida = saida + entrada.charAt(i);
        }

        System.out.println(saida);
    }
}
