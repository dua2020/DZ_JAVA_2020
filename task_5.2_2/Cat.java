public class Cat {
    String name = "безымянный кот";
    int age = 1;
    int weight = 1;
    int strength = 1;

    public void Cat(String name, int age, int weight, int strength)
    {
        //напишите тут ваш код
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    /* Задача 5.2: Создать класс Cat. У кота должно быть
                имя (name, String), возраст (age, int),
                вес (weight, int), сила (strength, int).
             * Создайте объект класса Сat */
     public static void main(String[] args)
    {
        // String name = "Мурка";
        Cat cat = new Cat ();
        cat.Cat("Мурка", 10, 3, 50);
        System.out.println(cat.name+" лет: "+cat.age+" вес: "+
                cat.weight+" силы: "+cat.strength);

    }
}
