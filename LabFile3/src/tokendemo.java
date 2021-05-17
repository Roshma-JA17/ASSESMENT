import java.lang.*;
import java.util.*;

public class tokendemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s="10,20,30,40,50";
		   int sum=0;
		   StringTokenizer a=new StringTokenizer(s,",",false);
		   System.out.println("integers are ");
		   while(a.hasMoreTokens())
		    {
		       int b=Integer.parseInt(a.nextToken());
		       sum=sum+b;
		       System.out.println(" "+b);
		     }
		  System.out.println("sum of integers is "+sum);
	}

}
