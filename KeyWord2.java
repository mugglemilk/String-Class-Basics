
import java.util.Scanner;

public class KeyWord2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int n = scan.nextInt();
        String[] words = new String[n];
        int count = 0;
        int[] countmax = new int[n];
        for (int i = 0; i < n; i++) {
            countmax[i] = 1;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            String w = scan.next();
            boolean c = false;

            for (int j = 0; j < count; j++) {
                if (w.equalsIgnoreCase(words[j])) {
                    countmax[j]++;
                    if (countmax[j] > max) {
                        max = countmax[j];
                    }
                    c = true;
                    break;
                }
            }

            if (c == false) {
                words[count] = w;
                System.out.print(words[count] + " ");
                count++;
            }
        }
        System.out.println("");
        System.out.print(max + " ");
        for (int i = 0; i < count; i++) {
            if (countmax[i] == max) {
                System.out.print(words[i] + " ");
            }

        }
    }
}
