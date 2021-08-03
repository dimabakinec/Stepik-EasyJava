package StepikChapter3;
import java.util.Scanner;
public class GoogleSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int salary1, salary2, salary3, diff;

        salary1 = sc.nextInt();
        salary2 = sc.nextInt();
        salary3 = sc.nextInt();
        diff = sc.nextInt();

        sc.close();

        int min1 = Math.min(salary1, salary2);
        int min2 = Math.min(min1, salary3);

        int max1 = Math.max(salary1, salary2);
        int max2 = Math.max(max1, salary3);

        int diff1 = max2 - min2;

        System.out.println("Min: " + min2 + " max: " + max2 + " diff: " + diff1 );


        if (diff1 > diff) {
            System.out.println("Ура, бастуем!");
                     }

        else
        {
                System.out.println("За работу, Солнце ещё высоко");
        }


    } //main
} //class
