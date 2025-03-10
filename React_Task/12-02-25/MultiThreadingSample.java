package Threadhand.Task;

public class Multhithreadingsample
{
    public static void main(String[] args) {
        HTask1Thread1 obj=new HTask1Thread1();
        obj.start();
    }
}

class HTask1Thread1 extends Thread {
    @Override
    public void run() {
        System.out.println("From HTask1Thread1");
        System.out.println("From HTask1Thread1");
        System.out.println("From HTask1Thread1");
    }


}
