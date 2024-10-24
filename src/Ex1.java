import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);
        int num;
        int parImpar;


        System.out.println("Digite o valor");
        num = ler.nextInt();

        parImpar = num % 2;

        if (parImpar == 1){
            System.out.println("O número é impar");
        } else {System.out.println("O número é par");}
    }

}