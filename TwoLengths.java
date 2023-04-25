
import java.util.Scanner;

public class TwoLengths {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] str = new String[n];

        for (int i = 0; i < n; ++i) {
            str[i] = scan.next();
        }
        int x = scan.nextInt();
        int y = scan.nextInt();
        int temp = 0;
        if (x > y) {//สลับค่า
            temp = x;
            x = y;
            y = temp;
        }
        for (int i = 0; i < n; ++i) {
            if (str[i].length() == x) {
                System.out.print(str[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < n; ++i) {
            if (str[i].length() == y) {
                System.out.print(str[i] + " ");
            }
        }
    }
}
