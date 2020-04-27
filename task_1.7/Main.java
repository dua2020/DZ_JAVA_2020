import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
        Задание 1.7
        Запросить у пользователя число и записать его в переменную redius.
        Выведи на экран длину окружности, рассчитанную по формуле:
        L = 2 * Pi * radius.
        Результат - дробное число (тип double).
        В качестве значения Pi используй значение 3.14.
         */
        Scanner radius_in = new Scanner(System.in);
        int intRadius = radius_in.nextInt();
        double Const2 = 2.0;
        double Pi_3_14 = 3.14;
        double L_rezult = 0.0;
        L_rezult = Const2 * Pi_3_14 * intRadius;
        System.out.println(L_rezult);
    }
}
