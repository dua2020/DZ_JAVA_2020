/* Задача 7.4:
Ввести с клавиатуры дату в формате "2013-08-18"
Вывести на экран введенную дату в виде "AUG 18, 2013".
Воспользоваться объектом Date и SimpleDateFormat. */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String patternInput = "yyyy-MM-dd";
        String patternOutput = "MMM dd, YYYY";
        System.out.print("Введите дату в формате: YYYY-MM-DD, например 2020-05-11 : ");
        BufferedReader inputDate = new BufferedReader(new InputStreamReader(System.in));
        // Date date = new Date(reader.readLine());
        SimpleDateFormat sdf = new SimpleDateFormat (patternInput);
        Date date = sdf.parse(inputDate.readLine());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(patternOutput, Locale.ENGLISH);
        System.out.println(simpleDateFormat.format(date).toUpperCase());
    }
}
