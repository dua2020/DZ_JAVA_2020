public class Main {
    public static void main(String[] args)
    {
    /*
    Задание 3,1: Дан массив с числами. Проверьте,
    что в этом массиве есть число 5.
    Если есть - выведите 'да', а если нет - выведите 'нет'.
     */
        int[] iGoodArray = {3,5,7,5};
        int [] iNotGoodArray = {64,45,77,99,890};
        int iSeach = 5;
        int iRezult = 0;
        for (int i=0; i < (iGoodArray.length); i++)
        {
            if (iGoodArray[i] == iSeach)
                {
                 iRezult++;
                /* break; */
                 } else {
                        /* пусто */
                        }
        }
        if (iRezult > 0)
            System.out.println(" Да, в массиве есть число: " + iSeach+" в кол-ве: "+iRezult+" шт.");
        else System.out.println(" Нет, в массиве нет числа: " + iSeach);
        iRezult = 0;
        for (int j=0; j < (iNotGoodArray.length); j++)
        {
            if (iNotGoodArray[j] == iSeach)
            {
                iRezult++;
                /* break; */
            } else {
                /* пусто */
            }
        }
        if (iRezult > 0)
            System.out.println(" Да, в массиве есть число: " + iSeach+" в кол-ве: "+iRezult+" шт.");
        else System.out.println(" Нет, в массиве нет числа: " + iSeach);
    }
                }
