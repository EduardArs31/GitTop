package CollectionFootballs_41_42_;

import java.util.Random;

public class Player {
    private final Game game;
    Random random = new Random();
    private final String name;
    private int stamina;

    private static final Integer MAX_STAMINA = 10;
    private static final Integer MIN_STAMINA = 0;

    Player(String name, Game game){
        this.stamina = random.nextInt(MIN_STAMINA+6,MAX_STAMINA + 1 );
        this.name = name;
        this.game = game;
    }
    public String getName(){
        return name;
    }
    public int getStamina() {
        return stamina;
    }
    public void run(){
        if( stamina > 0 ){
            stamina--;
            System.out.println(name + " " + "Выносливость игрока = " + " " + stamina );
        }
        else{
            game.removePlayer( this );
            System.out.println(name + " Игрок устал .");
        }
    }
    @Override
    public String toString() {
        return "Игрок { " + " имя игрока = " + name  + " выносливость = " + stamina + '}'+ '\n';
    }
    public static Integer getMaxStaminaPlayer() {
        return MAX_STAMINA;
    }
}
