package OOP_Animal_33_34;


public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound(String animal) {
        super.makeSound(animal);
        System.out.println("Гав-гав");
        System.out.println(getName());
    }

    @Override
    public void eat(String e) {
        super.eat(e);
        System.out.println("Собака ест кость");
        System.out.println();
    }
}
