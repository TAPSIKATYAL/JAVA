import java.util.Scanner;
import java.util.*;
import java.lang.*;
class Array1
{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
System.out.println("Enter Values :");
int array[]=new int[5]; 
int num=0;
for (int i=0;i<5;i++) 
{
array[i]=input.nextInt(); 
}
for(int i=0;i<(array.length-1);i++)
{
for(int j=1;j<(array.length);j++)
{
if(array[i]==array[j])
{
num=array[j];
break;
}
}
}
System.out.println("repated element is");
System.out.println(num);
}
}