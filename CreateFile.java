import java.io.*;

class CreateFile
{
    public static void main(String[] args) throws Exception
    {
        File fobj =  new File("Marvellous.txt");
      
        if(fobj.createNewFile())
        {
            System.out.println("File create Succesfuly");
        }
        else{
            System.out.println("Unable to crate the file");
        }
    }
}