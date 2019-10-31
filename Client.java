import java.rmi.*;

public class Client{
    public static void main(String a[]) throws Exception{

        AddI obj = (AddI) Naming.lookup("//localhost:8080/ADD");
        int n = obj.add(2,5);
        System.out.println("Output: " + n);
    }
}