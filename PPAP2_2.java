
import java.util.Scanner;

public class PPAP2_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String msg = scan.next();
        int i = 0;
        while (true) {
            int firstPPAP = msg.indexOf("PPAP", i);
            int lastPPAP = msg.indexOf("PPAP", firstPPAP + 1);
            int firstGod = msg.indexOf("GOD", firstPPAP);
            if (firstPPAP < firstGod && lastPPAP < firstGod) {
                System.out.println(lastPPAP + 4);
                break;
            }
            i = lastPPAP;
        }
    }
}
