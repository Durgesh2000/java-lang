class Demo
{
   public int Size;
   public int Arr[];


public Demo(int No)
{
    System.out.println("Inside the constructor");
    Size = No;
    Arr = new int[Size];

}
protected void Finalize()
{
    System.out.println("Inside finalized Method");
    Arr = null;
}
}

class FinalizedDemo
 {
    public static void main(String[] args) 
    {
        Demo obj = new Demo(4);
        obj = null;
        System.gc();
    }
}

