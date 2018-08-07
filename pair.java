import java.util.*;
class pair
{
public static void main(String args[])

{
int a[]=new int[]{2,3,5,3,1,4,8};
int sum=6;
for(int i=0;i<a.length-1;i++)
{
for(int j=i+1;j<a.length;j++)
{if(a[i]+a[j]==sum )
{
System.out.println(a[i]+","+a[j]);
}}}
}
}