
import java.util.Scanner;

public class indexOf2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        int i = 0;
        boolean check = true;
        while (i < str1.length()) {
            i = str1.indexOf(str2, i);
            if (i == -1) {
                break;
            }
            System.out.print(i + 1 + " ");
            i++;
            check = false;
        }
        if (check) {
            System.out.println("string not found");
        }
    }
}
