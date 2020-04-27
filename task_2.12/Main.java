import java.util.Scanner;
public class Main
{
    /*
    Задание 2,12: Даны переменные a и b.
    Проверьте, что a делится без остатка на b.
    Если это так - выведите 'Делится' и результат деления,
    иначе выведите 'Делится с остатком' и остаток от деления.
     */
    public static void main(String[] args)
    {
        System.out.print (" Пожалуйста, введите первое число : ");
        Scanner iChislo1 = new Scanner(System.in);
        int inputChislo1 = iChislo1.nextInt();
        System.out.print (" Пожалуйста, введите первое число : ");
        Scanner iChislo2 = new Scanner(System.in);
        int inputChislo2 = iChislo2.nextInt();
        if ((inputChislo1%inputChislo2) == 0) System.out.println("Делится нацело: "+(inputChislo1/inputChislo2));
        else System.out.println(" Делится с остатком : "+(inputChislo1%inputChislo2));
    }
}
