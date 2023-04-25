
import java.util.Scanner;

public class DiffCharPair2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        char x = scan.next().charAt(0);
        char y = scan.next().charAt(0);
        int index = 0;

        while (index + 1 < word.length()) {
            if (word.charAt(index) == x) {

                if (word.charAt(index + 1) == y) {
                    if (index - 1 < 0) {
                        System.out.print(index + 1 + " ");

                    } else if (index - 1 >= 0 && index + 1 < word.length()) {
                        if (word.charAt(index + 2) != x && word.charAt(index + 2) != y && word.charAt(index - 1) != x && word.charAt(index - 1) != y) {
                            System.out.print(index + 1 + " ");
                        }
                    } else if (index + 1 == word.length() - 1) {
                        System.out.print(index + 1 + " ");
                    }
                    index++;
                }
            } else if (word.charAt(index) == y) {
                if (word.charAt(index + 1) == x) {
                    if (index - 1 < 0 && word.charAt(index + 2) != x && word.charAt(index + 2) != y) {
                        System.out.print(index + 1 + " ");
                    } else if (index - 1 >= 0 && index + 2 < word.length()) {
                        if (word.charAt(index + 2) != x && word.charAt(index + 2) != y && word.charAt(index - 1) != x && word.charAt(index - 1) != y) {
                            System.out.print(index + 1 + " ");
                        }
                    } else if (index + 1 == word.length() - 1 && word.charAt(index - 1) != x && word.charAt(index - 1) != y) {
                        System.out.print(index + 1 + " ");
                    }
                    index++;
                }
            }

            index++;
        }
    }
}
