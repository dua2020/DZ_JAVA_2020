/* Задача 7.2:
Программа вводит с клавиатуры имя месяца и выводит его номер
на экран в виде: "May is the 5 month".
Используйте коллекции.
(Придётся погуглить коллекции)
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
Номер месяца
*/

public class Main {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> monthName = new HashMap<>();
        monthName.put("January", 1);
        monthName.put("February", 2);
        monthName.put("March", 3);
        monthName.put("April", 4);
        monthName.put("May", 5);
        monthName.put("June", 6);
        monthName.put("July", 7);
        monthName.put("August", 8);
        monthName.put("September", 9);
        monthName.put("October", 10);
        monthName.put("November", 11);
        monthName.put("December", 12);
        System.out.print("Введите имя месяца, например May (Май): ");
        String inputMonth = reader.readLine();
        for (Map.Entry<String, Integer> pair : monthName.entrySet()) {
            String keyNumMonth = pair.getKey();
            Integer value = pair.getValue();
            if (keyNumMonth.equals(inputMonth)) {
                System.out.println(keyNumMonth + " is the " + value + " month");
            }
        }
    }
}
