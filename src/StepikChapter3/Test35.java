package StepikChapter3;
import java.util.*;

public class Test35 {
    public static void main(String[] args) {
        Scanner sс = new Scanner(System.in);
        String a = sс.nextLine();
        int x = a.length();
        switch(x)
        {
            case 1:
                System.out.print("Одна буква");
                break;
            case 2:
                System.out.print("Две буквы");
                break;
            case 3:
                System.out.print("Три буквы");
                break;
            case 4:
                System.out.print("Четыре буквы");
                break;
            case 5:
                System.out.print("Пять букв");
                break;
            default:
                System.out.print("Длинное слово");
        }

    } // main
} // class
