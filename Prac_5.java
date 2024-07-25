import java.util.*;
public class Prac_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        int len=sc.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        int bre=sc.nextInt();
        area a1=new area(len,bre);
        a1.returnArea();
        System.out.println("This practical is made by 23CS096-JAINI SOLANKI");
    }
}

class area{
    int l;
    int b;
    int area;
    area(int length,int breadth)
    {
        l=length;
        b=breadth;  
        area=l*b; 
    }
    void returnArea()
    {
        System.out.println("Area of rectangle is " +area);
    }
}
