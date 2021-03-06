/* Задача: 5.5
Создай класс Human с полями имя(String), пол(boolean), возраст(int),
отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось:
 Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
*
* Примечание:
* Если написать свой метод String toString() в классе Human, то именно
он будет использоваться при выводе объекта на экран.
*
* Пример вывода:
* Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
* Имя: Катя, пол: женский, возраст: 55
* Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
...*/
/* public */ class Main
{
    public static void main(String[] args)
    {
        // напишите тут ваш код
        Human ded1 = new Human("Алексей", true, 80, null, null);
        Human ded2 = new Human("Игорь", true, 84, null, null);
        Human babushka1 = new Human("Валентина", false, 78, null, null);
        Human babushka2 = new Human("Лидия", false, 83, null, null);

        Human Papa = new Human("Юрий", true, 55, ded1, babushka1);
        Human Mama = new Human("Лариса", false, 56, ded2, babushka2);

        Human Baby1 = new Human("Алена", false, 32, Papa, Mama);
        Human Baby2 = new Human("Андрей", true, 34, Papa, Mama);
        Human Baby3 = new Human("Дмитрий", true, 30, Papa, Mama);

        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(babushka1);
        System.out.println(babushka2);

        System.out.println(Papa);
        System.out.println(Mama);

        System.out.println(Baby1);
        System.out.println(Baby2);
        System.out.println(Baby3);
    }
}
    public /* static */ class Human
    {
        // напишите тут ваш код
        String name;
        Boolean sex;
        int age;
        Human father;
        Human mother;
        /* public Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
        } */
        public Human(String name, boolean sex, int age,
                     Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
         public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;
            if (this.father != null) {
                text += ", Отец: " + this.father.name;
            }
            if (this.mother != null) {
                text += ", Мать: " + this.mother.name;
            }
            return text;
        }
    }
