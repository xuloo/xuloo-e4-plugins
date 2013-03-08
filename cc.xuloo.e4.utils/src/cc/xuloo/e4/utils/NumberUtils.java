package cc.xuloo.e4.utils;

import org.apache.commons.lang3.StringUtils;

public class NumberUtils {

	public static String suffix(long number) {

		 // first convert to string if needed 
	    String str = String.valueOf(number);
	    // now we grab the last digit of the number 
	    String lastDigit = StringUtils.right(str, 1);
	    
	    String nextToLast;
	    // if the string is more than 2 chars long, we get 
	    // the second to last character to evaluate 
	    if (str.length() > 1) { 
	    	nextToLast = StringUtils.left(StringUtils.right(str, 2), 1);
	    } else { 
	    	nextToLast = ""; 
	    } 
	    
	    if (lastDigit.equals("1")) {
	    	if (nextToLast.equals("1")) return "th";
	    	return "st";
	    } else if (lastDigit.equals("2")) {
	    	if (nextToLast.equals("1")) return "th";
	    	return "nd";
	    } else if (lastDigit.equals("3")) {
	    	if (nextToLast.equals("3")) return "th";
	    	return "rd";
	    }
	    
	    return "th";
	}
}
