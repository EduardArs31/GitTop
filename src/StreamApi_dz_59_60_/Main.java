package StreamApi_dz_59_60_;


import java.util.List;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        library.addBook(new Book(1, "Белая гвардия", "Михаил Булгаков", true));
        library.addBook(new Book(2, "Руслан и Людмила", "Александр Пушкин", false));
        library.addBook(new Book(3, "Идиот", "Фёдор Достоевский", true));
        library.addBook(new Book(4, "Война и мир", "Лев Толстой ", false));
        library.addBook(new Book(5, "Hезнакомка", "Александр Блок ", true));

        System.out.println("Все книги в библиотеке:");
        library.printBooks();

        System.out.println("-----------------------------------------------------------------------");

        Book book = library.getBook(3);
        System.out.println("Книга добавленная по id : " + book);

        System.out.println("-----------------------------------------------------------------------");

        List<Book> sortedBooksList = library.getBooks();
        System.out.println("Книги, отсортированные по названию:");
        sortedBooksList.forEach(System.out::println);

        System.out.println("-----------------------------------------------------------------------");

        List<Book> availableBooksList = library.getBooks(true);
        System.out.println("Доступные книги, отсортированные по названию:");
        availableBooksList.forEach(System.out::println);

        System.out.println("-----------------------------------------------------------------------");

        long countBooks = library.getCountBooks();
        System.out.println("Общее количество книг: " + countBooks);

        System.out.println("-----------------------------------------------------------------------");

        long availableBooksCount = library.getBooksCount(true);
        System.out.println("Количество доступных книг: " + availableBooksCount);
        System.out.println("-----------------------------------------------------------------------");
        long availableBooksCount2 = library.getBooksCount(false);
        System.out.println("Количество не доступных книг: " + availableBooksCount2);

        System.out.println("-----------------------------------------------------------------------");

        List<String> authorsList = library.getAuthors();
        System.out.println("Авторы, отсортированные по алфавиту:");
        authorsList.forEach(System.out::println);
    }
}
