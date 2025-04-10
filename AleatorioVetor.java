import java.util.Scanner;
public class AleatorioVetor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[5];

        for (int i=0; i<vetor.length; i++) {
            System.out.println("digite o " + (i+1) + " numero");
            vetor[i] = scanner.nextInt();
        }

        for (int i=0; i<vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
