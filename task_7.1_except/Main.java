import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.lang.String;
import java.text.SimpleDateFormat;
/* Задача 7.1:
1. Реализовать метод isDateOdd(String date) так,
чтобы он возвращал true, если количество дней
с начала года - нечетное число, иначе false
2. String date передается в формате FEBRUARY 1 2013
Не забудьте учесть"C:\Program Files\Java\jdk-14.0.1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.1\lib\idea_rt.jar=64107:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\Лариса\IdeaProjects\Hello\out\production\Hello;C:\Users\Лариса\AppData\Roaming\JetBrains\IdeaIC2020.1\plugins\Kotlin\kotlinc\lib\kotlin-stdlib.jar;C:\Users\Лариса\AppData\Roaming\JetBrains\IdeaIC2020.1\plugins\Kotlin\kotlinc\lib\kotlin-reflect.jar;C:\Users\Лариса\AppData\Roaming\JetBrains\IdeaIC2020.1\plugins\Kotlin\kotlinc\lib\kotlin-test.jar;C:\Users\Лариса\AppData\Roaming\JetBrains\IdeaIC2020.1\plugins\Kotlin\kotlinc\lib\kotlin-stdlib-jdk7.jar;C:\Users\Лариса\AppData\Roaming\JetBrains\IdeaIC2020.1\plugins\Kotlin\kotlinc\lib\kotlin-stdlib-jdk8.jar Main
Exception in thread "main" java.time.format.DateTimeParseException: Text 'MAY 1 2013' could not be parsed at index 0
	at java.base/java.time.format.DateTimeFormatter.parseResolved0(DateTimeFormatter.java:2050)
	at java.base/java.time.format.DateTimeFormatter.parse(DateTimeFormatter.java:1952)
	at java.base/java.time.LocalDate.parse(LocalDate.java:429)
	at Main.isDateOdd(Main.java:40)
	at Main.main(Main.java:26)

Process finished with exit code 1 первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false */

public class Main {
    public static void main(String[] args) throws DateTimeParseException
            // throws ParseException
            // DateTimeParseException
    {
         System.out.println(isDateOdd("MAY 1 2013"));
        // System.out.println(isDateOdd("JANUARY 1 2000"));
        // System.out.println(isDateOdd("JANUARY 2 2020"));
        // System.out.println(isDateOdd("MAY 10 2020"));
    }

    public static boolean isDateOdd(String date) throws DateTimeParseException
            // throws ParseException
    // DateTimeParseException
    {
        // example: String input = "MAY 1 2013";
        String pattern = "MMM d yyyy";
        String dateTxt = date.toString();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern, Locale.US);
        LocalDate inputDate = LocalDate.parse(dateTxt, formatter);
        System.out.println(inputDate);
        // Date yearStart = new Date(inputDate.getYear(), 0, 0);
        Calendar calendar = new GregorianCalendar();
        int yearBegin = calendar.get(Calendar.YEAR);
        System.out.println(yearBegin);
        LocalDate yearStart = LocalDate.of(yearBegin, 1, 1);
        System.out.println(yearStart);
        System.out.println(yearStart.getDayOfYear());
        System.out.println(inputDate);
        int dayCounter = inputDate.getDayOfYear() - yearStart.getDayOfYear() +1;
        System.out.println(dayCounter);
        if ((dayCounter % 2) == 1)
        {
            return true;
        }
        else return false;
        }
}
