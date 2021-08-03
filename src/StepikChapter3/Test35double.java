package StepikChapter3;
import java.util.*;
public class Test35double {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a  = sc.nextInt();

        if (a >= 1 && a <= 12) {
            if (a >= 3 && a <= 5) {
                System.out.println("Весна");
            }
            else if (a >= 6 && a <=8) {
                System.out.println("Лето");
                            }
            else if (a >= 9 && a <= 11) {
                System.out.println("Осень");
            }
            else if ((a >= 1 && a <= 2) || a == 12) {
                System.out.println("Зима");
            }

        }

        else System.out.println("error");

    }
}
