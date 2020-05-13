import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.lang.String;
/* Задача 7.1:
1. Реализовать метод isDateOdd(String date) так,
чтобы он возвращал true, если количество дней
с начала года - нечетное число, иначе false
2. String date передается в формате FEBRUARY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false */

public class Main {
    public static void main(String[] args) throws DateTimeParseException
    // throws ParseException
    // DateTimeParseException
    {
        System.out.println(isDateOdd("MAY 1 2013"));
        // System.out.println(isDateOdd("JUNE 1 2013"));
        // System.out.println(isDateOdd("JANUARY 1 2000"));
        // System.out.println(isDateOdd("JANUARY 2 2020"));
        // System.out.println(isDateOdd("MAY 10 2020"));
    }
    public static boolean isDateOdd(String date) throws DateTimeParseException
    // throws ParseException
    // DateTimeParseException
    {
        // example: String input = "MAY 1 2013";
        String pattern = "MMMM d yyyy";  // !!!!!!!!
        String dateTxt = date.toString();
        /* DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        formatter = formatter.withLocale(Locale.US);
        LocalDate inputDate = LocalDate.parse(dateTxt, formatter); */
        // возникает java.time.format.DateTimeParseException:
        // Text 'MAY 1 2013' could not be parsed at index 0
        // Замена кода на:
        DateTimeFormatter formatter = new DateTimeFormatterBuilder().parseCaseInsensitive().appendPattern(pattern).toFormatter();
        formatter = formatter.withLocale(Locale.US);
        LocalDate inputDate = LocalDate.parse(dateTxt, formatter);
        System.out.println(inputDate);
        System.out.println(inputDate.getDayOfYear());
        if ((inputDate.getDayOfYear()%2)==0)
        {
            return false;
        }
        else return true;
    }
}
