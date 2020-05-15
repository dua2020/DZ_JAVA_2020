/* Задача 8.5:
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку
    с новой строки.
    Требования:
•	Программа должна считывать c консоли имя файла.
•	Создай и используй объект типа BufferedWriter.
•	Программа не должна ничего читать из файловой системы.
•	Программа должна считывать строки с консоли, пока пользователь
    не введет строку "exit".
•	Программа должна записать абсолютно все введенные строки (включая "exit")
    в файл, каждую строчку с новой строки.
•	Метод main должен закрывать объект типа BufferedWriter
    после использования.
•	Метод main не должен выводить данные на экран.
*/
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // String fileName = reader.readLine();
        // BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        BufferedWriter writer = new BufferedWriter(new FileWriter(reader.readLine()));
        try {
            while (true)
                {
                String forWrite = reader.readLine();
                if (forWrite.equals("exit"))
                    {
                    writer.write(forWrite+"\n");
                    break;
                    }
                else {
                    writer.write(forWrite+"\n");
                    }
                }
            reader.close();
            writer.close();
        } catch (FileNotFoundException e)// напишите тут ваш код
        {
          e.printStackTrace();
        }
    }
}
