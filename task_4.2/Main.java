public class Main {
    public static void main(String[] args)
    {
    /*
    Задача 4.2
    Написать функцию, которая возвращает минимум из трёх чисел.
     */
        // 33 -888 9999
    System.out.print("Минимальное значение из 3-х чисел: "+min_dua_3(33.0, -888.0, 9999.0));
    }
    static double min_dua_3(double chislo1, double chislo2, double chislo3) {
        if ((chislo1 < chislo2) && (chislo1 < chislo3)) return (chislo1);
        else if ((chislo2 < chislo1) && (chislo2 < chislo3)) return (chislo2);
        else if ((chislo3 < chislo1) && (chislo3 < chislo2)) return (chislo3);
        else if ((chislo1 == chislo2) && (chislo1 < chislo3)) return (chislo1);
        else if ((chislo2 == chislo3) && (chislo2 < chislo1)) return (chislo2);
        else if ((chislo3 == chislo1) && (chislo3 < chislo2)) return (chislo1);
        else if ((chislo1 == chislo2) && (chislo2 == chislo3)) return (chislo3);
        else return (0.0);
    }
                    }
                    
