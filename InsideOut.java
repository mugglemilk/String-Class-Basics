
import java.util.Scanner;

public class InsideOut {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        if (str.length() % 2 != 0) {
            System.out.print(str.charAt(str.length() / 2));
            int first = (str.length() / 2) - 1;
            int last = (str.length() / 2) + 1;
            for (int i = 0; i < str.length() / 2; ++i) {
                System.out.print(str.charAt(first));
                System.out.print(str.charAt(last));
                first--;
                last++;
            }
        }

        if (str.length() % 2 == 0) {
            System.out.print(str.charAt(str.length() / 2 - 1));
            int first = (str.length() / 2 - 1) - 1;
            int last = (str.length() / 2 - 1) + 1;
            for (int i = 0; i < str.length() / 2 - 1; ++i) {
                System.out.print(str.charAt(last));
                System.out.print(str.charAt(first));
                first--;
                last++;
            }
            System.out.println(str.charAt(last));
        }
    }
}
