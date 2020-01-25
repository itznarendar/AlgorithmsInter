
 
public class StringRecursiveReversal {
 
    String reverse = "";
     
    public String reverseString(String str){
    int	length=str.length();
    System.out.println(length);
         
        if(str.length() == 1){
            return str;
        } else {
            reverse += str.charAt(str.length()-1)
                    +reverseString(str.substring(0,str.length()-1));
            
           System.out.println("length"+str.length()+"reverse    "+str.charAt(str.length()-1)+",,,,"+str.substring(0,str.length()-1)+"  reverse   "+reverse);
            return reverse;
        }
    }
    void reverse(char str1[], int index, int size)
    {
        char temp; 
        temp = str1[index];
        str1[index] = str1[size - index];
        str1[size - index] = temp;
        if (index == size / 2)
        {
            return;
        }
        reverse(str1, index + 1, size);
    }
    public String reverseStrings(String s){
    	int	length=s.length();
        System.out.println(length);
           
        if (s.length() == 0) 
             return s;

        return reverseString(s.substring(1)) + s.charAt(0);
    }

     
    public static void main(String a[]){
        StringRecursiveReversal srr = new StringRecursiveReversal();
        System.out.println("Result: "+srr.reverseStrings("Java2novice"));
    }
}