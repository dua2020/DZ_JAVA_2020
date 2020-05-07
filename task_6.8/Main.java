/* Задача 6.8:
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
int[] m = new int[2];
m[8] = 5; */

public class Main {
    public static void main(String[] args) {
        //напишите тут ваш код
          try {
            int[] m = new int[2];
            m[8] = 5;
        } catch (ArrayIndexOutOfBoundsException expt) {
        //напишите тут ваш код
        expt.printStackTrace();
        System.out.println ("Индекс массива вне границ массива !!!"); }
        }
}
