package OOP_fainal__static_football_37_38;


import java.util.Random;


public class Player {
    Random random = new Random();

    private int stamina;
    public static  final Integer MAX_STAMINA = 10;
    public static  final Integer MIN_STAMINA = 0;

    static int countPlayers = 0;
    private String name;

    public Player(String name) {
        if (countPlayers < 6) {
            countPlayers++;
            this.name = name;
            this.stamina = random.nextInt(6, MAX_STAMINA);
        }
        else {
            System.out.println("Игроков уже 6");
        }
    }

    public String getName() {
        return name;
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {
        if (name != null) {
            stamina--;
            if (getStamina() > 0) {
                System.out.println(" выносливость - " + " " + getStamina() + " " + getName() + "(игрок устал)" );
            }
            else if (getStamina() == 0) {
                System.out.println( "игрок выбыл" );
                countPlayers--;
            }

        }
    }

    public void info() {
        if (countPlayers < 6) {
            System.out.println("Команды не полные- " +
                    "На поле еще есть"+" "+countPlayers+" "+ "свободных мест ");
        }
        else if (countPlayers >= 6){
            System.out.println("На поле нет свободных мест");
        }
    }
}

