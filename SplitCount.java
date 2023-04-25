
import java.util.Scanner;

public class SplitCount {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String upper = scan.next();
        int countABCD = 0; //หย่อนไว้ทราบผล
        int roundABCD = 0;//แต่ละรอบที่ตรวจหา
        boolean give = true;//คืนค่าก็ต่อเมื่อเจอABCDที่ไม่มีตัวคั่นระหว่าง
        for (;;) {
            // upper[i] = scan.next();
            int indexAB;
            indexAB = upper.indexOf("AB", roundABCD);
            if (indexAB == -1) {
                give = true;
                break;
            }
            int indexCD;
            indexCD = upper.indexOf("CD", indexAB + 1);
            if (indexCD == -1) {
                give = true;
                break;
            }
            int indexABbet;
            indexABbet = upper.indexOf("AB", indexAB + 1);
            if (indexABbet == -1 || indexABbet > indexCD) {
                give = true;
                countABCD++;
            }
            roundABCD = indexAB + 1;
        }
        System.out.println(countABCD);
    }
}
