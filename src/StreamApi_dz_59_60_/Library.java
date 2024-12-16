package StreamApi_dz_59_60_;



import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Library {
    private Map<Integer, Book> books;


    /**
     * Создает экземпляр новой библиотеки .
     */
    public Library() {
        this.books = new HashMap<>();
    }

    /**
     * Метод добавляет книгу в библиотеку.
     * @param book the book
     */
    public void addBook(Book book) {
        books.put(book.getId(), book);
    }


    /**
     * Книга добавленная по id
     * @param id the id
     * @return the book
     */
    public Book getBook(int id) {
        return books.get(id);
    }


    /**
     * Все книги в библиотеке
     */
    public void printBooks() {
        books.values().forEach(System.out::println);
    }

    /**
     * Возвращает книги отсортированные по названию
     * @return the books
     */
    public List<Book> getBooks() {
        return books.values().stream()
                .sorted(Comparator.comparing(Book::getTitle))
                .collect(Collectors.toList());
    }

    /**
     * Возвращает список книг с сортировкой по названию,
     * @param available the available
     * @return the books
     */
    public List<Book> getBooks(boolean available) {
        return books.values().stream()
                .filter(book -> book.isAvailable() == available)
                .sorted(Comparator.comparing(Book::getTitle))
                .collect(Collectors.toList());
    }

    /**
     * Возвращает Общее количество книг в библиотеке.
     * @return the total books count
     */
    public long getCountBooks() {
        return books.size();
    }

    /**
     * Возвращает количество доступных или недоступных книг в библиотеке.
     * @param available the available
     * @return the books count
     */
    public long getBooksCount(boolean available) {
        return books.values().stream()
                .filter(book -> book.isAvailable() == available)
                .count();
    }

    /**
     * Получения списка авторов, без дубликатов с сортировкой по алфавиту
     * @return the authors
     */
    public List<String> getAuthors() {
        return books.values().stream()
                .map(Book::getAuthor)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
    /**
     *	Получения с помощью stream api мапы с книгами, где с помощью
     * метода collect(Collectors.partitioningBy(…)) книги разделяются по условию isAvailable – т.е.
     * список доступных книг и список недоступных книг
     */
    public Map<Boolean, List<
           Book>> partitionBooks() {
        return books.values().stream()
                .collect(Collectors.partitioningBy(Book::isAvailable));
    }

    /**
     *	Получения с помощью stream api мапы с книгами,
     * где с помощью метода collect(Collectors.groupingBy(…))
     * книги группируются по авторам – сделайте чтобы в списке было несколько книг хотя бы для одного автора
     */
    public Map<String, List<
            Book>> groupAuthor() {
        return books.values().stream()
                .collect(Collectors.groupingBy(Book::getAuthor));
    }

}
