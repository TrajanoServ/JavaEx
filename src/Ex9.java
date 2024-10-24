import java.util.Scanner;

public class Ex9 {
    public static int contConsoante (String txt) {
        int contador = txt.length();

        txt = txt.toLowerCase();
        for (int i = 0; i < txt.length(); i++){
            char letra = txt.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == ' '){
                contador --;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a palavra ou frase: ");
        String txt = ler.nextLine();

        int nconsoante = contConsoante(txt);
        System.out.println("O número de vogais é: " + nconsoante); 
    }
}
