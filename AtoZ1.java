
import java.util.Scanner;

public class AtoZ1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        int a = str.indexOf('A');
        int z = str.indexOf('Z');
        if (a < z) {
            System.out.println(str.substring(a, z + 1));
        }
        if (a > z) {
            for (int i = a; i >= z; --i) {
                System.out.print(str.charAt(i));
            }
        }
    }
}
