import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[5];

        for (int i=0; i < nums.length; i++){
            int n = i+1;
            System.out.println("Coloque o número " + n + ":");
            nums[i] = scanner.nextInt();
        }

        int maior = nums[0];

        for (int i = 1; i < nums.length; i++){
            if (nums[i] > maior){
                maior = nums[i];
            }
        }

        System.out.println("O maior valor é: " + maior);
        scanner.close();
    }
}
