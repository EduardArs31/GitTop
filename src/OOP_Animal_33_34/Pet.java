package OOP_Animal_33_34;


public interface Pet {

    default void play() {
        System.out.println("-" + "С чем играет животное?:");

    }

    default void beFriedly() {
        System.out.println("-" + "Демонстрации дружелюбного поведения:");
    }

}
