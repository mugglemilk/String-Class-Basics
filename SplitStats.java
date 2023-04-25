
import java.util.ArrayList;
import java.util.Scanner;

public class SplitStats {

    public static void main(String[] args) {
        ArrayList<Integer> AB = new ArrayList<>();
        ArrayList<Integer> CD = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String upper = scan.next();
        int countABCD = 0; //หย่อนไว้ทราบผล
        int howfarABCD = -1;//จุดที่ห่างกันมากสุด
        int roundABCD = 0;

        boolean give = true;//คืนค่าก็ต่อเมื่อเจอABCDที่ไม่มีตัวคั่นระหว่าง
        //String indexN = "";
        for (;;) {

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
                if (howfarABCD < (indexCD - indexAB - 2)) {
                    howfarABCD = indexCD - indexAB - 2;
                }
                AB.add(indexAB);
                CD.add(indexCD);
            }
            roundABCD = indexAB + 1;

        }
        System.out.println(countABCD);
        System.out.println(howfarABCD);
        for (int spot = 0; spot < AB.size(); ++spot) {
            int far = AB.get(spot);
            int bet = CD.get(spot);
            int maxlength = bet - far - 2;
            if (maxlength == howfarABCD) {
                System.out.println(upper.substring(far + 2, bet));
            }
        }
    }
}
