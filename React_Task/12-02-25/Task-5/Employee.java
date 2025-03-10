package SerializationDeserialization.Task1;

import java.io.Serializable;

public class Employee implements Serializable {
    int eno;
    String ename;
    transient String email;
    Employee(int eno,String ename,String email)
    {
        this.eno=eno;
        this.email=email;
        this.ename=ename;
    }

}
