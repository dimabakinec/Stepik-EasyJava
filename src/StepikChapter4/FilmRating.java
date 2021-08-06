package StepikChapter4;
import java.util.*;
public class FilmRating {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int Score = sc.nextInt(), count = 0;
        double rating = 0;

        while (Score >= 0 && Score <= 10) {
//            if (Score > 10 || Score < 0 ) continue;
            rating += Score;
            count ++;
            Score = sc.nextInt();

        }
System.out.println(rating / count);

    }
}
