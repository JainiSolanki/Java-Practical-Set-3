import java.util.*;
public class Prac_3 {
    public static void main(String[] args) {
       employee e1=new employee();
       employee e2=new employee();
       e1.getdata();
       e1.salary_rise();
       e1.setdata();
       e2.getdata();
       e2.salary_rise();
       e2.setdata();
       System.out.println("This practical is made by 23CS096-JAINI SOLANKI");
    }
}


class employee{
    Scanner sc=new Scanner(System.in);
    String fn;
    String ln;
    double salary;
    void getdata(){
        
        System.out.print("Enter the first name: ");
         fn= sc.nextLine();
        System.out.print("Enter the last name: ");
         ln= sc.nextLine();
        System.out.print("Enter the salary: ");
         salary= sc.nextDouble();
        if(salary<0)
        salary=0.0;
    }
    void salary_rise(){
        salary=(salary*12)+((salary*12)*0.1);
    }
    void setdata()
    {
        System.out.println("First name: "+fn);
        System.out.println("Last name: "+ln);
        System.out.println("Yearly Salary: "+salary);
    }
   
}
