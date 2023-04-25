
import java.util.Scanner;

public class LongestString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str2 = "";
        for (int i = 1; i <= 5; ++i) {
            String str1 = scan.nextLine();
            if (str1.length() > str2.length()) {
                str2=str1;
            }
        }
        System.out.print(str2);
    }
}
