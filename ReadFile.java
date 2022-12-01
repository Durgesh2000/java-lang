package File_handlingjava;

import java.io.File;
import java.io.FileInputStream;

class ReadFile {
    public static void main(String[] args)throws Exception
 {
  FileInputStream fobj = new FileInputStream("Marvellous.txt");
  int i = 0;
   while((i = fobj.read()) != -1 )
   {
    System.out.println((char)i);
   }
  System.out.println();
  fobj.close();
    }
}
