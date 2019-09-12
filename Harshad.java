import java.util.HashSet;

public class Harshad {
	
	static int sum(int n)
	{
		int temp=n;
		int max=0;
		while(temp>0)
		{
			int temp1=temp%10;
			max+=temp1;
			temp=temp/10;
		}
		return max;
	}

	public static void main(String args[])
	{
		int limit=100000;
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(1);
		for(int i=2;i<=limit;i++)
		{
			if(i%sum(i)==0)
			{
				hs.add(i);
			}
		}
		System.out.println(hs);
	}
}
