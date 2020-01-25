
public class StringCount {
	

	
	public  void getStringCount(String word)
	{	int arr [] = new int[256];

		for(int i=0;i<word.length();i++)
		{arr[word.charAt(i)]++;
			System.out.println(word.charAt(i)+"    word.charAt(i)      "+arr[word.charAt(i)]);
		}
		char ch[] = new char[word.length()];
		for (int i = 0; i <word.length(); i++) {
			ch[i] = word.charAt(i);
			int find = 0;
			for (int j = 0; j <= i; j++) {

				// If any matches found
				if (word.charAt(i) == ch[j]) 
					find++;			 
			}

			if (find == 1) 
				System.out.println("Number of Occurrence of " +
				word.charAt(i) + " is:" + arr[word.charAt(i)]);		 
		}
	}
	public static void main(String [] args)
	{
		StringCount stringCount=new StringCount();
		
		stringCount.getStringCount("niayya");
	}

}
