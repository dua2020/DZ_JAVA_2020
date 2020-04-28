public class Main
    {
    public static void main(String[] args)
            /*
            Задача 4.5
            Выведи на экран таблицу умножения 10 на 10 в следующем виде:
            1 2 3 4 ...
            2 4 6 8 ...
            3 6 9 12 ...
            4 8 12 16 ...
            ...
             */
        {
        int Chislo1 = 1;
        int Chislo2 = 1;
        int Razmer1 = 10;
        int Razmer2 = 10;
        while (Chislo1 <= Razmer1)
        {while (Chislo2 <= Razmer2)
        {System.out.print(Chislo1 * Chislo2 + " "); // печать в одной строке через пробел
            Chislo2++;
        }
            Chislo2 = 1; // обнулить счетчик
            System.out.println("");
            Chislo1++;
        }
    }
}
