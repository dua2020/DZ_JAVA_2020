/* Задача 7.1:
1. Реализовать метод isDateOdd(String date) так,
чтобы он возвращал true, если количество дней
с начала года - нечетное число, иначе false
2. String date передается в формате FEBRUARY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false */
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.lang.String;
public class Main {
    public static void main(String[] args) throws DateTimeParseException
    {
        System.out.println(isDateOdd("MAY 1 2013"));
        // System.out.println(isDateOdd("JANUARY 1 2000"));
        // System.out.println(isDateOdd("JANUARY 2 2020"));
        // System.out.println(isDateOdd("MAY 10 2020"));
    }

    public static boolean isDateOdd(String date) throws DateTimeParseException
    {
      DateTimeFormatter formatter= new DateTimeFormatterBuilder().parseCaseInsensitive().appendPattern("MMMM d yyyy").toFormatter();
      formatter = formatter.withLocale(Locale.ENGLISH);
      LocalDate localDate = LocalDate.parse(date, formatter);
      if((localDate.getDayOfYear()%2)==0){
          return false;
      }else{
          return true;
      }
    }
}
