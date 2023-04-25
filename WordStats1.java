
import java.util.Scanner;

public class WordStats1 {

    public static void main(String[] args) {
        int[] count = new int[26];
        Scanner scan = new Scanner(System.in);
        final int n = scan.nextInt();
        for (int i = 0; i < n; ++i) {
            char c = scan.next().charAt(0);
            int index = c - 'A';
            count[index] += 1;
        }
        for (int val = 0; val < 26; ++val) {
            if (count[val] > 0) {
                System.out.println((char) (val + 'A') + " " + count[val]);
            }
        }
    }
}
