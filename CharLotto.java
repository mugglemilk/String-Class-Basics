
import java.util.Scanner;

public class CharLotto {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str1 = new String[12];
        for (int i = 0; i < str1.length; ++i) {
            str1[i] = scan.next();
        }
        int sum2=0;
        for (int i = 0; i < 6; ++i) {
            String str2 = scan.next();
            int sum = 0;
            for (int j = 0; j < 12; ++j) {
                if (str2.equals(str1[j])) {
                    sum++;
                }
            }
            System.out.print(sum+" ");
            sum2+=sum;
        }
        System.out.println();
        System.out.print(sum2+" ");
    }
}
