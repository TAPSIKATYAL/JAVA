import java.util.*;
class Stack
{
int top=-1,peek=-1;
int stack1[]=new int[5];
int stack2[]=new int[5];
void push(int n)
	{
	top=top+1;
	stack1[top]=n;
	}
void pop()
	{
	System.out.println(stack2[peek]);
	System.out.print("\n");	
	peek=peek-1;
	}
void push1(int n)
	{
	peek=peek+1;
	stack2[peek]=n;
	}
int pop1()
	{
	int p=top;
	top=top-1;
	return stack1[p];
	}
public static void main(String args[])
{
int a;
Stack sc=new Stack();
sc.push(55);
sc.push(45);
sc.push(35);
sc.push(25);
sc.push(15);
for(int i=0;i<5;i++)
{
	a=sc.pop1();
	sc.push1(a);
}
sc.pop();
sc.pop();
sc.pop();
sc.pop();
sc.pop();
}
}