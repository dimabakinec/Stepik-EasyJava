package StepikChapter4;
import java.util.*;
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String number = sc.next();
        int x = number.length();
        int y = 0;


    do {
        char letter = number.charAt(x-1);
        System.out.print(letter);
        x --;
    }
    while (x > y);


    }
}
