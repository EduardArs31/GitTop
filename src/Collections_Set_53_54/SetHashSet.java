package Collections_Set_53_54;
import java.util.HashSet;
import java.util.Set;


public class SetHashSet {
    public static Set<Integer> findNumb(int[] num){
        Set<Integer> numbers = new HashSet<>();
        for (Integer number : num) {
            numbers.add(number);
        }
        return numbers;
    }

    }
