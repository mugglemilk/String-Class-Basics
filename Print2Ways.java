
import java.util.Scanner;

public class Print2Ways {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] str = new String[n + 1];
        for (int i = 1; i <= n; ++i) {
            str[i] = scan.next();
        }
        int k = scan.nextInt();
        for (int i = 0; i < k; ++i) {
            int id = scan.nextInt();
            int dir = scan.nextInt();
            int index = scan.nextInt();
            if (dir == 1) {
                for (int j = index; j <= str[id].length() - 1; ++j) {
                    System.out.print(str[id].charAt(j));
                }
                for (int j = 0; j < index; ++j) {
                    System.out.print(str[id].charAt(j));
                }
            } else if (dir == -1) {
                for (int j = index; j >= 0; --j) {
                    System.out.print(str[id].charAt(j));
                }
                for (int j = str[id].length() - 1; j > index; --j) {
                    System.out.print(str[id].charAt(j));
                }
            }
            System.out.println();
        }
    }
}
