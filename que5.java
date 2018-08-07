import java.util.*;
class five
{
public static void main(String args[])
{
Scanner sc =new Scanner (System.in);
        int k=sc.nextInt();
        int a[]={2,1,38,5,4};
        for(int i=0;i<a.length;i++)
        {
            Arrays.sort(a);
        }
        for(int i=a.length-k;i>0;i++)
        {
            System.out.println(a[i]);
            break;
        }
}
}