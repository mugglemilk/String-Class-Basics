
import java.util.Scanner;

public class StringPresence3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] name = new String[n];
        for (int i = 0; i < n; ++i) {
            name[i] = scan.next();
        }
        int[] countFound = new int[n];
        int[] countFirst = new int[n];
        int[] countLast = new int[n];

        boolean isFound = false;
        int k = scan.nextInt();
        for (int i = 0; i < k; ++i) {
            String strName = scan.next();

            String firstString = "";
            int firstIndex = Integer.MAX_VALUE;
            int firstStringIndex = 0;

            String lastString = "";
            int lastIndex = Integer.MAX_VALUE;
            int lastStringIndex = 0;
            for (int j = 0; j < n; ++j) {
                int index = strName.indexOf(name[j]);
                if (index >= 0) {
                    isFound = true;
                    countFound[j] += 1;
                }
                if (index < firstIndex) {
                    firstIndex = index;
                    firstStringIndex = j;
                } else if ((index == firstIndex) && (name[j].length() > firstIndex)) {
                    firstString = name[j];
                    firstStringIndex = j;
                }
                if (index > lastIndex) {
                    lastIndex = index;
                    lastString = name[j];
                    lastStringIndex = j;
                } else if ((index == lastIndex) && (name[j].length() > lastIndex)) {
                    lastString = name[j];
                    lastStringIndex = j;
                }
            }
            countFirst[firstStringIndex] += 1;
            countLast[lastStringIndex] += 1;
            System.out.println(firstString); 
          
        }
        //System.out.println(k);
    }
}
