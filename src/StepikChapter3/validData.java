
//        год, номер которого кратен 400, — високосный;
//        остальные годы, номер которых кратен 100, — невисокосные (например, годы 1700, 1800, 1900, 2100, 2200, 2300);
//        остальные годы, номер которых кратен 4, — високосные.
// На вход подаются целых три числа - день, месяц и год (по григорианскому календарю).
// Выведите true, если эти числа составляют валидную дату, и false - в противном случае.

// (year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0) - leap year

//if (((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) && ((month == 2) && (day == 29)))

// дополнительно переменная flag, которая определяет високосный ли это год и соответственно хранит в себе либо 28,
// либо 29 для февраля. Еще одна переменная dmax для определения максимального количества дней в месяце (30 или 31).
//
//        Затем через условия сначала определяем високосный ли это год и вносим в переменную flag (28 или 29).
//        Затем через if определяем месяцы, в которых 30 дней (4, 6, 9, 11) и заносим в dmax значение 30.
//        Аналогично if для оставшихся месяцев (dmax = 31). Еще одно условие для февраля (dmax = flag).
//        Затем общее условие на проверку корректности введенных данных и вывод на печать либо true, либо false.

// jan 1-31
// fab 1-28(29)
// mar 1-31
// apr 1-30
// may 1-31
// jun 1-30
// jul 1-31
// aug 1-31
// sep 1-30
// oct 1-31
// nov 1-30
// dec 1-31

//(month >= 1 && month <= 12) &
//        (month == 1 && day >= 1 && day <= 31) ||
//        (month == 2 && day >= 1 && day <= 28) ||
//        (month == 3 && day >= 1 && day <= 31) ||
//        (month == 4 && day >= 1 && day <= 30) ||
//        (month == 5 && day >= 1 && day <= 31) ||
//        (month == 6 && day >= 1 && day <= 30) ||
//        (month == 7 && day >= 1 && day <= 31) ||
//        (month == 8 && day >= 1 && day <= 31) ||
//        (month == 9 && day >= 1 && day <= 30) ||
//        (month == 10 && day >= 1 && day <= 31) ||
//        (month == 11 && day >= 1 && day <= 30) ||
//        (month == 12 && day >= 1 && day <= 31)

//(month >=1 & month <=12) &
//        (month >= 1 & month <= 12) &
//        (month == 1 & day >= 1 & day <= 31) ||
//        (month == 2 & day >= 1 & day <= 28) ||
//        (month == 3 & day >= 1 & day <= 31) ||
//        (month == 4 & day >= 1 & day <= 30) ||
//        (month == 5 & day >= 1 & day <= 31) ||
//        (month == 6 & day >= 1 & day <= 30) ||
//        (month == 7 & day >= 1 & day <= 31) ||
//        (month == 8 & day >= 1 & day <= 31) ||
//        (month == 9 & day >= 1 & day <= 30) ||
//        (month == 10 & day >= 1 & day <= 31) ||
//        (month == 11 & day >= 1 & day <= 30) ||
//        (month == 12 & day >= 1 & day <= 31)


package StepikChapter3;
import java.util.Scanner;
public class validData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();

        int dmax;
        int flag;


    if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0))
        {
            flag = 29;
                 }
        else
        {
            flag = 28;
        }

        if (month == 4 || month == 6 || month == 9 || month == 11)
        {
            dmax = 30;
        }
        else if
        (month == 1 || month == 3 || month == 5 || month == 7 || month==8 || month == 10 || month == 12)
        {
            dmax = 31;
        }
        else if (month == 2)
        {
            dmax = flag;
        }

        if (year >= 0 && (month >= 1 && month <=12) && day >= 1 && day <= flag)
        {
            System.out.println("true");
        }
else {
    System.out.println("false");
        }



    } // main

    } // class
