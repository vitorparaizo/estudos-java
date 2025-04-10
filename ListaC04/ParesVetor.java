// Exercicio07
import java.util.Scanner;

public class ParesVetor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];
        int Pares =0;

        for(int i=0; i<vetor.length; i++) {     
            System.out.println("digite o " + (i+1) +  " numero");
            vetor[i] = scanner.nextInt();
        }

        for (int i=0; i<vetor.length; i++) {
            System.out.print("[ " + vetor[i] + " ]");;

        }

        for (int i=0; i<vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                Pares++;

            }
        }

        System.out.print("há " + Pares + " pares no vetor");
            
        
    }
}

