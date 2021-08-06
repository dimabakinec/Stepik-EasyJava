package StepikChapter4;
import java.util.*;
public class DivisionByEleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int SummOfTree = 0, digit = sc.nextInt(), count = 0;
// version 1
//while (digit % 11 == 0) {
//    count ++;
//    digit = sc.nextInt();
//        if (digit % 3 == 0) {
//        SummOfTree += digit;
//        digit = sc.nextInt();
//        count ++;
//    }
//
//}
//System.out.println(count);
//System.out.println(SummOfTree);

// version 2

         while (digit % 11 == 0) {
             if (digit % 3  == 0) SummOfTree += digit;
             count ++;
             digit = sc.nextInt();
         }
        System.out.println(count);
System.out.println(SummOfTree);


    } // main
} // class
