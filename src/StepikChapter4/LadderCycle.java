package StepikChapter4;
import java.util.*;
public class LadderCycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String x = "1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6 6 6";


        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++){

            System.out.println(x.substring(0, i*2-1));


    }

    } // main
} // class
