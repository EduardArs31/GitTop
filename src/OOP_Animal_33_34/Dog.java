package OOP_Animal_33_34;


public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }


    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Гав-гав");
        System.out.println(getName());

    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Собака ест кость");

    }

    @Override
    public void move() {
        super.move();
        System.out.println("Собака бегает");
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Cобака играет с палкой");
        System.out.println();
    }

    @Override
    public void beFriedly() {
        super.beFriedly();
        System.out.println("Собака преданная");
    }

}
