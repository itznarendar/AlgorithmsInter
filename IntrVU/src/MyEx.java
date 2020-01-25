
public class MyEx {
	
	
	public static void PrintDuplicte(int[] numArr)
	{
		for(int i=0;i<numArr.length;i++)
		{
			for(int j=i+1;j<numArr.length;j++)
			{
				if(numArr[i]==numArr[j])
				{
					System.out.println(">>>>>>>> "+numArr[i]);
				}
				
			}
		}
	}
	
	public static void PrintFibo(int num)
	{
		int first=1;
	int second=1;
	for(int i=1;i<=num;i++)
	{
		int fib=first+second;
		first=second;
		second=fib;
		try {
			throw new Exception();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(""+fib);
		}
	
	}
	    public static void main(String args[]){
	    	
	    	
	    	System.out.println(""+0);
	    	System.out.println(""+1);
	    	PrintFibo(100);
	    	int [] tesArr={3,3,6,9,5,1,12,5,20,10,12};
	    	//PrintDuplicte(tesArr);
	    	
	    }
	    
}

	

