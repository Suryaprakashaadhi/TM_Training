package Collectiontask.Task;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class Task2SetSampleTestClass {
    public static void setSample(HashSet<Integer> hs)
    {
        hs.add(14);hs.add(21);hs.add(35);
        hs.add(4);hs.add(5);
        hs.add(6);hs.add(7);hs.add(8);
        System.out.println("HashSet Size: " + hs.size());
        System.out.println("Elements in HashSet: " + hs);

        hs.remove(4);
        System.out.println("HashSet Size(after element removed): " + hs.size());
        System.out.println("HashSet after removing element : " + hs);

        System.out.println("Elements divisible by 7 ");
        for (Integer element : hs) {
            if (element %7==0)
                System.out.println(element +" is divisible by 7 ");
        }

    }
    public static void setSample(LinkedHashSet<String> hs)
    {
        hs.add("TressSet");hs.add("LinkedHashset");hs.add("Word");
        hs.add("Cat");hs.add("Dog");hs.add("Hashset");
        hs.add("String");hs.add("Float");

        System.out.println("LinkedHashset Size: " + hs.size());
        System.out.println("Elements in LinkedHashset: " + hs);

        hs.remove("Cat");
        System.out.println("LinkedHashset Size(after element removed): " + hs.size());
        System.out.println("LinkedHashset after removing element : " + hs);

        System.out.println("Elements with size 5");
        for (String element : hs) {
            if (element.length()>5)
                System.out.println(element);
        }

    }
    public static void setSample(TreeSet<Double> ts)
    {
        ts.add(10.25);ts.add(100.25);ts.add(11.5);
        ts.add(20.5);ts.add(22.5);ts.add(25.25);
        ts.add(.25);ts.add(250.0);

        System.out.println("TreeSet Size: " + ts.size());
        System.out.println("Elements in TreeSet: " + ts);

        ts.remove(22.5);
        System.out.println("TreeSet Size(after element removed): " + ts.size());
        System.out.println("TreeSet after removing element : " + ts);

        System.out.println("Elements greater than 20 ");
        for (Double element : ts) {
            if (element >20)
                System.out.println(element );
        }

    }

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        setSample(hs);
        LinkedHashSet<String> ls=new LinkedHashSet<>();
        setSample(ls);
        TreeSet<Double> ts=new TreeSet<Double>();
        setSample(ts);
    }
}
