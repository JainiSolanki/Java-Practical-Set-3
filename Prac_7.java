import java.util.*;
public class Prac_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int n1=sc.nextInt();
        System.out.println("Enter number 2: ");
        int n2=sc.nextInt();
        return_object r1=new return_object(n1,n2);
        // System.out.println(r1.num1);
        // System.out.println(r1.num2);
       // return_object r2=new return_object(n2);
        return_object x1=new return_object();
        x1=r1.add(r1);
        System.out.println("Addition is : " +x1.num1);
        System.out.println("Subtraction is : " +x1.num2);
        System.out.println("This practical is made by 23CS096- Jaini Solanki");
    }
}

class return_object
{
    return_object()
    {}
    int num1,num2;
    
    public return_object(int n1,int n2)
    {
        num1=n1;
        num2=n2;
    }

     public return_object add(return_object r1)
     {
        return new return_object(r1.num1+r1.num2,r1.num1-r1.num2);
            
    }
}
