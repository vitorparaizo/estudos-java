import java.util.Scanner;

public class PreencherVetorExemplo {


    public static void preencherVetor(int[] v, int n) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < n && i < v.length; i++) {
            System.out.print("Digite o valor para a posição " + i + ": ");
            v[i] = scanner.nextInt();
        }

        // scanner.close();
    }

    public static void imprimirVetor(int[] v, int n) {

        for (int i=0; i<v.length; i++) {
            System.out.println("o vetor é" + v[i]);
        }
    }

    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);

    //     System.out.print("Digite o tamanho do vetor: ");
    //     int tamanho = scanner.nextInt();

    //     int[] vetor = new int[tamanho];

    //     preencherVetor(vetor, tamanho);

    //     System.out.println("Vetor preenchido:");
    //     for (int valor : vetor) {
    //         System.out.print(valor + " ");
    //     }

    //     scanner.close();
    // }
}
