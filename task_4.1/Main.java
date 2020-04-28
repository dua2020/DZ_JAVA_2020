public class Main {
    public static void main(String[] args)
    {
    /*
    Задача 4.1
    Написать функцию, которая возвращает минимум из двух чисел.
     */
        // 33 888
    System.out.print("Минимальное значение: "+min_dua(33.0, 888.0));
    }
    static double min_dua(double chislo1, double chislo2) {
        if (chislo1 > chislo2) return (chislo2);
        else if (chislo1 < chislo2) return (chislo1);
        /*  если равны возвращаем первое число
        */
        else return (chislo1);
    }
                }
