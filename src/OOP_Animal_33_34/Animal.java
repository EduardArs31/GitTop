package OOP_Animal_33_34;


public abstract class Animal implements Pet {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        System.out.println("-" + "Имя животного:");
        return name;
    }

    public void makeSound() {
        System.out.println("-" + "Звук животного:");
    }

    public void eat() {
        System.out.println("-" + "Что животное ест?:");
    }

    public void move() {
        System.out.println("-" + "Как животное двигается?:");
    }

    @Override
    public void play() {
        Pet.super.play();
    }

    @Override
    public void beFriedly() {
        Pet.super.beFriedly();
    }

}



