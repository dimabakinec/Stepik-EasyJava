package StepikChapter3;
import java.util.*;

public class MaxOfEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();

        int A1 = Math.max(x, Math.max(y, z));
        int A2 = Math.max(y, z);
        int A3 = Math.max(x, z);
        int A4 = Math.max(x, y);

        if (x % 2 ==0 && y % 2 == 0 && z % 2 == 0) {
            System.out.println(A1);
            }
        else if (x % 2 != 0 && y % 2 == 0 && z % 2 == 0) {
            System.out.println(A2);
        }
else if (x % 2 ==0 && y % 2 != 0 && z % 2 == 0){
            System.out.println(A3);
        }
        else if (x % 2 ==0 && y % 2 == 0 && z % 2 != 0){
            System.out.println(A4);
        }
        else if (x % 2 !=0 && y % 2 != 0 && z % 2 == 0){
            System.out.println(z);
        }
        else if (x % 2 ==0 && y % 2 != 0 && z % 2 != 0){
            System.out.println(x);
        }
        else if (x % 2 !=0 && y % 2 == 0 && z % 2 != 0){
            System.out.println(y);
        }
        else {
            System.out.println("Чётных чисел нет");
        }
    }
}
