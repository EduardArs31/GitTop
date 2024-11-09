package Builder_House_39_40;

public class Main {
   public static void main(String[] args) {
      House house = new House.Builder()
               .floors(5)
               .rooms(3)
               .garage(true||false)
               .build();
       System.out.println(house);

       House house1 = new House.Builder()
               .floors(7)
               .rooms(4)
               .garage(true&&false)
               .build();
       System.out.println(house1);
   }
}


