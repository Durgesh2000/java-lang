
class Loops 
{
    public static void main(String arg[]) 
    {
        int Arr[] = { 10, 20, 30, 40 };
        int iCnt = 0;

        System.out.println("Traversal of array using for Loop");
        for (iCnt = 0; iCnt < Arr.length; iCnt++) {
            System.out.println(Arr[iCnt]);
        }

        System.out.println("Travesal of array using while Loop");
        iCnt = 0;
        while (iCnt < Arr.length) // Same in c,c++,java
        {
            System.out.println(Arr[iCnt]);
            iCnt++;

        }
        System.out.println("Traversal of array using do while loop");
        iCnt = 0;
        do // Same in c,c++,java
        {
            System.out.println(Arr[iCnt]);
            iCnt++;
        } while (iCnt < Arr.length);

        System.out.println("Traversal of Array using for-each loop");
        for(int iNo : Arr)  //only java
        {
            System.out.println(iNo);
        }
    }
}