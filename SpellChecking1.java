
import java.util.Scanner;

public class SpellChecking1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] str1 = new String[n];
        for (int i = 0; i < n; ++i) {
            str1[i] = scan.next();
        }
        for (int i = 0; i < 10; ++i) {
            String str2 = scan.next();
            boolean check=true;
            for (int j = 0; j < n; ++j) {
                if(str2.equals(str1[j])){
                    System.out.print(1);
                    check=false;
                    break;
                }
            }
            if(check){
                System.out.print(0);
            }
        }
    }
}
