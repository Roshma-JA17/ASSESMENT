import java.util.Scanner;

public class problem2 {

	public  String getImage (String str) {
		// TODO Auto-generated method stub
		 StringBuffer sbr = new StringBuffer(str);
         sbr.append('|');
         StringBuffer sb = new StringBuffer(str);
         sb.reverse();
         sbr.append(sb);
         return sbr.toString();
  }
  public static void main(String[] args)
  {
         problem2 p = new problem2();
         Scanner s = new Scanner(System.in);
         System.out.println("Enter a String");
         String str = s.next();
         System.out.println(p.getImage(str));
	}

}
