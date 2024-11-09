package CollectionFootballs_41_42_;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        System.out.println(game.getPlayer());
        game.info();
        System.out.println();

        game.addPlayer( "Сергей Игнашевич" );
        game.addPlayer( "Игорь Акинфеев" );
        game.addPlayer( "Юрий Жирков" );

        System.out.println("\n"+game.getPlayer()+"\n");

        game.addPlayer( "Василий Березуцкий");
        game.addPlayer( "Дмитрий Лоськов" );
        game.addPlayer( "Сергей Овчинников" );

        System.out.println("\n"+game.getPlayer()+"\n");


        game.addPlayer( "Александр Анюков" );

        for ( int i = 0; i < Player.getMaxStaminaPlayer(); i++ ) {

            if (game.getPlayer().get(4).getStamina() >= 0) {game.getPlayer().get(3).run();
            }
            else {
                break;
            }
        }
        game.info();
        game.getNamePlayer("Сергей Овчинников");
}
}

