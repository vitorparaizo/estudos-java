// Exercicio10
package ListaC04;
import java.util.Scanner;

public class ListaExerc10 {
    public static void main (String[] args) {
    
    Scanner scannerMedia = new Scanner(System.in);

    int[] vetorMedia = new int[15];
    int[] somaMedia = new int[15] ;

    for (int i=0; i<vetorMedia.length; i++) {
        System.out.println("digite a nota final do aluno " + (i + 1) + ": ");
        vetorMedia[i] = scannerMedia.nextInt();
    }

    for (int i=0; i<vetorMedia.length; i++) {
        System.out.println(vetorMedia[i]);
    }

    for (int i=0; i<vetorMedia.length; i++) {
        somaMedia[0] += vetorMedia[i];
        
    }

    System.out.println("A média dos geral do alunos é " + somaMedia[0] / vetorMedia.length);

    scannerMedia.close();

    }
}