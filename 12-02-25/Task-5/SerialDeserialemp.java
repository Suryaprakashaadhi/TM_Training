package SerializationDeserialization.Task1;


import java.io.*;

public class Serialdeserialemp {
    public static void serial(Employee emp) throws IOException {
        FileOutputStream fout = new FileOutputStream("f.txt");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(emp);
        out.flush();
        out.close();
        System.out.println("success");
    }
    public static void deserial() throws IOException, ClassNotFoundException {
        ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));
        Employee emp=(Employee) in.readObject();
        System.out.println(emp.eno+" "+emp.ename );
        in.close();
    }

    public static void main(String[] args) {
        try {
            Employee emp = new Employee(1, "Hari", "hari@gmail.com");
            serial(emp);
            deserial();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
