import java.util.Scanner;

public class ArrayScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("favorite color ");

        String s = scan.next();

        System.out.println(s); 


        Scanner scan2 = new Scanner(System.in);

        System.out.println("what are ur 3 fav colors:? ");

        String colors[]  = new String[3];

        colors[0] = scan2.next();
        colors[1] = scan2.next();
        colors[2] = scan2.next();
        

        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        

    }
}
