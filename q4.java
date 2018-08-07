import java.util.*;
import java.lang.*;
class Temperature
{
float fht;
Temperature(float fht)
{
this.fht=fht;
}
float convert()
{
float mo=(fht-32)*(5/9);
return (mo);
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter temperature in Fahreneit");
float fht=sc.nextFloat();
Temperature temp=new Temperature(fht);
System.out.printf("%f",temp.convert());
}
}