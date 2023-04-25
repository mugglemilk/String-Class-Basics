
import java.util.Scanner;

public class SubMatch1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();
        String text = str2.substring(0, 3);
        if (str1.indexOf(text) != -1) {
            System.out.println(str1.indexOf(text) + 1);
        } else {
            System.out.println("No");
        }
        text = str2.substring(1, 4);
        if (str1.indexOf(text) != -1) {
            System.out.println(str1.indexOf(text) + 1);
        } else {
            System.out.println("No");
        }
        text = str2.substring(2);
        if (str1.indexOf(text) != -1) {
            System.out.println(str1.indexOf(text) + 1);
        } else {
            System.out.println("No");
        }
    }
}
