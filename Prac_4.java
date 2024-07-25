import java.util.*;
public class Prac_4 {
    public static void main(String[] args) {
        date d1=new date();
        date d2=new date();
        d1.getdata();
        d1.setdata();
        d2.getdata();
        d2.setdata();
        System.out.println("This practical is made by 23CS096-JAINI SOLANKI");
    }
}
class date{
    Scanner sc=new Scanner(System.in);
    int month;
    int day;
    int year;
    void getdata(){
        System.out.println("Enter month: ");
        month=sc.nextInt();
        System.out.println("Enter day: ");
        day=sc.nextInt();
        System.out.println("Enter year: ");
        year=sc.nextInt();
    }
    void setdata()
    {
        System.out.println("Month = " +month);
        System.out.println("Day = " +day);
        System.out.println("Year = " +year);
    }
}
