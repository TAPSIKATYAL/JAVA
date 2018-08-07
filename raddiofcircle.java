class Circle
{
double radius=1.0;
String color="red";
Circle()
{
}
Circle(double r)
{
this.radius=r;
}
double getRadius()
{
Scanner sc=new Scanner(System.in);
radius=sc.nextDouble();
return radius;
}
double getArea()
{
double area=3.14*radius*radius;
return area;
}
public static void main(String args[])
{


}
}