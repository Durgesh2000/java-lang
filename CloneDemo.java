
class Employee {
    public int Eid;
    public String Name;
    public int Salary;

    public Employee(int No, String str, int value) {
        this.Eid = No;
        this.Name = str;
        this.Salary = value;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class cloneDemo {
    public static void main(String[] args) {
        try {
            Employee eboj1 = new Employee(101, "Rahul", 11000);
            Employee eobj2 = (Employee) eboj1.clone();

            System.out.println("Name of First employee :" + eboj1.Name);
            System.out.println("Name of Second employee :" + eobj2.Name);

            System.out.println("salary of first employee" + eboj1.Salary);
            System.out.println("salary of second employee" + eobj2.Salary);
             
                  eboj1.Name = "sager";
                  
                  System.out.println("Name of first employee"+eobj1.Name);
                  System.out.println("Name of second employee"+eobj2.Name);

        }  
        catch (CloneNotSupportedException obj) {
        }
    }
}