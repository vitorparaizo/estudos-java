import java.util.Arrays;
import java.util.Scanner;


public class VetorException {
    public static void main(String[] args) throws Exception {

    //     String nome1 = "João";

    //     String[] nomes = new String[3];

    //     nomes[0] = "Carlos";
    //     nomes[1] = "andre";
    //     nomes[2] = "felipe";  

    //     for (int i=0; i<nomes.length; i++ ) {
    //         System.out.println(nomes[i]);

    //     }
    // 


    // int[] numeros = new int[100];

    // for (int posicao=0; posicao<100; posicao++) {
    //     numeros[posicao] =0;
    //     System.out.println(numeros[posicao]);
    // }

    // System.out.println("o numero é: " +  numeros[50]);

    // int num[] = {8, 364, 1, 5, 1, 20, 55};
    // Arrays.sort(num);

    // for(int i=0; i<num.length; i++) {
    //     System.out.println(num[i]);

    // }

        // Scanner scanner = new Scanner(System.in); 

        // System.out.print("Quantos números você quer digitar? ");
        // int quantidade = scanner.nextInt(); 

        // int[] numeros = new int[quantidade];

        
        // for (int i = 0; i < quantidade; i++) {
        //     System.out.print("Digite o número " + (i + 1) + ": ");
        //     numeros[i] = scanner.nextInt(); 
        // }

        // System.out.println("\nVocê digitou:");
        // for (int i = 0; i < quantidade; i++) {
        //     System.out.println("Número " + (i + 1) + ": " + numeros[i]);
        // }

        // scanner.close(); 


        Scanner scanner = new Scanner(System.in);

        System.out.print("numero do vetor: ");
        int vetorTamanho = scanner.nextInt();

        int[] numVetor = new int[vetorTamanho];

        for (int i=0; i<vetorTamanho; i++) {
            System.out.println("digite o numero");
            numVetor[i] = scanner.nextInt();
        }

        for (int i=0; i<vetorTamanho; i++) {

            System.out.println(numVetor[i]);
        }

    }
}

    
    
