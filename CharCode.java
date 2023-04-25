
import java.util.Scanner;

public class CharCode {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ch = scan.next();
        char c = ch.charAt(0);
        int valC = (int) c;
        System.out.println(valC);
    }
}
