import java.util.Scanner;

public class ArrayNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("how many numbers will you enter? ");
        int n = scan.nextInt();

        System.out.println("great! enter " + n + "interagers: ");

        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        for (int i = 0; i < n; i++ ) {
            System.out.println(a[i]);
        }
        
    }
    
}
