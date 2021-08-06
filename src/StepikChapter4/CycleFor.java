package StepikChapter4;
import java.util.*;
public class CycleFor {
    public static void main(String[] args) {


        int n = new Scanner(System.in).nextInt();

        for (int y = 1; n >= y; y++) {
            int x = 0;
            for (int i = 1; y >= i; i++) {
                for (int j = 1; i >= j; j++) {

                    if (y == x)
                        break;

                    x++;
                    if (y == x)
                        System.out.println(i);
                    else
                        System.out.print(i + " ");

                }
            }
        }
















        //
//        Scanner sc = new Scanner(System.in);
////        int n = sc.nextInt();
//
//        String x = "1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6 6 6";
//        int n = sc.nextInt();
//
////        x = x.substring(0,n*2-1);
//
//        x = x.substring(0,3);
//        System.out.println(x);


//
//        for (int x = 1; x <= n; x++) {
//            for (int i = 1; i <= x; i++) {
//                for (int j = 1; j <= i; j++) {
//                    System.out.print(i + " ");
//                }
//            }
//            System.out.println();
//    }

//
//        for (int i = 1; i <= n; i++) {
//
//            for (int j = 1; j <= i; j ++) {
//
//                if (j < i) {
//                    System.out.print(j + " ");
//                }
//                if (j == i) { // проверка на пробел
//                    System.out.print(j);
//                }
//
//            }
//            System.out.println();
//        }







//        int x2, x3, x4, x5;
//        while (sc.hasNext()) {
//            x = sc.nextInt();
//            x2 = x * x;
//            x3 = x * x * x;
//            x4 = x * x * x * x;
//            x5 = x * x * x * x * x;
//
//            System.out.print(x2 + " " + x3 + " " + x4 + " " + x5);
//            System.out.println();
//
//            }


//        for (int i = 1; i < 10;) {
//            System.out.print(i + " "); // Бесконечный цикл
//        }

//        for (int i = 5; i > -1; i--) {
//            System.out.print(i + " "); // 5 4 3 2 1 0
//        }
//
//        for (int i = 5; i < 10; i += 2) {
//            System.out.print(i + " "); // 5 7 9
//        }

//        for (int i = 2; i < 50; i = i * i) {
//            System.out.println(i); // 2 4 16
//        }
//            for (int i = 6; i <= n ; i += 6 ) {
//                    System.out.print(i + " "); }
//            if (n < 6) System.out.print("Таких чисел нет");

// output "stars" like a cube
//        for (int z = 0; z < x; z ++) {
//
//            for (int i = 0; i < y; i++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

// output chars, cycle in cycle

//        String s = "Java";
//
//        for (int i = 0; i < s.length(); i++) {
//            if (i % 2 == 0) {
//                for (int j = 0; j < 5; j ++) {
//                    System.out.print(s.charAt(i));
//                }
//            } else {
//                for (int j = 0; j < 3; j ++) {
//                    System.out.print(s.charAt(i));
//                }
//            }
//            System.out.println();    // Перевод строки
//        }




    } // main
} // class
