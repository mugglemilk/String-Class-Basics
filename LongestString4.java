
import java.util.Scanner;

public class LongestString4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str2 = "";
        for (;;) {
            String str1= scan.nextLine();

            if (str1.length() == 0) {
                break;
            } else if (str1.length() >= str2.length()) {
                str2 = str1;
            }
        }
        System.out.print(str2);
    }
}
