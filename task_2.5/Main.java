import java.util.Scanner;
public class Main
{
    /*
    Задание 2.5: Пользователь вводит сумму вклада и процент,
    который будет начисляться ежегодно. Отобразить размер вклада
    поочередно на ближайшие 5 лет.
     */
    public static void main(String[] args)
    {
        System.out.print (" Введите сумму вклада в руб. : ");
        Scanner SumAccount = new Scanner(System.in);
        int inputSumAccount = SumAccount.nextInt();

        System.out.print (" Процент по вкладу : ");
        Scanner SumProtsent = new Scanner(System.in);
        int inputSumProtsent = SumAccount.nextInt();

        System.out.print(" Сумма вклада в рублях: "+inputSumAccount+" руб.");
        System.out.println(" Процент по вкладу: "+inputSumProtsent+" %");

        double IBenefits [];
        IBenefits = new double[5+1];
        IBenefits [0] = inputSumAccount;

        for (int i=1; i < (IBenefits.length); i++)
        { IBenefits [i] =IBenefits [i-1] + (IBenefits [i-1]*inputSumProtsent/100);
          System.out.println(" Размер вклада "+ i +"-й год "+IBenefits [i]+" рублей");
        }
    }
}
