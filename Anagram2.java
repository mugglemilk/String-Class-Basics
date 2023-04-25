
import java.util.Scanner;

public class Anagram2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        int count7 = 0;
        int count8 = 0;
        for (int i = 0; i < str1.length(); ++i) {

            if (str1.charAt(i) == 'A') {
                count1++;
            } else if (str1.charAt(i) == 'B') {
                count2++;
            } else if (str1.charAt(i) == 'C') {
                count3++;
            } else if (str1.charAt(i) == 'D') {
                count4++;
            } else if (str1.charAt(i) == 'E') {
                count5++;

            } else if (str1.charAt(i) == 'F') {
                count6++;
            } else if (str1.charAt(i) == 'G') {
                count7++;
            } else if (str1.charAt(i) == 'H') {
                count8++;
            }
        }

        System.out.print(count1 + " ");
        System.out.print(count2 + " ");
        System.out.print(count3 + " ");
        System.out.print(count4 + " ");
        System.out.print(count5 + " ");
        System.out.print(count6 + " ");
        System.out.print(count7 + " ");
        System.out.print(count8 + " ");
        System.out.println();

        int count1_1 = 0;
        int count2_2 = 0;
        int count3_3 = 0;
        int count4_4 = 0;
        int count5_5 = 0;
        int count6_6 = 0;
        int count7_7 = 0;
        int count8_8 = 0;
        for (int i = 0; i < str2.length(); ++i) {
            if (str2.charAt(i) == 'A') {
                count1_1++;
            } else if (str2.charAt(i) == 'B') {
                count2_2++;
            } else if (str2.charAt(i) == 'C') {
                count3_3++;
            } else if (str2.charAt(i) == 'D') {
                count4_4++;
            } else if (str2.charAt(i) == 'E') {
                count5_5++;

            } else if (str2.charAt(i) == 'F') {
                count6_6++;
            } else if (str2.charAt(i) == 'G') {
                count7_7++;
            } else if (str2.charAt(i) == 'H') {
                count8_8++;
            }
        }

        System.out.print(count1_1 + " ");
        System.out.print(count2_2 + " ");
        System.out.print(count3_3 + " ");
        System.out.print(count4_4 + " ");
        System.out.print(count5_5 + " ");
        System.out.print(count6_6 + " ");
        System.out.print(count7_7 + " ");
        System.out.print(count8_8 + " ");
        System.out.println();

        int count1_1_1 = Math.abs(count1 - count1_1);
        int count2_2_2 = Math.abs(count2 - count2_2);
        int count3_3_3 = Math.abs(count3 - count3_3);
        int count4_4_4 = Math.abs(count4 - count4_4);
        int count5_5_5 = Math.abs(count5 - count5_5);
        int count6_6_6 = Math.abs(count6 - count6_6);
        int count7_7_7 = Math.abs(count7 - count7_7);
        int count8_8_8 = Math.abs(count8 - count8_8);

        System.out.print(count1_1_1 + " ");
        System.out.print(count2_2_2 + " ");
        System.out.print(count3_3_3 + " ");
        System.out.print(count4_4_4 + " ");
        System.out.print(count5_5_5 + " ");
        System.out.print(count6_6_6 + " ");
        System.out.print(count7_7_7 + " ");
        System.out.print(count8_8_8 + " ");
        System.out.println();
        
        int sum=count1_1_1+count2_2_2+count3_3_3+count4_4_4+count5_5_5+count6_6_6+count7_7_7+count8_8_8;
        if(sum>3){
            System.out.println("no");
        }else{
            System.out.println("anagram");
        }
    }
}
