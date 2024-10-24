import java.util.Scanner;

public class Ex8 {
    public static int achaVogal (String txt) {
        int contador = 0;

        txt = txt.toLowerCase();
        for (int i = 0; i < txt.length(); i++){
            char letra = txt.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                contador ++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a palavra ou frase: ");
        String txt = ler.nextLine();

        int nVogais = achaVogal(txt);
        System.out.println("O número de vogais é: " + nVogais);
    }
}
