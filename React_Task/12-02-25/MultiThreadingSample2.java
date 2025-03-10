package Threadhand.Task;

public class Multhithreadingsample2 {
    public static void main(String[] args) {
        HTask2Thread2 obj=new HTask2Thread2();
        HTask2Thread2 obj1=new HTask2Thread2();
        obj.start();
        obj1.start();
        obj.run();

    }
}
class HTask2Thread2 extends Thread {
    @Override
    public void run() {
        System.out.println("From HTask2Thread2");
        System.out.println("From HTask2Thread2");
        System.out.println(10/0);
    }


}
