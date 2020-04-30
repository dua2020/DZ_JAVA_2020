public class Cat {
    private /* static /* !!! */ String name = "безымянный кот";
    public void setName(String name) {
        //напишите тут ваш код
        this.name = name;
        // System.out.println(this.name);
        // System.out.println(name);
    }
    /* Задача 5.1: Помогите коту обрести имя с помощью метода setName. */
    public static void main(String[] args)
    {
        // String name = "Мурка";
        Cat cat = new Cat();
        cat.setName("Жужик");
        System.out.println(cat.name);
        cat.setName("Мурка");
        System.out.println(" или ");
        System.out.println(cat.name);
    }
}
