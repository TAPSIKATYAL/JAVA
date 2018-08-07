import java.util.*;
import java.io.*;
class st
{
public static void main(String ar[])  throws IOException
{
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
String s = in.readLine();
int count =1;
int j;
for(int i=1;i<=s.length()+2;i++)
{
j =i-1;
if(s.charAt(i)==s.charAt(j))
{
count++;
}else
{
System.out.printf("%c%d",s.charAt(j),count);
count=1;
}
}
}
}