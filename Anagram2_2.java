
import java.util.Scanner;

public class Anagram2_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();
        int[] array1 = new int[8];
        int[] array2 = new int[8];
        for (int i = 0; i < str1.length(); ++i) {
            int a = str1.charAt(i) - 65;
            array1[a]++;
        }
        for (int i = 0; i < 8; ++i) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < str2.length(); ++i) {
            int a = str2.charAt(i) - 65;
            array2[a]++;
        }
        for (int i = 0; i < 8; ++i) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        int sum=0;
        for(int i=0;i<8;++i){
           int x = Math.abs(array1[i]-array2[i]);
            System.out.print(x+" ");
            sum+=x;
        }
        System.out.println();
        if(sum>3){
            System.out.println("no");
        }else{
            System.out.println("anagram");
        }
    }
}
