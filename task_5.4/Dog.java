/* Задача 5.4:
    Создать class Dog. У собаки должна быть кличка String name и возраст int age.
 * Создайте геттеры и сеттеры для всех переменных класса Dog.
 * Создайте объект Dog*/
  /* public */ class Main {
    public static void main(String[] args) {
        //напишите тут ваш код
    Dog DogBob = new Dog("Бобик", 7);
    /* DogBob.name = "Bobik";
    DogBob.age = 5; */
    System.out.println(DogBob.getName() + " возраст " + DogBob.getAge()+" лет");
    DogBob.setName("Трезор");
    DogBob.setAge(9);
    System.out.println(DogBob.getName() + " возраст " + DogBob.getAge()+" лет");
    }
}
/* public */ class Dog
{
    //напишите тут ваш код
    private String name = "бездомный пес";
    private int age = 1;

    public /* void */ Dog(String name, int age)
        {
            //напишите тут ваш код
            this.name = name;
            this.age = age;
        }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (this.age > 50) this.age = 50; // собаки так долго не живут !!!
        else this.age = age;
    }
}

