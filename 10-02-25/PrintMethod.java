package Task2;

public class Printmethod {
    public static void printstatement(String str)
    {
        System.out.print(str);
    }
    public static void printlnstatement(String str)
    {
        System.out.println(str);
    }

    public void errorprintln(String str)
    {
        System.err.println(str);
    }

    public static void main(String[] args) {
        printstatement("Print statement");
        printstatement("Prints in the same line");

        printlnstatement("Println Statement");
        printlnstatement("Print the Statement in the next line");

        Printmethod obj=new Printmethod();
        obj.errorprintln("Error Println Statement");
        obj.errorprintln("This print the error Statement in the next line");
    }
}
