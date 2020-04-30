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
     /* Задача 5.3: /*Реализовать метод boolean fight(Cat anotherCat):

     * реализовать механизм драки котов в зависимости от их веса, возраста и силы.

     * Нужно сравнить каждый критерий по отдельности, и победителем будет тот, у которого больше "победивших" критериев.

     * Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.

     * Если ничья и никто не выиграл, возвращаем либо true либо false, но должно выполняться условие:

     * если cat1.fight(cat2) возвращает true,

     * то cat2.fight(cat1) должен возвращать false. */

    public boolean fight (Cat anotherCat)
    {
        int RangAnotherCat1 = 0;
        int RangAnotherCat2 = 0;

        if (this.weight > anotherCat.weight)
            RangAnotherCat2++;
        else
            RangAnotherCat1++;

        if (this.age > anotherCat.age)
            RangAnotherCat2++;
        else
            RangAnotherCat1++;

        if (this.strength > anotherCat.strength)
            RangAnotherCat2++;
        else
            RangAnotherCat1++;

        if (RangAnotherCat2 > RangAnotherCat1)
            return(true);
        else
            return(false);
    }

    public static void main(String[] args)
    {
        Cat cat = new Cat ();
        Cat anotherCat = new Cat ();
        cat.Cat("Мурка", 10, 3, 50);
        anotherCat.Cat("Машка", 8, 5, 70);
        System.out.println(cat.name+" лет: "+cat.age+" вес: "+
                cat.weight+" силы: "+cat.strength);
        System.out.println(anotherCat.name+" лет: "+anotherCat.age+" вес: "+
                anotherCat.weight+" силы: "+anotherCat.strength);
        if (cat.fight(anotherCat))
            System.out.println(cat.name+" сильнее "+anotherCat.name);
        else
            System.out.println(anotherCat.name+" сильнее "+cat.name);
    }
}
