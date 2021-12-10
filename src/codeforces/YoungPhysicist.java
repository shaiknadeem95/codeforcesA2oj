package codeforces;
import java.util.*;

public class YoungPhysicist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long xAxis=0,yAxis=0,zAxis=0;
		long lops=sc.nextLong();
		while(lops-->0)
		{
			xAxis+=sc.nextLong();
			yAxis+=sc.nextLong();
			zAxis+=sc.nextLong();
		}
		if(xAxis==0&& yAxis==0&& zAxis==0)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}

}
