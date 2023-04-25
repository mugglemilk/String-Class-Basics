
import java.util.Scanner;

public class CharAt {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        int n = scan.nextInt();
        if (n - 1 < 0 || n-1 >= str1.length()) {
            System.out.println("invalid position");
        } else {
            System.out.println(str1.charAt(n - 1));
        }
    }
}
