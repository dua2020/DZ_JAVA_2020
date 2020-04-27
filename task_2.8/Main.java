public class Main
{
    /*
    Задание 2.8: С помощью цикла for
    сформируйте строку '123456789' и запишите ее в переменную str
     */
    public static void main(String[] args)
    { String sStroka = "";
        for (int i=1; i<10; i++)
        {   sStroka = sStroka + i;
        }
    System.out.println(sStroka);
    }
}
