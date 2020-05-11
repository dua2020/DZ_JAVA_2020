/* Задача 7.3:
Разработать метод который возвращает дату пасхи.
Передаём в качестве параметра год.
Метод возвращает дату пасхи в этом году.
Подсказка: воспользуйтесь алгоритмом Гаусса
вычисления даты Пасхи по ссылке:
http://poivs.tsput.ru/ru/Math/NumberTheory/General/NumberTheoreticAlgorithms/GaussAlgorithmForCalculatingTheDateOfEaster
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) throws Exception {
        String patternInput = "yyyy";
        System.out.print("Введите год в формате: YYYY, например 2020 : ");
        BufferedReader inputDate = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat sdf = new SimpleDateFormat(patternInput);
        Date date = sdf.parse(inputDate.readLine());
        System.out.println("Дата Православной Пасхи по новому стилю: "+getEaster(date));
    }
    public static LocalDate getEaster(Date date) {
        // определите тип данных самостоятельно
        // Пишите код!
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        int nYear = calendar.get(Calendar.YEAR);
        // System.out.println(nYear);
        int dayEaster = 0;
        int ostDiv19 = nYear % 19;
        int ostDiv4 = nYear % 4;
        int ostDiv7 = nYear % 7;
        int step4 = (19*ostDiv19 + 15) % 30;
        int step5 = (2*ostDiv4 + 4*ostDiv7 + 6*step4 + 6) % 7;
        int step6sum = step4 + step5;
        if (step6sum <= 9)
        {dayEaster = 22 + step6sum;
            LocalDate dateOut = LocalDate.of(nYear, 3, dayEaster);
            dateOut = dateOut.plusDays(13); // новый стиль
            return (dateOut);}
        else
        {dayEaster = step6sum - 9;
            LocalDate dateOut = LocalDate.of(nYear, 4, dayEaster);
            dateOut = dateOut.plusDays(13); // новый стиль
            return (dateOut);}
    }
}
