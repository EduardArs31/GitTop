package Immutable_Generics_51_52_d;

public class CustomMutableClass {
    private Integer number ;

    public CustomMutableClass(Integer number){
        this.number = number;
    }
    public CustomMutableClass(CustomMutableClass other){
        this.number = other.number;
    }


    public  void setNumber(Integer number ){
        this.number = number;
    }

    @Override
    public String toString() {
        return "MC{"+ number + '}';
    }
}
