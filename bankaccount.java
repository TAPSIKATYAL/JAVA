import java.lang.*;
import java.util.*;
import java.io.*;
class Bankaccount
{
int acc,bal,amt;
Bankaccount(int acc,int bal,int amt)
{
this.acc=acc;
this.bal=bal;
this.amt=amt;
}
void getCredit()
{
this.bal=bal+amt;
System.out.printf("Balance after credit is %d",bal);
}
void getDebit()
{
this.bal=bal-amt;
if(bal<500)
{
System.out.println("Insufficient balance");
}
else
{
System.out.printf("Your balance after debit is %d",bal);
}
}
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter account number");
int acc=Integer.parseInt(br.readLine());
System.out.println("Enter Amount to add in Account");
int bal=Integer.parseInt(br.readLine());
if(bal>=500)
{
System.out.println("Enter Amount To Credit or Debit");
int amt=Integer.parseInt(br.readLine());
Bankaccount bank=new Bankaccount(acc,bal,amt);
System.out.println("Enter choice 1 to Credit and 2 to Debit");
int choice=Integer.parseInt(br.readLine());
switch(choice)
{
case 1:bank.getCredit();break;
case 2:bank.getDebit();break;
}
}
else
{
System.out.print("Minimum Amount should be 500");
}
}
};