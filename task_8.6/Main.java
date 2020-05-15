/* Задача 8.6:
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
-2
11
3
-5
2
10
Пример вывода:
-2
2
8
10
*/
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        // считываем с консоли
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // читаем из файла
        reader = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));
        // коллекция чисел, считанных из файла
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        // преобразуем в int, отбрасываем шелуху и проверяем: четный или нечетное
        while (reader.ready()) {
            int num = Integer.parseInt(reader.readLine().trim());
            if (num % 2 == 0) {
                numbers.add(num);
            }
        }
        // Закрываем поток чтения
        reader.close();
        // Сортируем коллекцию чисел
        Collections.sort(numbers);
        // вывод в консоль четных чисел по возрастанию, как просили
        for (int i : numbers) {
            System.out.println(i);
        }
    }
}
