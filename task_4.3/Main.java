public class Main {
    public static void main(String[] args)
    {
    /*
    Задача 4.3
    Написать функцию, которая возвращает минимум из четырёх чисел.
    Функция min(a,b,c,d) должна использовать (вызывать)
    функцию min(a,b) (которую вы разработали в задаче 4.1).
     */
     // 33 35 65 88
     System.out.print("Минимальное значение из 4-х чисел: "+min_dua_4(33.0, 35.0, 65.0,88.0));
    }
    static double min_dua_2(double chislo1, double chislo2)
    {
        if (chislo1 > chislo2) return (chislo2);
        else if (chislo1 < chislo2) return (chislo1);
            /*  если равны возвращаем первое число
             */
        else return (chislo1);
    }
    static double min_dua_4(double chislo_1, double chislo_2, double chislo_3, double chislo_4)
    {
        if ((min_dua_2(chislo_1, chislo_2)) <= min_dua_2(chislo_3, chislo_4)) return (min_dua_2(chislo_1, chislo_2));
        else return (min_dua_2(chislo_3, chislo_4));
    }
                    }
                    
