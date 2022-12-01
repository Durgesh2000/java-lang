class Math
{
 public int iNo1;
 public int iNo2;

 public Math()
 {
     System.out.println("inside defult Costructor");
     iNo1 =0;
     iNo2 =0;
 }
 public Math(int a, int b)
 {
     System.out.println("Inside Parameterised Constructor");    
     iNo1 =a;
     iNo2 =b;
 }
 public int Addition()  //Behaviour
 {
    int iAns =0;
    iAns = iNo1 + iNo2;
    return iAns;

 }
 public int Substraction()  //Behaviour
 {
    int iAns = 0;
    iAns = iNo1 - iNo2;
    return iAns;

} // End of Maths Class
}
class Demo
{
    public static void main(String arr[])
    {
          System.out.println("Inside main function");
    
          Math mobj1 = new Math();
          Math mobj2 = new Math(10,11);

          int iRet = 0;
          iRet = mobj1.Addition();
          System.out.println("Addition is :"+iRet);

          iRet = mobj2.Addition();
          System.out.println("Addition is :"+iRet);


    }
}