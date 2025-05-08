

import java.util.Random;

public class Frequencia {
    public static void main(String[] args) {

        int v = 200;
        int[] vetor = new int[v];
        Random random = new Random();
        int[] frequencia = new int[100];

        for (int i=0; i<vetor.length; i++) {
            vetor[i] = random.nextInt(100);

        }

        for(int i=0; i<vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        System.out.println();

        for (int i=0; i<vetor.length; i++) {
            frequencia[vetor[i]]++;

        }

        System.out.println("\nTabela de frequencia");
        for (int i=0; i<frequencia.length; i++) {
            if (frequencia[i] > 0) {
                System.out.println("num " + i +"  aparece " + frequencia[i] + " vezes ");

            }
        }
    }
    
}
