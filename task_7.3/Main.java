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
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        if (calendar.get(Calendar.YEAR) >= 1918)
           System.out.println("Дата Православной Пасхи по новому стилю: "+getEaster(date));
        else System.out.println("Дата Православной Пасхи по старому стилю: "+getEaster(date));
    }
    public static LocalDate getEaster(Date date) {
        // определите тип данных самостоятельно
        // Пишите код!
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        int nYear = calendar.get(Calendar.YEAR);
        LocalDate dateOut = LocalDate.of(nYear, 1, 1);
        // System.out.println(nYear);
        int dayEaster = 0;
        int ostDiv19 = nYear % 19;
        int ostDiv4 = nYear % 4;
        int ostDiv7 = nYear % 7;
        int step4 = (19*ostDiv19 + 15) % 30;
        int step5 = (2*ostDiv4 + 4*ostDiv7 + 6*step4 + 6) % 7;
        int step6sum = step4 + step5;
        if (nYear < 1918) // по старому стилю:
        {
            if (step6sum <= 9) {
                dayEaster = 22 + step6sum;
                dateOut = LocalDate.of(nYear, 3, dayEaster);
            }
            else {
                dayEaster = step6sum - 9;
                dateOut = LocalDate.of(nYear, 4, dayEaster);
            }
        }
        else  // по новому стилю:
        {
            if (step6sum <= 26) {
                dayEaster = 4 + step6sum;
                dateOut = LocalDate.of(nYear, 4, dayEaster);
            }
            else {
                dayEaster = step6sum - 26;
                dateOut = LocalDate.of(nYear, 5, dayEaster);
            }
        }
        return (dateOut);
    }
}
