package OOP_Animal_33_34;


public class Main {
    public static void main(String[] args) {

        Animal cat = new Cat("Lily");
        Animal dog = new Dog("Reks");
        Animal bird = new Bird("Toto", true);


        dog.makeSound("Гав-гав");
        dog.eat("Собака ест кость");

        bird.makeSound("Чирик-чирик");
        bird.eat("Птица ест семена");

        cat.makeSound("Мяу-Мяу");
        cat.eat("Кошка ест рыбу");
    }
}
