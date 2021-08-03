package StepikChapter4;
import java.util.*;
public class Chap4While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int count = 0;

        while (sc.hasNext()) {
            String word = sc.next();
            count++;
            }
        System.out.print(count);

    } // main
} // class
