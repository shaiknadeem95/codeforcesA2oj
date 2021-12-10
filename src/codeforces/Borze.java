package codeforces;
import java.util.*;

public class Borze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String inputString=sc.nextLine().trim();
		String result="";
		for(int i=0;i<inputString.length();)
		{
			String index=inputString.charAt(i)+"";
			if(index.equals("."))
			{
				result+="0";
				i++;
			}
			else
			{
				index=inputString.substring(i,i+2);
				if(index.equals("-."))
				{
					result+="1";
					//i++;
				}
				else
				{
					result+="2";
				}
				i=i+2;
			}
		}
		System.out.println(result);
	}

}
