import java.rmi.*;

public class Server{

    public static void main(String a[]) throws Exception{
        AddC obj = new AddC();
        Naming.rebind("rmi://localhost:8080/ADD",obj);
        System.out.println("Server has started!");
    }

}