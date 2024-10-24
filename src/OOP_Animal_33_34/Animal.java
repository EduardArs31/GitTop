package OOP_Animal_33_34;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        System.out.println("Имя животного:");
        return name;
    }

    public void makeSound(String animal) {
        System.out.println("Звук животного:");
    }

    public void eat(String e) {
        System.out.println("Что животное ест:");
    }
}



