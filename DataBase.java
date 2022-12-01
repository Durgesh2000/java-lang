import java.sql.*; //1

 class DataBase 
{
   public static void main(String[] args) throws Exception
   {
           String URL = "jdbc:mysql://localhost:3306/ppa41";
           String Username = "root";
           String Password = "root";
           String Query = "select * from student";


           Connection cobj = DriverManager.getConnection(URL,Username,Password); //2

           Statement sobj = cobj.createStatement(); //3

           ResultSet robj = sobj.executeQuery(Query); //4

           while(robj.next())
           {
            System.out.println("RID: "+robj.getInt("RID"));
            System.out.println("Name: "+robj.getString("Name"));
            System.out.println("City: "+robj.getString("City"));
            System.out.println("Marks: "+robj.getString("Marks"));
           }


   }  
}
