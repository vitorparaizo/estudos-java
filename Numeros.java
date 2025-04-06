import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {

        int n, s=0;
        String resp;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("numero");
            n = teclado.nextInt();
            s += n;
            System.out.println("quer continuar? s/n");
            resp = teclado.next();
        } while (resp.equals("S"));
        System.out.println("a soma é " + s);

        
    }
}
