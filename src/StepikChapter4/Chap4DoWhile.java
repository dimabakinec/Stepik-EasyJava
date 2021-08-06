package StepikChapter4;
import java.util.*;

public class Chap4DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), count = 0;


        for (int i = 1; i <= n; i++) {

            for (int j = 1;  j <= i; j ++) {
//                if (count == n) break;
                System.out.print(i + " ");
                count ++;

            }
        }
    }
}
