package sorting;

import java.util.Comparator;

public class MyStringComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        // return 0 => if o1 == o2
        // return NEGATIVE number => o1 is smaller than o2
        // return POSITIVE number => o1 is bigger than o2
        /*
        if(o1.length() == o2.length())
            //return 0;
            return o1.compareTo(o2);
        else if(o1.length() < o2.length())
            return -1;
        else
            return 1;
         */
        return o1.length() - o2.length();
    }
}
