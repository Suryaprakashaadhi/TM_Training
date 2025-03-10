package Task3;

import java.util.Scanner;

public class Scanneruse {
    static Scanner in=new Scanner(System.in);
    public static int intinput()
    {
        return in.nextInt();
    }
    public static float floatinput()
    {
        return in.nextFloat();
    }
    public char charinput()
    {
        return in.next().charAt(0);
    }

    public String wordinput()
    {
        return in.next();
    }

    public static void main(String[] args) {
        System.out.println("int input");
        int n=intinput();
        System.out.println("float input");
        float f=floatinput();
        Scanneruse sc=new Scanneruse();
        System.out.println("Char input");
        char c=sc.charinput();
        System.out.println("String input");
        String s=sc.wordinput();
        System.out.println("int "+n);
        System.out.println("Float "+f);
        System.out.println("Char "+c);
        System.out.println("String "+s);
    }

}
