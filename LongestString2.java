
import java.util.Scanner;

public class LongestString2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
           int max = Integer.MIN_VALUE;
           String maxName = "";
        for (int i = 0; i < 5; ++i) {
            String name = scan.nextLine();
            int message = name.length();
           // System.out.println(message);

            if (message > max) {
                max = message;
                maxName = name;
            }
        }
        System.out.println(maxName);
    }
}
