import java.util.*;

public class Stocks {
	
	static double avgPrice(ArrayList<Double> price)
	{
		double avg=0;
		for(int i=0;i<price.size();i++)
		{
			avg+=price.get(i);
		}
		return avg/price.size();
	}
    static HashMap<String,Integer> peak(ArrayList<Double> avgPrices,int x,Double y)
    {
    	double minProfit=y;
    	double maxProfit=y;
    	HashMap<String,Integer> hm=new HashMap<String,Integer>();
    	hm.put("max",-1);
    	hm.put("min",-1);
    	hm.put("equal",-1);
    	for(int i=0;i<x;i++)
    	{
    	   Double temp=avgPrices.get(i);
    	   if(maxProfit<temp)
    	   {
    		   hm.put("max",(i+1));
    	   }
    	   if(minProfit>temp)
    	   {
    		   hm.put("min",(i+1));
    	   }
    	   if(y.equals(temp))
    	   {
    		   hm.put("equal",(i+1));
    	   }
    	}
    	return hm;
    }
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<ArrayList<Double>> prices = new ArrayList<ArrayList<Double>>();
		ArrayList<Double> avgPrices = new ArrayList<Double>();
		System.out.println("Enter the number of stocks");
		int x=sc.nextInt();
		double y=sc.nextDouble();
		for(int i=0;i<30;i++)
		{
		   System.out.println("Enter the prices of stocks of Day "+(i+1));
		   prices.add(i, new ArrayList<Double>());
		   for(int j=0;j<x;j++)
		   {
			   prices.get(i).add(sc.nextDouble());
		   }
		   avgPrices.add(avgPrice(prices.get(i)));
		}
		HashMap<String,Integer> hm=peak(avgPrices,x,y);
		System.out.println("The Day at Max Profit "+hm.get("max"));
		System.out.println("The Day at Max Loss "+hm.get("min"));
		System.out.println("The Day at No loss No profit "+hm.get("equal"));
	}
}
