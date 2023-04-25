
import java.util.Scanner;

public class KeyWord1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] name = new String[n];
        int count = 0; //จำนวนค่าที่ไม่ซ้ำ ใช้กำหนดตำแหน่ง array
        for (int i = 0; i < n; ++i) {
            String msg = scan.next(); //ข้อความ
            boolean dup = false; //ตรวจสอบหาตัวที่ซ้ำ
            for (int j = 0; j < n; ++j) {
                if (name[j] == msg) {
                    msg = name[j];
                    dup = false;
                }
                name[j] = msg;
            }
            System.out.print(msg + " ");
        }
    }
}
