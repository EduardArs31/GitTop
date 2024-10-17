package OOP_29_30;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author();
        author1.setName("Михаил");
        author1.setSurname("Булгаков");

        Author author2 = new Author();
        author2.setName("Александр");
        author2.setSurname("Пушкин");

        Author author3 = new Author();
        author3.setName("Фёдор");
        author3.setSurname("Достоевский");

        Book book1 = new Book();
        book1.setAuthor(author1);
        book1.setTitle("Белая гвардия");
        book1.setYear(1923);

        Book book2 = new Book();
        book2.setAuthor(author2);
        book2.setTitle("Руслан и Людмила");
        book2.setYear(1822);

        Book book3 = new Book();
        book3.setAuthor(author3);
        book3.setTitle("Идиот");
        book3.setYear(1868);

        System.out.println(author1.getInfo());
        System.out.println("роман:" + book1.getInfo());
        System.out.println();

        System.out.println(author2.getInfo());
        System.out.println("поэма:" + book2.getInfo());
        System.out.println();

        System.out.println(author3.getInfo());
        System.out.println("роман:" + book3.getInfo());
    }
}

