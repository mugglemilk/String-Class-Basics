
import java.util.Scanner;

public class SubMatch2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();
        String[] msg = new String[str2.length()];
        int n = 0;
        for (int i = 0; i < str2.length(); ++i) {
            if (i + 3 <= str2.length()) {
                n++;
                msg[i] = str2.substring(i, i + 3);
            }
        }
        for (int i = 0; i < n; ++i) {
            if (str1.indexOf(msg[i]) != -1) {
                System.out.println(str1.indexOf(msg[i]) + 1);
            } else {
                System.out.println("No");
            }
        }
    }
}
