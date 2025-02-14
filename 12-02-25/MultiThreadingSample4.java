package Threadhand.Task;

public class Multhithreadingsample4 {
    public static void main(String[] args) {
        HTask4ThreadRunnableOne HTR1=new HTask4ThreadRunnableOne();
        HTR1.start();
    }
}
class HTask4ThreadRunnableOne extends Thread
{
    @Override
    public void run() {
        System.out.println("From HTask4ThreadRunnableOne");
        System.out.println("From HTask4ThreadRunnableOne");

    }
}
