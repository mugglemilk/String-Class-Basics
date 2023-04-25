
import java.util.Scanner;

public class indexOf {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        if (str1.indexOf(str2) == -1) {
            System.out.println("string not found");
        } else {
            System.out.println(str1.indexOf(str2) + 1);
        }
    }
}
