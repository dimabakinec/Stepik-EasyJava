package StepikChapter2;
import java.util.Scanner;

public class stepik28 {
    public static void main(String[] args) {

        int x, y, summ, raznost;

        Scanner in = new Scanner(System.in);
x = in.nextInt();
y = in.nextInt();
summ = x + y;
raznost = x - y;

//        n = in.nextInt();
//        year = (n / 400) - (n / 100) + (n / 4);

//        b = in.nextDouble();
//        c = in.nextDouble();

//        summ = -1*(b/a);
//        proizv = c/a;


        System.out.println("Сложение: " + x + " + " + y + " = " + summ);
        System.out.println("Вычитание: " + x + " - " + y + " = " + raznost);
//

    }
}
