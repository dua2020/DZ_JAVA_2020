/* Задача 8.3:
Перед решением прочтите https://www.codeflow.site/ru/article/java-buffered-reader
https://metanit.com/java/tutorial/5.8.php
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи
Лондон
Пример вывода:
Абрамовичи */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.util.ArrayList;
import java.util.HashMap;
// import java.util.List;
import java.util.Map;

/*
Модернизация ПО
*/

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //  ввод с клавиатуры

        Map<String, String> map = new HashMap<String, String>(); //список город + фамилия в коллекцию
        // List<String> list = new ArrayList<>();

        while (true)
        {
            String сity = reader.readLine();
            if (сity.isEmpty())
                break;
            else {
                String lastName = reader.readLine();
                map.put(сity, lastName);
            }
        }
   /*
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) {
                break;
            }

            list.add(family);
        } */

        // Read the house number
        // int houseNumber = Integer.parseInt(reader.readLine());

        String cityKeyboard = reader.readLine(); //считываем с клавиатуры город, для поиска фамилии
/*
        if (0 <= houseNumber && houseNumber < list.size()) {
            String familyName = list.get(houseNumber);
            System.out.println(familyName);
        } */
        
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            if (pair.getKey().equals(cityKeyboard)) // сравнивать String через  equals!!!
                System.out.println(pair.getValue());
        }
    }
}
