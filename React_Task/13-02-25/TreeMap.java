package Collectiontask.Task;

import java.util.Map;
import java.util.TreeMap;

public class Task4Treemap {
    public static void main(String[] args) {
        TreeMap<Integer, String> hm = new TreeMap<>();
        //Hashtable<Integer, String> hm = new Hashtable<>();
        hm.put(1, "one");
        hm.put(2, "two");
        hm.put(3, "three");
        System.out.println("Initial TreeMaP hm1 are : "
                + hm);
        hm.put(2, "For");
        System.out.println("Updated Map " + hm);
        hm.remove(1);
        System.out.println("Mappings after removal are : "
                + hm);
        System.out.println("Map traversal:");

        for (Map.Entry<Integer, String> e : hm.entrySet())
            System.out.println("Key: " + e.getKey()
                    + " Value: " + e.getValue());
    }
}
