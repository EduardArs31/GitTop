package OOP_Animal_33_34;

public class Bird extends Animal {
    private boolean canFly;

    public Bird(String name, boolean canFly) {
        super(name);
        this.canFly = canFly;
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Чирик-чирик");
        System.out.println(getName());
        System.out.println("Умеет ли животное летать?:" + canFly);
    }


    @Override
    public void eat() {
        super.eat();
        System.out.println("Птица ест семена:");

    }

    @Override
    public void move() {
        super.move();
        if (canFly == true) {

            System.out.println("Птица умеет летать:" + " " + canFly);
        }
        if (canFly == false) {
            System.out.println("Птица не умеет летать:" + " " + canFly);
            System.out.println();
        }
    }
}

