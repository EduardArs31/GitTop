package OOP_29_30;

/**
 * класс Main.
 */
public class Main {
    /**
     * Точка входа для подачи заявки на вывод.
     *
     * @param args входные аргументы
     */
    public static void main(String[] args) {
        Author author1 = new Author("Михаил", "Булгаков");
        Book book1 = new Book(author1, "Белая гвардия", 1923);

        Author author2 = new Author("Александр", "Пушкин");
        Book book2 = new Book(author2, "Руслан и Людмила", 1822);

        Author author3 = new Author("Фёдор", "Достоевский");
        Book book3 = new Book(author3, "Идиот", 1868);

        System.out.println(author1);
        System.out.println(book1);
        System.out.println();

        System.out.println(author2);
        System.out.println(book2);
        System.out.println();

        System.out.println(author3);
        System.out.println(book3);
/**
 * С помощью сеттеров меняем название и год для book1, меняем название автора для book2.
 */
        book1.setTitle("Николка");
        book1.setYear(1918);
        System.out.println(book1);

        book2.setAuthor(new Author("Евгений", "Онегин"));
        System.out.println(book2);


    }
}

