
import java.util.Scanner;

public class DivideString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        for (int i = 0; i < name.length(); ++i) { //check all of position
            char c = name.charAt(i); // 
            if ('a' <= c && c <= 'z') {
               System.out.print(c);
            }
        }
        System.out.println("");
        for (int i = 0; i < name.length(); ++i) {
            char c = name.charAt(i);
            if ('A' <= c && c <= 'Z') {
                System.out.print(c);
            }
        }
        System.out.println("");
        for (int i = 0; i < name.length(); ++i) {
            char c = name.charAt(i);
            if (!(('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z'))) {
                System.out.print(c);
            }
        }
        System.out.println("");        
    }
}
