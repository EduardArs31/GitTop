package Collections_Map_49_50_;

import java.util.Comparator;

public class CarModelComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return CharSequence.compare(o1.getModel(), o2.getModel());

    }
}
