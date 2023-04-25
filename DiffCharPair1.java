
import java.util.Scanner;

public class DiffCharPair1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        char x = scan.next().charAt(0);
        char y = scan.next().charAt(0);
        int index = 0;

        while (index + 1 < word.length()) {
            if (word.charAt(index) == x) {
                if (word.charAt(index + 1) == y) {
                    System.out.print(index + 1 + " ");
                    index++;
                }

            } else if (word.charAt(index) == y) {
                if (word.charAt(index + 1) == x) {
                    System.out.print(index + 1 + " ");
                    index++;
                }
            }
            index++;
        }
    }
}
