package OOP_Animal_33_34;


public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Мяу-Мяу");
        System.out.println(getName());
    }
    @Override
    public void eat() {
        super.eat();
        System.out.println("Кошка ест рыбу");
    }


    @Override
    public void move() {
        super.move();
        System.out.println("Кошка ходит");
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Кошка играет с мячем");
        System.out.println();
    }

    @Override
    public void beFriedly() {
        super.beFriedly();
        System.out.println("Дружелюбная кошка");
    }
}
