package Builder_House_39_40;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

       List<House> house = new ArrayList<>();

       House house1 = new House.Builder()
               .floors(5)
               .rooms(3)
               .garage(true||false)
               .build();

       System.out.println(house1);

       House house2 = new House.Builder()
               .floors(7)
               .rooms(4)
               .garage(true&&false)
               .build();
       System.out.println(house2);

       House house3 = new House.Builder()
               .floors(4)
               .rooms(2)
               .garage(true||false)
               .build();
       System.out.println(house3);

       House house4 = new House.Builder()
               .floors(9)
               .rooms(1)
               .garage(true&&false)
               .build();
       System.out.println(house4);



       house.add(house1);
       house.add(house2);
       house.add(house3);
       house.add(house4);


       System.out.println("Наличие дома? -  " + house.contains(house1));
       System.out.println("Наличие дома? - " + house.contains(house3));
       System.out.println("Индекс дома 2 - " + house.indexOf(house2));
       System.out.println("Индекс дома 3 - " + house.indexOf(house4));

     System.out.println(house1.equals(house4));
     System.out.println(house2.equals(house2));
   }

}


