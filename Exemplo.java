import java.util.Scanner;

public class Exemplo {
     
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o tamanho do vetor");
        int vetor = scanner.nextInt();
    }

    public static void preencherVetor(int[] vetor, int n) {

        for (int i=0; i<vetor.length; i++) {
            System.out.println("digite o " + (i+1) + " numero");
            
        }
    }
}

