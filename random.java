import java.util.Random;
class Number
{
public static void main(String args[])
{
int max=26;
int min=1;
int i,t=0;
char a;
Random ran=new Random();
int num = min+ ran.nextInt(max);
System.out.println((char)(64+num));
num=num+2;
int key=(num/3)+1;
if(num==21||num==28)
key--;
System.out.println(key);
}
}
