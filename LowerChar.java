
import java.util.Scanner;

public class LowerChar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char a = scan.next().charAt(0);
        char b = scan.next().charAt(0);

        char chance = ' ';

        int x = scan.nextInt();
        int y = scan.nextInt();

        for (int i = 0; i < str.length(); ++i) {
            if (i >= x - 1 && i <= y - 1) {
                if (a < b) {
                    chance = a;
                    if (str.charAt(i) >= a && str.charAt(i) <= b) {
                        System.out.print(chance);
                    } else {
                        System.out.print(str.charAt(i));
                    }
                } else {
                    chance = b;
                    if (str.charAt(i) >= b && str.charAt(i) <= a) {
                        System.out.print(chance);
                    } else {
                        System.out.print(str.charAt(i));
                    }
                }
            } else {
                System.out.print(str.charAt(i));
            }
        }
    }
}
