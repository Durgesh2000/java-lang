 class staticDemo 
 {
    static
    {
        System.out.println("inside static block of StaticDmo Class Which Contains Main");
    }
    public staticDemo()
    {
        System.out.println("Inside Constructor of StaticDemo");
    }                                         
    public static void main(String arg[])
     {
        System.out.println("Inside Main");
        System.out.println("value of static No3 :"+Demo.No3);
        System.out.println("value of static No4 :"+Demo.No4);
        Demo .gun();//Demo::gun();

        Demo obj1 = new Demo();
        Demo obj2  = new Demo();
        obj1.Fun();
    }
}
class Demo
{
    public int No1;     //Non static characterstic
    public int No2;      //Non static characterstic
    public static int No3; // static characterstic
    public static int No4;  // static characterstic
 
    static   // static block
    {
        System.out.println("Inside static block");
        No3 = 51;
        No4 = 101;
    }
    public Demo()   //constuctor
    {
        System.out.println("inside constructor");
        No1 = 11;
        No2 = 21;
    }
    public void Fun()  //Non static mrthod
    {

        //Non Static method 
        System.out.println("Inside non Static method Fun");
        System.out.println("value of No1 : "+this.No1);
        System.out.println("value of No2 : "+this.No2);
        System.out.println("value of No3 : "+this.No3);
        System.out.println("value of No4 : "+this.No4);
    }
    public static void gun() //staic method
    {// Static method can acces only static data 
        // we cant use this keyword
         System.out.println("Inside Static Mrthod gun");
         System.out.println("Inside non Static method gun");
       // System.out.println("value of No1 : "+No1);
       // System.out.println("value of No2 : "+No2);
        System.out.println("value of No3 : "+No3);
        System.out.println("value of No4 : "+No4);
    }
    





}