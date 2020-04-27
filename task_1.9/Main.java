import java.util.Scanner;
public class Main {
    /*
    Задание 1.9
    Запросить у пользователя 2 числа (сохранить их в разные переменные)
    Вывести на экран максимальное из двух чисел, если числа равны,
    вывести их сумму.
     */
    public static void main(String[] args) {
        System.out.println (" Введите первое число : ");
        Scanner intPerem1 = new Scanner(System.in);
        int input_Perem1 = intPerem1.nextInt();
        System.out.println (" Введите второе число : ");
        Scanner intPerem2 = new Scanner(System.in);
        int input_Perem2 = intPerem1.nextInt();
        if (input_Perem1 > input_Perem2) System.out.println(" Максимальное число: "+ input_Perem1);
        else
        if (input_Perem1 == input_Perem2)
            System.out.println(" Сумма двух чисел: "+ (input_Perem1 + input_Perem2));
        else System.out.println(" Максимальное число: "+ input_Perem2);

    }
}
