package File_handlingjava;
import java.io.*;
import java.io.FileOutputStream;

class WriteFile 
{
  public static void main(String[] args) throws Exception
   {
     FileOutputStream fobj = new FileOutputStream("Marvellous.txt");

     String Data = "Marvellous Infosystem Pune";

     byte bdata [] = Data.getBytes();

     fobj.write(bdata);
     fobj.close();
  }   
}
