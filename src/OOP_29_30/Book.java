package OOP_29_30;


/**
 * класс Book.
 */
public class Book {

    private String title;
    private Author author;
    private Integer year;

    /**
     * Создает пустой конструктор Book по умолчанию.
     */
    public Book() {
    }

    /**
     * Создаёт конструктор принимающий значения всех полей класса Book(3 параметра для книги)
     *
     * @param author — автор
     * @param title  — название книги
     * @param year   — год
     */
    public Book(Author author, String title, Integer year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    /**
     * @return Возвращает описания Book с помощью нового метода toString().
     */
    @Override
    public String toString() {
        return STR."Book{" +
                "author=" + author +
                ", title='" + title + '\'' +
                ", year=" + year +
                '}';
    }

    /**
     * Задает заголовок.
     *
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }


    /**
     * Устанавливает год.
     *
     * @param year the year
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Устанавливает автор.
     *
     * @param author the author
     */
    public void setAuthor(Author author) {
        this.author = author;
    }
}

