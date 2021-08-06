package StepikChapter4;
import java.util.*;
public class alphabetWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String words1 = sc.nextLine();

        int x1 = words1.charAt(0), x2 = words1.charAt(2);

        while (sc.hasNext()) {
            String words2 = sc.next();
            int x3 = words2.charAt(0);

            if (x3 <= x2 && x3 >= x1)
                System.out.println(words2);
        }


    } // main
 } // class
