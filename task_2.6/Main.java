import java.util.Scanner;
public class Main
{
    /*
    Задание 2.6: Запросить у пользователя ввод числа и
    сохранить это число в переменную a.
    Если переменная a равна 10,
    то выведите 'Верно', иначе выведите 'Неверно'.
     */
    public static void main(String[] args)
    {
        int iTest = 10;
        System.out.print (" Пожалуйста, введите число 10 : ");
        Scanner iChislo = new Scanner(System.in);
        int input10 = iChislo.nextInt();
        if (input10 == iTest) System.out.println(" Верно ! ");
        else System.out.println(" Неверно !!! ");
    }
}
