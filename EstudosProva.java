import java.util.Scanner;
public class EstudosProva {

    public static void preencherVetor (int[] v) {

        Scanner scanner  = new Scanner (System.in);

        for (int i=0; i<v.length; i++) {
            System.out.println("digite o numero");
            v[i] = scanner.nextInt();
        }

        scanner.close();
    }

    public static void mostrarVetor (int[] v) {

        for (int i=0; i<v.length; i++) {
            System.out.println(v[i]);

        }
    }

    public static void main (String[] args) {

        int[] vetor = new int[5];

        preencherVetor(vetor);

        mostrarVetor(vetor);

    }
}
