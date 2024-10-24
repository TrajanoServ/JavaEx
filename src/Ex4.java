import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int fat = 0;
        int limit = 0;

        System.out.println("Digite qual número você quer da tábuada: ");
        fat = ler.nextInt();
        System.out.println("Digite até quer a tábuada: ");
        limit = ler.nextInt();

        for(int i = 0; i <= limit; i++){
            int result;
            int j = i;

            result = fat * j;
            System.out.println(j + " * " + fat + "= " + result);
        }
    }
}
