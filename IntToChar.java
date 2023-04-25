
import java.util.Scanner;

public class IntToChar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int code = scan.nextInt();
        if ((int) 'A' > code || code > (int) 'Z') {
            System.out.println("unsupported code");
        } else {
            System.out.println((char) code);
        }
    }
}
