import java.net.*;
import java.io.*;
public class Server 
{
    public static void main(String[] args)  throws Exception
    {
       System.out.println("Server application is Running ..."); 

       ServerSocket ss = new ServerSocket(2100);
       System.out.println("Server is Running at port no 2100 and waiting for client request");

       Socket s = ss.accept();
       System.out.println("Request of Client Get Accepted");
    }
}
