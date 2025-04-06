// Exercicio02
package ListaC04;
import java.util.Scanner;

public class ListaExerc02 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[6];

        for (int i=0; i<vetor.length; i++) {
        System.out.println("digite o numero");
        vetor[i] = scanner.nextInt();
        } 

        for (int i=0; i<vetor.length; i++) {
        System.out.print("[ " + vetor[i]  + " ]");
        }

        scanner.close();
    }
}
