
public class Prac_2{
    public static void main(String args[])
    {
    area o1=new area();
    area o2=new area(10);
    area o3=new area(2,6);
    System.out.println("This practical is made by 23CS096-JAINI SOLANKI");
    }
}

class area{
    area(){
        int rad=1;
        System.out.println("Area of triangle: " +((1.73/4)*rad*rad));
    }
    area(double x){
       System.out.println("Area of circle: " +(3.14*x*x));
    }
    area(float a,float b)
    {
        System.out.println("Area of rectangle: " +(0.5*a*b));
    }
}



