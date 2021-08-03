package StepikChapter3;
import java.util.Scanner;
public class TwoSegments {
    public static void main(String[] args) {

// поиск НЕпересечения
// поиск точки соприкосновения  (максимальной первого отрезка с минимальной второго) и наоборот
// поиск точки внутри первого отрезка, потом второго
// поиск первого отрезка внутри второго, и наоборот
// поиск пересечения отрезков (тоже 2 варианта)

//        (A2 - B1)*(B2 - A1) <= 0


        Scanner sc = new Scanner(System.in);
        int A1 = sc.nextInt(), B1 = sc.nextInt(), A2 = sc.nextInt(), B2 = sc.nextInt();



        if (A1 < A2 && B1 < A2)
                {
            System.out.println("Пересечения нет"); // 1
        }
        else if (A2 < A1 && B2 < A1){
            System.out.println("Пересечения нет"); // 2
        }
        else if (A1 < A2 && B2 < B1) {
            System.out.println(A2 + " " + B2); // 3
        }
        else if (A2 < A1 && B1 < B2) {
            System.out.println(A1 + " " + B1); // 4
        }
        else if (A1 < A2 && A2 < B1 && B1 < B2) {
            System.out.println(A2 + " " + B1); // 5
        }
        else if (A2 < A1 && A1 < B2 && B2 < B1) {
            System.out.println(A1 + " " + B2); // 6
        }
        else if (A1 < B1 && B1 == A2 && B1 < B2) {
            System.out.println(B1); // 7
        }
        else if (A2 < B2 && A1 == B2 && B2 < B1) {
            System.out.println(B2); // 8
        }
        else if (A1 == A2 && B1 == B2) {
            System.out.println(A1 + " " + B2); // 9
        }
        else if (A1 == A2 && A2 < B1 & B1 < B2) {
            System.out.println(A2 + " " + B1); // 10
        }

        else if (B1 == B2 && A2 < A1 && A1 < B2) {
            System.out.println(A1 + " " + B2); // 11
        }
        else if (A1 < A2 && A2 < B1 && B1 == B2) {
            System.out.println(A2 + " " + B1); // 12
        }
        else if (A1 == A2 && A1 < B2 && B2 < B1) {
            System.out.println(A2 + " " + B2); // 13
        }
    }
}

//    int max_a = Math.max(a1, a2);
//    int min_b = Math.min(b1, b2);
//
//        if (max_a == min_b){
//                System.out.println(max_a);
//                } else if (max_a < min_b) {
//        System.out.println(max_a + " " + min_b);
//        } else {
//        System.out.println("Пересечения нет");
//        }