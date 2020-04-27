import java.util.Scanner;
public class Main
{
    /*
    Задание 2,9: Напишите фрагмент кода, который принимает от пользователя число
    и если число четное то программа выводит на экран число,
    которое больше введенного с клавиатуры на 10,
    в противном случае выводит на экран число в 10 раз больше введенного.
     */
    public static void main(String[] args)
    {
        System.out.print (" Пожалуйста, введите число : ");
        Scanner iChislo = new Scanner(System.in);
        int inputChislo = iChislo.nextInt();
        if ((inputChislo%2) == 0) System.out.println("Четное: "+(inputChislo+10));
        else System.out.println(" Нечетное: "+(inputChislo*10));
    }
}
