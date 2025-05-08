import java.util.Scanner;
public class VetorAP {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[3];

        for(int i=0; i<vetor.length; i++) {
            System.out.println("digite seu numero aqui" + "[" + (i+1) + "]");
            vetor[i] = scanner.nextInt();

        }

        for(int i=0; i<vetor.length; i++) {
            System.out.print(vetor[i]);
        }

    }
}