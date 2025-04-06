public class Repeticao {
    public static void main (String[] args) {
        int cc = 0;

        while (cc < 10) {
            cc++;
            if (cc == 2 || cc == 3 || cc == 4) {
                continue;
            }
            if (cc == 7) {
                break;
            }
            System.out.println("cambalhota " + (cc));
            
        }

        int pulos = 0;

        while (pulos < 10) {
            System.out.println("pulos " + (pulos+1));
            pulos ++;
        }

        int cambalhota = 0;
        do {
            System.out.println("mortal " + cambalhota);
            cambalhota++;
        } while (cambalhota < 4);
        
    }
}
