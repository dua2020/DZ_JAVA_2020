/*  Задача 8.2:
1. Расставь правильно наследование между Building(здание) и School(здание школы).
   Класс School наследует себя от класса Building однозночно !
2. Подумай, объект какого класса должен возвращать методы getSchool и getBuilding.
   getSchool возвращает объект "здание школы", getBuilding - "здание"
3. Измени null на объект класса Building или School.
   класс Building изначальны. От него строятся все остальные. Он - родитель
   School - потомок */
public class Main {
    public static void main(String[] args) {
        Building school = getSchool();
        Building shop = getBuilding();
        System.out.println(school);
        System.out.println(shop);
    }
    public static Building getSchool() {
        //измените null на объект класса Building или School
        // return null;
        return new School();
    }
    public static Building getBuilding() {
        // измените null на объект класса Building или School
        // return null;
        return new Building();
    }
    static class School extends Building {
        @Override
        public String toString() {
            return "School";
        }
    }
    static class Building {
        @Override
        public String toString() {
            return "Building";
        }
    }
}
