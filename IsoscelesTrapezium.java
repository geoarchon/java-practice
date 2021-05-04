import java.util.*;
class IsoscelesTrapezium implements Area
{
    double s1, base;
    IsoscelesTrapezium(double a, double b)//parameterised constructor
    {
        s1=a;
        base=b;
    }
    public double TriArea()//calculates area of each triangle in the trapezium
    {
        double area=0.5*s1*height;
        return area;
    }
    public double RecArea()//calculates area of the rectangle in the trapezium 
    {
        double area=base*height;
        return area;
    }
    public void Show()//displays the area of the trapezium
    {
        double Area=2*TriArea()+RecArea();
        System.out.println("Area: "+Area);
    }
    public static void main()//for taking user input and calling other functions
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base of each triangle");
        double a=sc.nextDouble();
        System.out.println("Enter base of rectangle");
        double b=sc.nextDouble();
        IsoscelesTrapezium i=new IsoscelesTrapezium(a,b);
        i.Show();
    }
}