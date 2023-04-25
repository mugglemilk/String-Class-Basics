
import java.util.Scanner;

public class StringCut {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String text = scan.next();
        char c = text.charAt(0);
        int start = 0;
        boolean check = false;
        boolean frist = false;
        boolean print = false;
        int sum = 0;
        for (int i = 0; i < str1.length(); i++) {
            char s = str1.charAt(i);
            if (c == s) {
                sum++;
            }
        }
        int ff = 0;
        if (sum == str1.length()) {
            System.out.println("no output");
        } else if (str1.indexOf(c) == -1) {
            print = true;
            System.out.println("no target character found");
        } else {
            for (int i = 0; i < str1.length(); ++i) {

                if (str1.charAt(i) == c) {
                    if (!check && frist) {
                        System.out.println(str1.substring(start, i));
                    }
                    start = i + 1;
                    check = true;
                } else if (str1.charAt(i) != c) {
                    frist = true;
                    check = false;
                }
                if (i == str1.length() - 1) {
                    System.out.println(str1.substring(start));
                }
            }
        }
    }
}
