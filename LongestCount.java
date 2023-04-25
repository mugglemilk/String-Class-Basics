
import java.util.Scanner;

public class LongestCount {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str2 = "";
        int max=0;
        int sum=0;
        for (;;) {
            String str1= scan.nextLine();
            if (str1.length() == 0) {
                break;
            } else if (str1.length() > max) {
                max=str1.length();   
                sum=0;
            }if(str1.length()==max){
                sum++;
            }          
        }
        System.out.println(max);
        System.out.print(sum);
    }
}
