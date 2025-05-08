import java.util.Scanner;
public class Prova {

    public static int[] tamanhoVetor() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite o tamanho do seu vetor");
        int tamanho = scanner.nextInt();
        return new int[tamanho];
    }

    public static void preencherVetor(int[] V) {
        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<V.length; i++) {
            System.out.print("digite a posição " + (i+1) + " do vetor");
            V[i]= scanner.nextInt();
        }
        
        scanner.close();
        
    }

    public static void mostrarVetor(int[] V) {
        for (int i=0; i<V.length; i++) {
            System.out.print(V[i]);
            if (i < V.length - 1) {
                System.out.print(", ");
        }
    }

    }

    public static void ordenarVetorSelection(int[] V) {

        int n = V.length;
        for (int i=0; i<V.length; i++) {
            int index = i;
            for (int j=i+1; j<n; j++) {
                if (V[j]<V[index]) {
                    index =j;
                }
            }

            int temp = V[index];
            V[index] = V[i];
            V[i] = temp;
        }
    }

    public static void main(String[] args) {

       int[] vetor = tamanhoVetor();

        System.out.println("VETOR");

        preencherVetor(vetor);
        mostrarVetor(vetor);
        ordenarVetorSelection(vetor);

        System.out.println("vetor ordenado por select");
        mostrarVetor(vetor);


        
    }
    
}
