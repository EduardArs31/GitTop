package OOP_29_30;


public class Author {
    private String name;
    private String surname;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;

    }

    public String getInfo() {
        return name + " " + surname;
    }
}



