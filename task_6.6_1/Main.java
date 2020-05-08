/* Задача 6.6:
Перехватить исключение, возникающее при выполнении кода:
int a = 42 / 0;
Вывести на экран тип перехваченного исключения.*/

public class Main {
    public static void main(String[] args) {
        //напишите тут ваш код
        try {
            int a = 42 / 0;
        } catch (ArithmeticException err) {
            System.out.println ("Делить на ноль нельзя !!!");
            //  err.printStackTrace();
        }
        //напишите тут ваш код
    }
}
