import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExample {
	
	public static void main(String[] args) 
	{
	     
	    Pattern pattern = Pattern.compile("^(.+)@example.com$");
	    Pattern pattern2=Pattern.compile("[a](.+)@example.com$");
	    Pattern pattern3=Pattern.compile("[a](.+)@example.com$");
	    // Input list
	    List<String> emails = Arrays.asList("alex@example.com", "bob@yahoo.com", 
	                        "cat@google.com", "david@example.com");
	      
	    for(String email : emails)
	    {
	        Matcher matcher = pattern2.matcher(email);
	         
	        if(matcher.matches()) 
	        {
	            System.out.println(email);
	        }
	    }
	}

}
