
import java.util.Scanner;

public class PPAP {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int gIndex = str.indexOf("GOD");
        int pIndex = str.indexOf("PPAP");
        int gLastIndex = str.lastIndexOf("GOD");
        int pLastIndex = str.lastIndexOf("PPAP");

        if (pIndex == -1) {
            System.out.println("clean");
        } else if (gIndex == -1) {
            System.out.println("danger");
        } else {
            if (gIndex < pIndex && gLastIndex > pLastIndex) {
                System.out.println("safe");
            } else {
                System.out.println("danger");
            }
        }
    }
}
