package StepikChapter3;
import java.util.Scanner;

public class Test33 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int salary1 = sc.nextInt(), salary2 = sc.nextInt(), salary3 = sc.nextInt(), diff = sc.nextInt();

        int min=0;
        int max=0;
        if (salary1 > salary2 && salary1 > salary3) {
            max = salary1;
        }
        else if (salary2 > salary1 && salary2 > salary3) {
            max = salary2;
        }
        else
            max = salary3;

        if (salary1 < salary2 && salary1 < salary3) {
            min = salary1;
        }
        else if (salary2 < salary1 && salary2 < salary3) {
            min = salary2;
        }
        else
            min = salary3;
        if (max - min < diff){
            System.out.println("За работу, Солнце ещё высоко");

        }
        else if (max - min > diff) {
            System.out.println("Ура, бастуем!");
        }

    }
}
