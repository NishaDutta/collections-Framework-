import java.util.*;
public class learnHashset {
    public static void main(String[] args) {
        Set<Integer> se = new HashSet<>();
        se.add(121);
        se.add(233);
        se.add(321);
        se.add(431);
        // se.add(233); no duplicate values are allowed
        System.out.println(se);
        se.remove(431);
        System.out.println( se.contains(321));
        System.out.println(se.isEmpty());
        System.out.println(se.size());
        se.clear();
        System.out.println(se);


    }
}
