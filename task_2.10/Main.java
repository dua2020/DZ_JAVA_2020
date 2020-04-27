import java.util.Scanner;
public class Main
{
    /*
    Задание 2.10: Назовем «весом числа» сумму его цифр.
    Напишите код, который принимает от пользователя число
    и выводит на экран его «вес».
    */
    public static void main(String[] args)
    {
        System.out.print (" Пожалуйста, введите число : ");
        Scanner iChislo = new Scanner(System.in);
        int inputChislo = iChislo.nextInt();
        String sChislo = Integer.toString(inputChislo);
        int lChislo = sChislo.length();
        int wChislo = 0;
        char[] strToMassive = sChislo.toCharArray();
     /*   System.out.println(sChislo);
          System.out.println(lChislo);
       */
        for(int i = 0; i < strToMassive.length; i++)
        {
            wChislo = wChislo + Character.getNumericValue(strToMassive[i]);
        }
        System.out.print("Вес числа "+inputChislo+" составляет: "+ wChislo);
     }
}
