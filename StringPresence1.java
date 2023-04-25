
import java.util.Scanner;

public class StringPresence1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] name = new String[n];
        for (int i = 0; i < n; ++i) {
            name[i] = scan.next();
        }
        String strName = scan.next();
        boolean isFound = false;
        //int i = strName.indexOf("si");
        // System.out.println(i);

        // i = strName.indexOf("lpa");
        //System.out.println(i);
        // int count=0;
        for (int i = 0; i < n; ++i) {
            int index = strName.indexOf(name[i]);
            if (index >= 0) {
                System.out.print(name[i] + " ");
                isFound = true;
            }
        }
        if (isFound == false) {
            System.out.println("none");
        }
    }
}
/*
5
si lpa korn uni sity
ohsitylauniWkornlpc
si korn uni sity
6
A b a abbot ba baki
bAbabootAbaki
A b a ba baki
3
hey yeah Wow
HeyYeahwowWoW 
 */
