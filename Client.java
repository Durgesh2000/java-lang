import java.net.*;
import java.io.*;
public class Client 
{
    public static void main(String[] args) throws Exception
    {
       System.out.println("client application is Running ..."); 
       
       Socket s = new Socket("Localhost",2100);
       System.out.println("Client is Waiting for the Server to accept the Request ");

    }
}
