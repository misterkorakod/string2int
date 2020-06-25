
public class Stringtoint {
String input;

public String getInt(String input){
	String result = "";
	
	
	for(int x = 0; x < input.length(); x++)
	{
	   char check = input.charAt(x);
	   String C = String.valueOf(check);
	    try {
	        int d = Integer.parseInt(C);
	        
	    } catch (NumberFormatException nfe) {
	        C="";
	    }
	    result += C;
	
	}
	
	return result;
	
}
	
	
}
