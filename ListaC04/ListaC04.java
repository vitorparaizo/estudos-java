package ListaC04;
import java.util.Scanner;

public class ListaC04 {
    public static void main (String[] args) {

    // Scanner scanner = new Scanner(System.in);

    // int[] vetor = new int[6];

    // for (int i=0; i<vetor.length; i++) {
    //     System.out.println("digite o numero");
    //     vetor[i] = scanner.nextInt();
    // } 

    // for (int i=0; i<vetor.length; i++) {
    //     System.out.print("[ " + vetor[i]  + " ]");
    // }
    
// Exercicio10

    Scanner scannerMedia = new Scanner(System.in);

    int[] vetorMedia = new int[15];
    int soma = 0;

    for (int i=0; i<vetorMedia.length; i++) {
        System.out.println("digite a nota final do aluno: ");
        vetorMedia[i] = scannerMedia.nextInt();
    }

    for (int i=0; i<vetorMedia.length; i++) {
        System.out.println(vetorMedia[i]);
    }

    for (int i=0; i<vetorMedia.length; i++) {
        soma += vetorMedia[i];
    }

    for (int i=0; i<vetorMedia.length; i++) {
        int[] somaMedia = new int[soma];
    }
    }
}