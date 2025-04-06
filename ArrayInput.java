import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        

        int n;
        System.out.println("enter array size: ");

        Scanner input = new Scanner(System.in);

        n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("enter array elements ");

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("array elements");

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}