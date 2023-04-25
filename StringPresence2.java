
import java.util.Scanner;

public class StringPresence2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] name = new String[n];
        for (int i = 0; i < n; ++i) {
            name[i] = scan.next();
        }
        String strName = scan.next();
        boolean isFound = false;
        String firstmes = "";
        int firstpos = Integer.MAX_VALUE;
        for (int i = 0; i < n; ++i) {
            int index = strName.indexOf(name[i]);
            System.out.println(name[i] + " " + index);
            if (index >= 0) {
                System.out.print(name[i] + " ");
                isFound = true;
                if (index < firstpos) {
                    firstpos = index;
                    firstmes = name[i];

                }
            }
        }
        System.out.println(firstmes);
        //if (isFound == false) {
        //  System.out.println("none");
        //}
    }
}
