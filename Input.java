import java.util.*;
 //import java.util.Scanner;
class Input
{
    public static void main (String arr[])
    {
           Scanner sobj = new Scanner(System.in);  
           int iNo1 = 0;
           int iNo2 = 0;
           int iAns = 0;
  
           System.out.println("Enter First Number :");
           iNo1 = sobj.nextInt();

           System.out.println("Enter Second Number :");
           iNo2 = sobj.nextInt();

           iAns = iNo1 +iNo2;
           
           System.out.println(+iAns);
    }
}



/*
 Method of Scanner Class
 
 boolean       nextBool()
 byte          nextByte()
 char          nextLine()    string
 int           nextInt()
 float         nextFloat()
 double        nextDouble()
 short         nextShort()
 long          nextLong()
  
 */