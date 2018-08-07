import java.util.*;
class cmd
{
   public static void main(String[] arrgs)
	{
		if(arrgs.length>0)
		{
		 System.out.println("The command line arguments are:");
 
                for (int i=0;i<arrgs.length;i++)
                System.out.println(arrgs[i]);
		}
		else
		{
		 System.out.println("No command line arguments are not found");
		}
	}
}