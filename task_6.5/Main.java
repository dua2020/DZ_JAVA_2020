/* Задача 6.5:
Написать пять методов, которые вызывают друг друга.
Каждый метод должен возвращать имя метода, вызвавшего его,
полученное с помощью StackTrace. */
// Класс Thread https://metanit.com/java/tutorial/8.1.php

public class Main {
    public static void main(String[] args) throws Exception {
        method1();
        System.out.println ("В Java функциональность отдельного " +
                            "потока заключается в классе Thread.");
    }

    public static String method1() {
        method2();
        //напишите тут ваш код
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        return elements[0].getMethodName();
    }

    public static String method2() {
        method3();
        //напишите тут ваш код
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        return elements[1].getMethodName();
    }

    public static String method3() {
        method4();
        //напишите тут ваш код
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        return elements[2].getMethodName();
    }

    public static String method4() {
        method5();
        //напишите тут ваш код
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        return elements[3].getMethodName();
    }

    public static String method5() {
        //напишите тут ваш код
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        return elements[4].getMethodName();
    }
}
