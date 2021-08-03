
package StepikChapter3;
import java.util.Scanner;
public class ThreeWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String w1 = sc.next();
        String w2 = sc.next();
        String w3 = sc.next();

        String w11 = w1.toUpperCase();
        String w22 = w2.toUpperCase();
        String w33 = w3.toUpperCase();

           if (w11.charAt(0) < w22.charAt(0) && w22.charAt(0) < w33.charAt(0)) { // a b c
            System.out.println(w1);
            System.out.println(w2);
            System.out.println(w3);
        }
        if (w11.charAt(0) < w33.charAt(0) && w33.charAt(0) < w22.charAt(0)) { // a c b
            System.out.println(w1);
            System.out.println(w3);
            System.out.println(w2);
        }
        if (w22.charAt(0) < w11.charAt(0) && w11.charAt(0) < w33.charAt(0)) // b a c
        {
            System.out.println(w2);
            System.out.println(w1);
            System.out.println(w3);
        }
        if (w22.charAt(0) < w33.charAt(0) && w33.charAt(0) < w11.charAt(0)) // b c a
        {
            System.out.println(w2);
            System.out.println(w3);
            System.out.println(w1);
        }
        if (w33.charAt(0) < w11.charAt(0) && w11.charAt(0) < w22.charAt(0)) // c a b
        {
            System.out.println(w3);
            System.out.println(w1);
            System.out.println(w2);
        }
        if (w33.charAt(0) < w22.charAt(0) && w22.charAt(0) < w11.charAt(0)) // c b a
        {
            System.out.println(w3);
            System.out.println(w2);
            System.out.println(w1);
        }


    } //main
} // class
