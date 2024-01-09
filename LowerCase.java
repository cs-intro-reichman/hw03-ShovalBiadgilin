/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
        String s1=""; 
		char c;
		for (int i=0; i<s.length();i++){ 
			if (s.charAt(i)>=65 && s.charAt(i)<=90){ 
				c= (char)(s.charAt(i)+32);
			} else { 
				c=s.charAt(i);
			} 
			s1=s1+c;
		}
        return s1;
	
    }
}

	
			