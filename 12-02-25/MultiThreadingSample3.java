package Threadhand.Task;

public class Multhithreadingsample3 {
    public static void main(String[] args) {
        HTask3Thread3 HT1=new HTask3Thread3();
        HTask3Thread3 HT2=new HTask3Thread3();
        HTask3Thread3 HT3=new HTask3Thread3();
        HT1.start();
        HT2.start();
        HT3.start();

    }
}
class HTask3Thread3 extends Thread {
    @Override
    public void run() {
        System.out.println("From HTask3Thread3");
        System.out.println("From HTask3Thread3");
        System.out.println("From HTask3Thread3");
        System.out.println("From HTask3Thread3");
        System.out.println("From HTask3Thread3");
    }
}

