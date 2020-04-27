public class Main {
    public static void main(String[] args)
    {
    /*
    Задание 3.2: Дан массив с числами. Проверьте, есть ли в нем
    два одинаковых числа подряд.
    Если есть - выведите 'да', а если нет - выведите 'нет'.
     */
        int[] iGoodArray = {3,5,5,8,77,77,77};
        int [] iNotGoodArray = {64,45,77,99,890};
        int iSeachCount = 2;
        int iRezult = 0;
        for (int i=0; i < (iGoodArray.length); i++)
        {
            if ( (i>0) && (iGoodArray[i] == iGoodArray[i-1]))
                {
                 iRezult++;
                /* break; */
                 } else {
                        /* пусто */
                        }
        }
        if (iRezult >= (iSeachCount-1))
            System.out.println(" Да, в массиве есть два одинаковых числа подряд ");
        else System.out.println(" Нет, в массиве нет двух одинаковых чисел подряд ");
        iRezult = 0;
        for (int j=0; j < (iNotGoodArray.length); j++)
        {
            if ((j>0) && (iNotGoodArray[j] == iNotGoodArray[j-1]))
            {
                iRezult++;
                /* break; */
            } else {
                /* пусто */
            }
        }
        if (iRezult >= (iSeachCount-1))
            System.out.println(" Да, в массиве есть два одинаковых числа подряд ");
        else System.out.println(" Нет, в массиве нет двух одинаковых чисел подряд ");
    }
                }
