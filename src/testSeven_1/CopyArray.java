package testSeven_1;

import java.io.OptionalDataException;
import java.util.*;

public class CopyArray {
    public static void main(String[] args) {
        Collection c = Collections.singleton(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        List a = new ArrayList(c);
        ListIterator it = a.listIterator();
    }

}
