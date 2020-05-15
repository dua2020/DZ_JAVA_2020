/* Задача 8.4:
    Исправь 4 ошибки в программе, чтобы она компилировалась.
    Требования:
•	Переменные объявленные в интерфейсе могут иметь только самый широкий
    уровень доступа(public).
•	Унаследоваться(extends) можно только от класса, для реализации
    интерфейсов используется ключевое слово implements.
•	Класс Hobby должен быть объявлен с модификатором доступа static.
•	Для доступа к переменной HOBBY нет необходимости создавать объект Dream.
•	Объявления интерфейсов не изменять.
*/
public class Main {
    public static void main(String[] args) {
        // err 01 System.out.println(new Dream().HOBBY.toString());
        System.out.println(Dream.HOBBY.toString());
        System.out.println(new Hobby().toString());
    }
    interface Desire {
    }
    interface Dream {
        // err 02 private  !!!
        static Hobby HOBBY = new Hobby();
    }
//  err 03 static  !!!
// err 04   static class Hobby extends Desire implements Dream {
        static class Hobby implements Desire, Dream {
        static int INDEX = 1;
        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }
}
