
import java.util.Scanner;

public class CharSweep {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        int pos = scan.nextInt();
        int type = scan.nextInt();
        char c = name.charAt(pos);
        String letter = "";
        if (type == 1) {
            for (int i = pos; i < name.length(); ++i) {
                //char cc = name.charAt(i);

                if (c <= name.charAt(i)) {
                    letter += name.charAt(i);
                }
            }
            for (int i = 0; i < pos; ++i) {
                //char cc = name.charAt(i);
                if (c <= name.charAt(i)) {
                    letter += name.charAt(i);
                }
            }
        } else if (type == -1) {
            for (int i = pos; i >= 0; --i) {
                if (c <= name.charAt(i)) {
                    letter += name.charAt(i);
                }
            }
            for (int i = name.length() - 1; i > pos; --i) {
                if (c <= name.charAt(i)) {
                    letter += name.charAt(i);
                }
            }
        }
        System.out.println(letter);
    }
}

/*
รับค่า
1. String ตัวพิมพ์ใหญ่ ไม่มีช่องว่างคั่น และกำหนดความยาวด้วย
2. position ตัวอักษรที่สนใจ อยู่ในช่วง index ที่ถูกต้องของ String *บรรทัดแรก*
3. ทิศทางในการสำรวจตัวอักษร 1 = สำรวจไปทางขวา loop 1
                       -1 = สำรวจไปทางซ้าย loop 2
ผลลัพธ์
1. อักษร position ที่สนใจ และ ตามหลังอักษรนั้นตามหลักพจนานุกรมตามลำดับการพบระหว่างสำรวจ
   เช่น A B C D E F
 */
 /*

AFJKQWERJGKJASFJBFHWQFLKCWEJQD
9
1

AFJKQWERJGKJASFJBFHWQFLKCWEJQD
9
-1

JTUSLDTULPAFQWGADFQWRNVZQYLW
4
1

JTUSLDTULPAFQWGADFQWRNVZQYLW
4
-1

 */
