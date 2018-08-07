import java.io.*;
class Buffer
{
public static void main(String[] args) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int roll=Integer.parseInt(br.readLine());
int phn=Integer.parseInt(br.readLine());
String name=br.readLine();
System.out.print("Details are \n");
System.out.println(name);
System.out.println(roll);
System.out.println(phn);
}
}

