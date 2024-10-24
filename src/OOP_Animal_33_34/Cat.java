package OOP_Animal_33_34;


public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound(String animal) {
        super.makeSound(animal);
        System.out.println("Мяу-Мяу");
        System.out.println(getName());
    }

    @Override
    public void eat(String e) {
        super.eat(e);
        System.out.println("Кошка ест рыбу");
        System.out.println();
    }
}
