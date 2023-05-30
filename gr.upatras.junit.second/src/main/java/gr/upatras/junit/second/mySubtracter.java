package gr.upatras.junit.second;

public class mySubtracter {
	
	public static String subtracter(int num1, int num2) {
	    int result = num1 - num2;
	    
	    if (result < 0) {
	        return "NEGATIVE";
	    } else {
	        return "POSITIVE";
	    }
	}
}



