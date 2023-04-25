
import java.util.Scanner;

public class SameLength {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] str = new String[n];
        

        for (int i = 0; i < n; ++i) {
            str[i] = scan.next();//รับค่าจำนวนสตริง
        }
        
        int k = scan.nextInt();
        String[] name = new String[k];
        for (int i = 0; i < k; ++i) {
            name[i] = scan.next();
        }
        for(int i=0 ; i<k ; ++i){
            for(int j=0 ; j<n ; ++j){
                if(str[j].length() == name[i].length()){//สตริงชุดที่สองตั้งเป็นหลักเพื่อไปเช็คกับสตริงตัวบน
                    System.out.print(str[j].charAt(0) + " ");//charAt ได้มาเป็นตัวอักษร
                }              
            }
            System.out.println();
        }
        
    }
}
