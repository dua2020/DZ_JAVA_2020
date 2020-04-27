import java.util.Scanner;
public class Main
{
    /*
    Задание 2.11: В переменной min лежит число от 0 до 59.
    Определите в какую четверть часа попадает это число
    (в первую, вторую, третью или четвертую).
     */
    public static void main(String[] args)
    {
        System.out.print (" Пожалуйста, введите число от 0 до 59 : ");
        Scanner iChislo = new Scanner(System.in);
        int inputChislo = iChislo.nextInt();

        if (((inputChislo) >= 0) && ((inputChislo) <=15) )
            System.out.println("Первая четверть: "+inputChislo);
        else if (((inputChislo) > 15) && ((inputChislo) <=30))
                System.out.println("Вторая четверть: "+inputChislo);
        else if (((inputChislo) > 30) && ((inputChislo) <=45))
                System.out.println("Третья четверть: "+inputChislo);
        else if (((inputChislo) > 45) && ((inputChislo) <=59))
            System.out.println("Четвертая четверть: "+inputChislo);
            else System.out.println(" Введено неверное число: "+inputChislo);
    }
}
