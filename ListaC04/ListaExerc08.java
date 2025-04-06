package ListaC04;

import java.util.Scanner;

public class ListaExerc08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[6];

        for (int i=0; i<vetor.length; i++) {
            System.out.println("digite um número: ");
            vetor[i] = scanner.nextInt();

        }

        // for(int i=0; i<vetor.length; i++) {
        //     System.out.println(vetor[i]);
        // }

        for (int i = vetor.length - 1; i>-1; i--) {
            System.out.print("[ " + vetor[i] + " ]");

        }

    }
}
