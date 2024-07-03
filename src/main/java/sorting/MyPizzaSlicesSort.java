package sorting;

import java.util.Comparator;

public class MyPizzaSlicesSort implements Comparator<Pizza> {
    /**
     *
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return +: if object one bigger, 0: if they are equals. -: if object two bigger.
     */
    @Override
    public int compare(Pizza o1, Pizza o2) {
        return o1.getSlice() - o2.getSlice();
    }
}
