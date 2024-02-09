package firsttestcode;

import java.util.Scanner;

public class Problem1_string {

	/*Method1:Using string builder and character methods*/
	public String printfreq(String s)
	{
		StringBuilder str =new StringBuilder();
		int count_occ =1;
		char let;
		for(int i=0;i<s.length();i+=2)
		{
			let =s.charAt(i);
			count_occ=Character.getNumericValue(s.charAt(i+1));
			for(int j=0;j<count_occ;j++)
			{
				str.append(let);
			}
		}
		
		String result =str.toString();
		return result;
	}
   /*Method2:Using stringbuilder to separate the digits and letters*/
	public void printletfreq(String s) {
	    StringBuilder digitsBuilder = new StringBuilder();
	    StringBuilder lettersBuilder = new StringBuilder();

	    for (int i = 0; i < s.length(); i++) {
	        char c = s.charAt(i);
	        if (Character.isDigit(c)) {
	            digitsBuilder.append(c);
	        } else {
	            lettersBuilder.append(c);
	        }
	    }

	    String digits = digitsBuilder.toString();
	    String letters = lettersBuilder.toString();

	    int count = 0;
	    char ch;
	    for (int i = 0; i < letters.length(); i++) {
	        ch = letters.charAt(i);
	        if (i < digits.length()) {
	            count = Character.getNumericValue(digits.charAt(i));
	        } else {
	            count = 1; // If there are no more digits, default count to 1
	        }
	        for (int j = 0; j < count; j++) {
	            System.out.print(ch);
	        }
	    }
	    System.out.println(); 
	}

	public static void main(String[] args) {
		Problem1_string prob1 = new Problem1_string();
		Scanner sca =new Scanner(System.in);
		String str =sca.nextLine();
		/*String output=prob1.printfreq(str);*/
		prob1.printletfreq(str);
        /*System.out.println(output);*/
        sca.close();
	}
}
