
import java.util.Scanner;

public class PPAP2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int pIndex = -1;
        while (true) {
            pIndex = str.indexOf("PPAP", pIndex + 1);
            int gIndex = str.indexOf("GOD", pIndex + 4);
            int nextP = str.indexOf("PPAP", gIndex + 4);
            if (gIndex == -1 && nextP != 1) {
                System.out.println("Double PPAP = " + (nextP + 4));
                break;
            } else if (gIndex > nextP) {
                System.out.println("Double PPAP = " + (nextP + 4));
                break;
            } else if (gIndex != -1 && gIndex < nextP) {
                pIndex = nextP - 1;
            }
        }
    }
}
