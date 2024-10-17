package OOP_29_30;


public class Book {

    private String title;
    private Author author;
    private Integer year;

    public void setTitle(String title) {
        this.title = title;
    }


    public String getTitle() {
        return title;

    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getInfo() {
        return title + " " + year;
    }


}
