import java.util.*;

public class Dictionary {
	
	public static ArrayList<String> filter(ArrayList<String> dictionary,String search)
	{
		Iterator itr=dictionary.iterator();
		ArrayList<String> res=new ArrayList<String>();
		while(itr.hasNext())
		{
			String temp=(String)itr.next();
			if(temp.length()>=search.length()&&search.equals(temp.substring(0,search.length())))
			{
				res.add(temp);
			}
		}
		return res;
	}
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	ArrayList<String> dictionary=new ArrayList<String>();
    	System.out.println("Enter the number of strings in dictionary");
    	int n=sc.nextInt();
    	System.out.println("Enter the strings of dictionary");
    	for(int i=0;i<n;i++)
    	{
    		dictionary.add(sc.next());
    	}
    	System.out.println("Enter the word for autocorrection");
    	String search;
    	search=sc.next();
    	if(search.length()>=3)
    	{
    		System.out.println(filter(dictionary,search).toString());
    	}
    	sc.close();
    }
}
