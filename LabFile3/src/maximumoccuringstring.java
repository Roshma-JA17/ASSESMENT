import java.util.Scanner;

public class maximumoccuringstring {
    private static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String maxOccStr;
		char maxChar = ' ';
		int i, max = -1;
		int[] charFreq = new int[256];
		
		sc= new Scanner(System.in);

		System.out.print("\nEnter String to find Maximum Char Occurrence =  ");
		maxOccStr = sc.nextLine();
		
		for(i = 0; i < maxOccStr.length(); i++)
		{
			charFreq[maxOccStr.charAt(i)]++;
		}
		for(i = 0; i < maxOccStr.length(); i++) 
		{
			char ch = maxOccStr.charAt(i);
			if(max < charFreq[ch]) {
				max = charFreq[ch];
				maxChar = ch;
			}
		}
		System.out.println("\nThe Maximum Occurring Character = " +  maxChar);
		System.out.format("'%c' Character Occurs %d Times ", maxChar, max);	

		
	}

	}


