/* Задача 6.4:
    Исправь метод containsBones и всю связанную с ним логику так, чтобы:
    1. Поведение программы осталось прежним.
    2. Метод containsBones должен возвращать тип Object и значение "Yes"
        вместо true, "No" вместо false*/
import java.util.ArrayList;
import java.util.List;
/*
ООП - исправь ошибки в наследовании
*/
/* public class Main {
    public static interface LivingPart {
        boolean containsBones();
    } */
public class Main {
    // Alive - живой
    public static interface Alive {
        Object containsBones();
    }
    /*  public static class BodyPart implements LivingPart {
          private String name;
          public BodyPart(String name) {
              this.name = name;
          } */
    public static class BodyPart implements Alive {
        private String name;

        public BodyPart(String name) {
            this.name = name;
        }
        /*   public boolean containsBones() {
               return true;
           }  */
        public Object containsBones() {
            return "Yes";
        }
        /*      public String toString() {
              return containsBones() ? name + " содержит кости" : name + " не содержит кости";
          }
      }  */
      /* Метод toString в классе BodyPart возвращает
      строку вида: "name(имя части тела) содержит кости",
      если метод containsBones возвращает "Yes" для этой части тела,
      а если "No", то строку формата "name(имя части тела) не содержит
      кости".    */
        public String toString() {
            if (containsBones().equals("Yes")) {
                return name + " содержит кости"; }
            else {
                return name + " не содержит кости";
            }
        }
    }
    /* public static class Finger extends BodyPart {
         private boolean isArtificial;
         public Finger(String name, boolean isArtificial) {
             super(name);
             this.isArtificial = isArtificial;
         } */
    public static class Finger extends BodyPart {
        private boolean isArtificial;
        public Finger(String name, boolean isArtificial) {
            super(name);
            this.isArtificial = isArtificial;
        }
        /*         public boolean containsBones() {
                 return super.containsBones() && !isArtificial;
             }
         }  */
       /*
       Метод containsBones в классе Finger
       возвращает строку "Yes",
       если метод containsBones в классе BodyPart возвращает "Yes"
       и флаг isArtificial равен false,
       если приведенное условие не выполняется - вернуть "No".
        */
        public Object containsBones() {
            /*  if ((super.containsBones() == "Yes") && !isArtificial) */
            if ((super.containsBones().equals("Yes")) && !isArtificial)
               return "Yes";
            else return "No";
        }
    }
    // return super.containsBones() && !isArtificial;  !!!
    public static void main(String[] args) {
        printlnFingers();
        printlnBodyParts();
        printlnLivingParts();
    }
    private static void printlnLivingParts() {
        System.out.println(new BodyPart("Рука").containsBones());
    }
    private static void printlnBodyParts() {
        List<BodyPart> bodyParts = new ArrayList<BodyPart>(5);
        bodyParts.add(new BodyPart("Рука"));
        bodyParts.add(new BodyPart("Нога"));
        bodyParts.add(new BodyPart("Голова"));
        bodyParts.add(new BodyPart("Тело"));
        System.out.println(bodyParts.toString());
    }
    private static void printlnFingers() {
        List<Finger> fingers = new ArrayList<Finger>(5);
        fingers.add(new Finger("Большой", true));
        fingers.add(new Finger("Указательный", true));
        fingers.add(new Finger("Средний", true));
        fingers.add(new Finger("Безымянный", false));
        fingers.add(new Finger("Мизинец", true));
        System.out.println(fingers.toString());
    }
}
