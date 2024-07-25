import java.util.*;
public class Prac_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the real number1: ");
        int real1=sc.nextInt();
        System.out.println("Enter the imaginary number1: ");
        int img1=sc.nextInt();
        System.out.println("Enter the real number2: ");
        int real2=sc.nextInt();
        System.out.println("Enter the imaginary number2: ");
        int img2=sc.nextInt();

        complex C1=new complex(real1,img1);
        complex C2=new complex(real2,img2);
        complex x1=new complex();
        x1=C1.add(C1, C2);
        System.out.println("Sum = " +x1.real+"+"+x1.img+"i");
       // complex x2=new complex();
        x1=C1.sub(C1,C2);
        System.out.println("Subtraction = " +x1.real+"-"+x1.img+"i");
       // complex x3=new complex();
        x1=C1.product(C1,C2);
        System.out.println("Product = " +x1.real+"*"+x1.img+"i");
        System.out.println("This practical is made by 23CS096-Jaini Solanki");
    }
}

class complex
{
    int real,img;
    complex()
    {
        real=0;
        img=0;
    }
    complex(int tempreal,int tempimg)
    {
        real=tempreal;
        img=tempimg;
    }
    complex add(complex c1,complex c2)
    {
        complex temp=new complex(real,img);
        temp.real=c1.real+c2.real;
        temp.img=c1.img+c2.img;
        return temp;
    }
    complex sub(complex c1,complex c2)
    {
        complex temp=new complex(real, img);
        temp.real=c1.real-c2.real;
        temp.img=c1.img-c2.img;
        return temp;
    }
    complex product(complex c1,complex c2)
    {
        complex temp=new complex(real, img);
        temp.real=c1.real*c2.real;
        temp.img=c1.img*c2.img;
        return temp;
    }
}
