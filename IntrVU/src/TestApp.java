import java.util.HashMap;

public class TestApp {

	static final HashMap map=new HashMap();
	String s="DDD";
	String s1=new String("ADF");
//	s="g";
	
	public void print(String x)
	{String []root=x.split(" ");
	char[] rev = null;
	
	String afterrev="";
	for(int i=0;i<root.length;i++){
		String revWord="";
		
	rev=root[i].toCharArray();
		for(int j=rev.length-1;j>=0;j--){
			revWord+=rev[j];	
		}
		afterrev+=revWord+" ";	
	}
	
	
	
		s=x;
	s1=x;
	System.out.println(s+"   "+s1+"   deeeeeeeeeeeeeeeee    >>> "+afterrev);	
	}
	
	
	

	public static void main(String[]args)
	{
		map.put("x","1");
		map.put("x", "2");
		//map=new HashMap<>();
		
		TestApp t=new TestApp();
		t.print("how are you");
		System.out.println("gf");
		System.out.println(t.s.toLowerCase()+map.get("x"));
	}
	
}
