/* Задача 8.1:
   Введи с клавиатуры 20 слов и выведи их в алфавитном порядке.
   Каждое слово - с новой строки.
   Задача по алгоритмам */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws Exception
    {
        System.out.println("Введи с клавиатуры 20 слов:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++)
        {
          array[i] = reader.readLine();
        }
        sort(array);
        for (String word : array) {
            System.out.println(word);
        }
    }
    public static void sort(String[] array)
    {
        //напишите тут ваш код
        String strWord = null;
        //Сравниваем значения массива и сортируем их по функции isGreaterThen
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array.length; j++)
            {
                if (isGreaterThan(array[j], array[i]))
                {
                    strWord = array[i];
                    array[i] = array[j];
                    array[j] = strWord;
                }
            }
        }
    }
    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
