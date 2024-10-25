package OOP_Animal_33_34;


public class Main {
    public static void main(String[] args) {

        Animal cat = new Cat("Lily");
        Animal dog = new Dog("Reks");
        Animal bird = new Bird("Toto", true);


        if (dog instanceof Pet) {

            dog.move();
            dog.eat();
            dog.makeSound();
            dog.beFriedly();
            ((Pet) dog).play();

        }
        if (cat instanceof Pet) {
            cat.move();
            cat.eat();
            cat.makeSound();
            cat.beFriedly();
            ((Pet) cat).play();
        }
        if (bird instanceof Animal) {

            bird.move();
            bird.eat();
            bird.makeSound();
        }
    }

}
