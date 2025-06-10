import java.util.Arrays;
import java.util.Scanner;

public class AulaArray {
    public static void main(String[] args) {

        int n1[] = {3, 8, 7, 5, 4, 6};
        System.out.println("total de casas de n " + n1.length);

        for (int c=0; c<=n1.length-1; c++) {
            System.out.println(" na posição" + c + " temos o valor " + n1[c]);

        }



    String month[] = {"Jan", "Fev", "Mar", "Abr", 
    "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
    int tot[] = {31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30};

    for (int contador=0; contador<month.length; contador++) {
        System.out.println("o mês de " + month[contador] + " tem " + 
                tot[contador] + " dias ao ano");

    }

    double num [] = {3, 5, 1, 8, 4, 5.6};
    Arrays.sort(num);
    for (double valor: num) {
        System.out.println(valor);
    }

    int y[] = {1, 4, 6, 7, 6};
    for (int v:y) {
        System.out.println(v);
    }

    int position = Arrays.binarySearch(y, 6);
    System.out.println("encontrei o valor na posição " + position);

    int x[] = new int [20];

    Arrays.fill(x, 0);

    for (int show:x) {
        System.out.println(show);

    }

    public static void preencherVetor(int[] v) {
        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<V.length; i++) {
            System.out.println("digite o valor do vetor");

        }

    }

    }
}
  