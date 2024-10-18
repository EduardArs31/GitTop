package OOP_29_30;


/**
 * класс Author.
 */
public class Author {
    private String name;
    private String surname;

    /**
     * Создает пустой конструктор Author по умолчанию.
     */
    public Author() {
    }

    /**
     * Создаёт конструктор принимающий значения всех полей класса Author(2 параметра для автора)
     *
     * @param name    the name
     * @param surname the surname
     */
    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    /**
     * @return Возвращает описания Author с помощью нового метода toString().
     */
    @Override
    public String toString() {
        return STR."Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}



