/* Задача 6.3:
1. Создайте public static класс MarkTwainBook, который наследуется
    от Book. Имя автора [Mark Twain].
    Параметр конструктора - название книги (title).
2. В классе MarkTwainBook реализуйте все абстрактные методы.
3. Для метода getBook измените тип возвращаемого значения на более
    подходящий.
4. Создайте по аналогии AgathaChristieBook. Имя автора [Agatha Christie].
5. В классе Book реализуйте тело метода getOutputByBookType так,
    чтобы он возвращал:
    5.1. agathaChristieOutput для книг Агаты Кристи;
    5.2. markTwainOutput для книг Марка Твена. */

public class Main {
    public static void main(String[] args) {
        /* Book books = Book(); */
        Book book1 = new MarkTwainBook("Tom Sawyer");
        System.out.println(book1);
        Book book2 = new AgathaChristieBook("Hercule Poirot");
        System.out.println(book2);
    }
abstract static class Book {
    private String author;

    public Book(String author) {
        this.author = author;
    }

    public abstract Book getBook();

    public abstract String getTitle();

    private String getOutputByBookType() {
        String agathaChristieOutput = author + ": " + getBook().getTitle() + " is a detective";
        String markTwainOutput = getBook().getTitle() + " was written by " + author;
        String output = "output";
        //Add your code here
        if ("Mark Twain".equals(author))
            output = markTwainOutput;
        else if ("Agatha Christie".equals(author))
            output = agathaChristieOutput;
        return output;
    }

    public String toString() {
        return getOutputByBookType();
    }
}

public static class MarkTwainBook extends Book {
    String title;

    public MarkTwainBook(String title) {
        super("Mark Twain");
        this.title = title;
    }
    @Override
    public MarkTwainBook getBook() {
        return this;
    }
    @Override
    public String getTitle() {
        return title;
    }
}

public static class AgathaChristieBook extends Book {
    String title;

    public AgathaChristieBook(String title) {
        super("Agatha Christie");
        this.title = title;
    }
    @Override
    public AgathaChristieBook getBook() {
        return this;
    }
    @Override
    public String getTitle() {
        return title;
    }
  }
}
