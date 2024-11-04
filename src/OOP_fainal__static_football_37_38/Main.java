package OOP_fainal__static_football_37_38;




public class Main {
    public static void main(String[] args) {
        Player players1 = new Player("Сергей Игнашевич");
        players1.info();

        Player players2 = new Player("Игорь Акинфеев");
        players2.info();

        Player players3 = new Player("Юрий Жирков ");
        players3.info();

        Player players4 = new Player("Василий Березуцкий ");
        players4.info();

        Player players5 = new Player("Дмитрий Лоськов");
        players5.info();

        Player players6 = new Player("Сергей Овчинников ");
        players6.info();



        Player players7 = new Player("Александр Анюков ");
        players7.info();

        Player players8 = new Player("Марио Фернандес ");
        players8.info();



        for (int i = players6.getStamina(); i > Player.MIN_STAMINA;  ) {i = players6.getStamina();players6.run();}

    }
}