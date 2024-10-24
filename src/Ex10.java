import java.util.Scanner;
import java.util.Arrays;

public class Ex10 {

    public static void main(String[] args) {
        int[] numeros = {34, 12, 5, 67, 1, 99, 23, 45, 8};

        System.out.println("Array original: " + Arrays.toString(numeros));

        Arrays.sort(numeros);

        System.out.println("Array ordenado: " + Arrays.toString(numeros));
    }
}
