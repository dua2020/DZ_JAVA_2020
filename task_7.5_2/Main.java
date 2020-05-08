/* Задача 7.5:
Расставьте правильно операторы приведения типа,
чтобы получился ответ: d > 0

int a = 0;
int b = (byte) a + 46;
byte c = (byte) (a*b);
double f = (char) 1234.15;
long d = (short) (a + f / c + b); */

public class Main {
    public static void main(String[] args) {
        int a = 0;
        // System.out.println("a = " + a);
        int b = (byte) a + 46;
        // System.out.println("b = " + b);
        byte c = (byte) (a * b);
        // System.out.println("c = " + c);
        // double f = (char) 1234.15;
        // double f = (float) 1234.15;
        double f = (short) 1234.15;
        // System.out.println("f = " + f);
        // long d = (short) (a + f / c + b);
        // long d = (int) (a + f / c + b);
        long d = (char) (a + f / c + b);
        // System.out.println("f / c = " + (f / c));
        // System.out.println(d);
        // System.out.println("d > 0 : " + "d = " + d);
        System.out.println(d);
    }
}
