import java.util.*;
class knapsack
{
public static void main(String args[])
{
int max=60,temp,t1,t2,sum=0;
int profit[]=new int[4];
int weight[]=new int[4];
int ratio[]=new int[4];
Scanner sc=new Scanner(System.in);
for(int i=0;i<4;i++)
{
profit[i]=sc.nextInt();
}
for(int i=0;i<4;i++)
{
weight[i]=sc.nextInt();
}
for(int i=0;i<4;i++)
{
ratio[i]=profit[i]/weight[i];
}
for(int i=0;i<3;i++)
{
		if(ratio[i]<ratio[i+1])
		{
		temp=ratio[i];
		ratio[i]=ratio[i+1];
		ratio[i+1]=temp;
	
		t1=profit[i];
		profit[i]=profit[i+1];
		profit[i+1]=t1;

		t2=weight[i];
		weight[i]=weight[i+1];
		weight[i+1]=t2;
		}
}
int w=0,i=0;
while(w<max)
{
if(w+weight[i]<max)
{
sum=sum+profit[i];
}
w=w+weight[i];
i++;
}
i--;
w=w-max;
int a=(profit[i]/weight[i])*w;
sum=sum+a;
for(i=0;i<4;i++)
{
System.out.printf("%d %d %d", profit[i],weight[i],ratio[i]);
System.out.printf("\n");
}
System.out.printf("Total Profit is %d",sum);
}
}
