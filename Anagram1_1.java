
import java.util.Scanner;

public class Anagram1_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int[] array = new int[8];
        for (int i = 0; i < str.length(); ++i) {
            int a = str.charAt(i) - 65;
            array[a]++;
        }
        for (int i = 0; i < 8; ++i) {
            System.out.print(array[i]+" ");
        }
    }
}
