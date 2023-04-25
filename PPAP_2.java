
import java.util.Scanner;

public class PPAP_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String msg = scan.next();
        int firstGod = msg.indexOf("GOD");
        int lastGod = msg.lastIndexOf("GOD");

        int firstPPAP = msg.indexOf("PPAP");
        int lastPPAP = msg.lastIndexOf("PPAP");
        if (msg.indexOf("PPAP") == -1) {
            System.out.println("clean");
        } else {
            if (firstGod < firstPPAP && lastGod > lastPPAP) {
                System.out.println("safe");
            } else {
                System.out.println("danger");
            }
        }
    }
}
