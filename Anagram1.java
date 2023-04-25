
import java.util.Scanner;

public class Anagram1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        int count7 = 0;
        int count8 = 0;
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == 'A') {
                count1++;
            } else if (str.charAt(i) == 'B') {
                count2++;
            } else if (str.charAt(i) == 'C') {
                count3++;
            } else if (str.charAt(i) == 'D') {
                count4++;
            } else if (str.charAt(i) == 'E') {
                count5++;
            } else if (str.charAt(i) == 'F') {
                count6++;
            } else if (str.charAt(i) == 'G') {
                count7++;
            } else if (str.charAt(i) == 'H') {
                count8++;
            }
        }
        System.out.print(count1 + " ");
        System.out.print(count2 + " ");
        System.out.print(count3 + " ");
        System.out.print(count4 + " ");
        System.out.print(count5 + " ");
        System.out.print(count6 + " ");
        System.out.print(count7 + " ");
        System.out.print(count8 + " ");
    }
}
