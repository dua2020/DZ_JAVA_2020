import java.util.Scanner;
public class Main
{
    /*
    Задача 4.6 (EPIC LVL) И задача для того,
    кто решил что он здесь самый умный (т.е. для всех)

    Ввести с клавиатуры год, определить количество дней в году.
    Результат вывести на экран в следующем виде:
    количество дней в году: x
    , где
    х - 366 для високосного года,
    х - 365 для обычного года.

    Подсказка:
    В високосном году - 366 дней, тогда как в обычном - 365.
    1) если год делится без остатка на 400 это високосный год;
    2) в оставшихся годах после этого, если год делится без остатка на 100,
    то это обычный год;
    3) в оставшихся годах после этого, если год делится без остатка на 4,
    то это високосный год;
    4) все оставшиеся года невисокосные.
    Так, годы 1700, 1800 и 1900 не являются високосными,
    так как они кратны 100 и не кратны 400.
    Годы 1600 и 2000 - високосные, так как они кратны 100 и кратны 400.
    Годы 2100, 2200 и 2300 - не високосные.
     */
    public static void main(String[] args)
    {
        System.out.print (" Пожалуйста, введите номер года: ");
        Scanner iYear = new Scanner(System.in);
        int inputYear = iYear.nextInt();
        if ((inputYear % 100==0) && (inputYear %400 ==0) )
            System.out.println("Количество дней в году: 366");
        else if ((inputYear % 4 == 0) && (inputYear % 100 > 0))
            System.out.println("Количество дней в году: 366");
        else if (inputYear % 100 == 0)
            System.out.println("Количество дней в году: 365");
        else
            System.out.println("Количество дней в году: 365");
    }
}
