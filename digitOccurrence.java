import java.util.*;
class Digitoccurr
{
int num,i;
int x;
int[] arr = new int[10];
Digitoccurr(int x)
{
this.num=x;
}
void cal()
{
while(num>0)
{
int r=num%10;
arr[r]++;
num=num/10;
}
for(i=0;i<10;i++)
{
System.out.printf("%d = %d \n",i,arr[i]);
}
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
Digitoccurr d=new Digitoccurr(n);
d.cal();
}
}