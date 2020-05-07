/* Задача 6.7:
Перехватить исключение (и вывести его на экран), указав его тип,
возникающее при выполнении кода:

String s = null;

String m = s.toLowerCase(); */

public class Main {

    public static void main(String[] args) {
//напишите тут ваш код
    try {
        String s = null;
        String m = s.toLowerCase();
    }   catch(NullPointerException expt) {
//напишите тут ваш код
    expt.printStackTrace();
    System.out.println ("Использование пустой ссылки запрещено !!!");}
    }
}
