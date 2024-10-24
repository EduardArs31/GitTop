package OOP_Animal_33_34;

public class Bird extends Animal {
    private boolean canFly;

    public Bird(String name, boolean canFly) {
        super(name);
        this.canFly = canFly;
    }

    @Override
    public void makeSound(String animal) {
        super.makeSound(animal);
        System.out.println("Чирик-чирик");
        System.out.println(getName());

        System.out.println("Умеет ли животное летать:" + canFly);
    }

    @Override
    public void eat(String e) {
        super.eat(e);
        System.out.println("Птица ест семена");
        System.out.println();
    }
}

