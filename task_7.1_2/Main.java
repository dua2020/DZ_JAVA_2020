/* Задача 7.1:
1. Реализовать метод isDateOdd(String date) так,
чтобы он возвращал true, если количество дней
с начала года - нечетное число, иначе false
2. String date передается в формате FEBRUARY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false */

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;

/*
Работа с датой
*/

public class Main {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 5 2013"));
    }

    public static boolean isDateOdd(String date) {
        SimpleDateFormat format = new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH);
        Date inputDate = null;
        Date yearInputdate = null;
        try
        {
            inputDate = format.parse(date);
            yearInputdate = format.parse(date);

        } catch (Exception e) {
            e.printStackTrace();
        }
        yearInputdate.setDate(1);
        yearInputdate.setMonth(0);
        long day_ChasMinSecMsec = inputDate.getTime() - yearInputdate.getTime();
        long dayInChasMinSecMsec = 24 * 60 * 60 *1000;

        int days = (int) (day_ChasMinSecMsec/dayInChasMinSecMsec);
        System.out.println(yearInputdate.toString());
        if (days % 2 == 0)
            return false;
        else
            return true;
    }
}
