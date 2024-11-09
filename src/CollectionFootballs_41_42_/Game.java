package CollectionFootballs_41_42_;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Integer countPlayers = 0;
    private static final int MAX_COUNT = 6;

    private List<Player> players = new ArrayList<>();

    public void removePlayer(Player player) {
        players.remove(player);
        countPlayers--;
        System.out.println("Удалён игрок " + player.getName());
    }
    public void addPlayer(String name) {
        if (countPlayers < MAX_COUNT){
            countPlayers++;
            Player newPlayer = new Player(name,this);
            players.add(newPlayer);
            System.out.println("Введён новый игрок, всего - " + countPlayers);
        } else {
            System.out.println("Игроков уже 6, команда в сборе");
        }
    }
    public void info() {
         if (countPlayers < MAX_COUNT) {
            System.out.println("Команды неполные. На поле ещё есть  " + ( MAX_COUNT - countPlayers)
                    + " " +"свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
    public List<Player> getPlayer() {
        return players;
    }
    public void getNamePlayer(String name) {
        for (int i = 0; i < players.size(); i++) {
                if(players.get(i).getName().equals(name)){
                       System.out.println("Игрок " + name + " есть в списке.");
                    }
               else {
                        System.out.println("Игрока с именем " + name + " нет в списке.");
               }
            }

        }
}




