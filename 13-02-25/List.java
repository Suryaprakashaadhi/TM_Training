package Collectiontask.Task;

import java.util.*;

public class Task1List {
    public static void main(String[] args) {
        LinkedListthread link=new LinkedListthread();
        ArrayListThread arr=new ArrayListThread();
        VectorList vec=new VectorList();
        Stacklist sta=new Stacklist();
        link.start();
        arr.start();
        vec.start();
        sta.start();
    }
}

class LinkedListthread extends Thread
{
    @Override
    public void run() {
            Listmethod.listdisp(new LinkedList<Integer>());
    }
}
class ArrayListThread extends Thread{
    @Override
    public void run() {
        Listmethod.listdisp(new ArrayList<Integer>());
    }
}
class VectorList extends Thread
{
    @Override
    public void run() {
        Listmethod.listdisp(new Vector<Integer>());
    }
}
class Stacklist extends Thread
{
    @Override
    public void run() {
        Listmethod.listdisp(new Stack<Integer>());
    }
}
class Listmethod
{
    public static void listdisp(List list1)
    {
        list1.add(35);
        list1.add(23);
        list1.add(67);
        list1.add(82);
        list1.add(56);
        list1.add(49);
        list1.add(49);
        list1.add(49);
        //System.out.println("Is list1 empty? "+list1.isEmpty());
        //  System.out.println("The given list is:"+list1);
        System.out.println("Number of elements in the list: "+list1.size());
        //Adding one element
        list1.add(12);
        System.out.println("After adding one element:");
        System.out.println("The given list is :"+list1);
        System.out.println("The number of elements in the list: "+list1.size());
//Checking for an element
        System.out.println("Is 566 available in the list:"+list1.contains(566));
        System.out.println("The given list before removing elements is :"+list1);

        list1.remove(2);//Removing element by its index
        list1.remove(3);//Removing element by its index
        System.out.println("After removing elements:");
        System.out.println("The given list is :"+list1);
        System.out.println("The number of elements in the list: "+list1.size());
    }
}
