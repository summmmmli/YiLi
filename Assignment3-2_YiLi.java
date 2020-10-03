package assignment3;

public class ReverseTheString {
	public static String reverse(String s) { 
	    
	    String[] swithoutspace = s.trim().split("\\s+"); // delete multiple spaces
	    
	    //System.out.println(swithoutspace.length);
	    
	    String reversestring = "";
	    
	    for (int i = swithoutspace.length - 1; i >= 0; i--) {
	            reversestring = reversestring + swithoutspace[i] + " ";
	    }
	    
	    return reversestring;
	    }
	    
	    public static void main(String[] args) {
	        String test;
	        test = "  the sky  is blue  ";
	     String a = reverse(test);
	     
	     System.out.println(a);
	    }

}
