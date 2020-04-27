import java.util.Scanner;
public class Main {
    /*
    Задание 1.8
    Запросить у пользователя число(температуру в цельсиях) и записать
    его в переменную.
    Программа должна переводить температуру и возвращать значение
    в градусах Фаренгейта.
    Температура по Цельсию TC и температура по Фаренгейту TF
    связаны следующим соотношением:
    TF = (9 / 5) * TC + 32
    Например: для числа 41 результат будет 105.8
     */
    public static void main(String[] args) {
        System.out.println (" Введите Т в Цельсиях: ");
        Scanner T_C = new Scanner(System.in);
        int input_T_C = T_C.nextInt();
        double Const1 = (9.0/5.0);
        double Const2add = 32.0;
        double T_F = 0.0;
        T_F = Const1 * input_T_C + Const2add;
        System.out.println(" Т по Фаренгейту: "+T_F);
    }
}
