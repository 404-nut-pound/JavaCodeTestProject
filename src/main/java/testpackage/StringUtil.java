package testpackage;

/**
 * Util class to control string values
 * 
 * @author KHS
 * @since 2021-10-17
 */
public class StringUtil {

	/**
	 * main method for testing
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String temp = "TEST";
		
		System.out.println(lpad(temp, "=", 20));
		System.out.println(rpad(temp, "=", 20));
		
		System.out.println(lpad(temp, "=", 20, true));
		System.out.println(rpad(temp, "=", 20, true));
		
		System.out.println(lpadAndRpad(temp, "=", 21, true));
		System.out.println(lpadAndRpad(temp, "=", "-", 21, true));
		System.out.println(rpadAndLpad(temp, "-", "=", 21, true));
	}
	
	/**
	 * returns true if inputString is null or its length is 0
	 * 
	 * @param inputString
	 * @return
	 */
	public static boolean isNullOrEmpty(String inputString) {
		return inputString == null ? true : "".equals(inputString) ? true : false;
	}
	
	/**
	 * returns empty string if inputString is null
	 * else returns inputString
	 * 
	 * @param inputString
	 * @return
	 */
	public static String nullToEmpty(String inputString) {
		return (inputString == null ? "" : inputString);
	}
	
	/**
	 * returns empty string if inputString is null
	 * else returns inputString
	 * all returns are trimmed
	 * 
	 * @param inputString
	 * @return
	 */
	public static String nullToEmptyTrim(String inputString) {
		return nullToEmpty(inputString).trim();
	}
	
	
	/**
	 * returns replaceString if inputString is null
	 * else returns inputString
	 * 
	 * @param inputString
	 * @param replaceString
	 * @return
	 */
	public static String nullToString(String inputString, String replaceString) {
		return (inputString == null ? replaceString : inputString);
	}
	
	/**
	 * returns replaceString if inputString is null
	 * else returns inputString
	 * all returns are trimmed
	 * 
	 * @param inputString
	 * @param replaceString
	 * @return
	 */
	public static String nullToStringTrim(String inputString, String replaceString) {
		return nullToString(inputString, replaceString).trim();
	}
	
	
	/**
	 * make left padded string with padString less equal than fullLength
	 * 
	 * @param inputString
	 * @param padString
	 * @param fullLength
	 * @return
	 */
	public static String lpad(String inputString, String padString, int fullLength) {
		if(inputString.length() >= fullLength) {
			return inputString;
		} else {
			StringBuffer sb = new StringBuffer();
			
			for(int i = 0; i < (fullLength - inputString.length()); i++) {
				sb.append(padString);
			}
			
			sb.append(inputString);
			
			return sb.toString();
		}
	}
	
	/**
	 * make left padded string with padString less equal than fullLength
	 * if isWithPadWithSpace is true, insert space between padString and inputString
	 * 
	 * @param inputString
	 * @param padString
	 * @param fullLength
	 * @param isWithPadWithSpace
	 * @return
	 */
	public static String lpad(String inputString, String padString, int fullLength, boolean isWithPadWithSpace) {
		return lpad((isWithPadWithSpace ? " " : "") + inputString, padString, fullLength);
	}
	
	
	/**
	 * make right padded string with padString less equal than fullLength
	 * 
	 * @param inputString
	 * @param padString
	 * @param fullLength
	 * @return
	 */
	public static String rpad(String inputString, String padString, int fullLength) {
		if(inputString.length() >= fullLength) {
			return inputString;
		} else {
			StringBuffer sb = new StringBuffer(inputString);
			
			for(int i = 0; i < (fullLength - inputString.length()); i++) {
				sb.append(padString);
			}
			
			return sb.toString();
		}
	}
	
	/**
	 * make right padded string with padString less equal than fullLength
	 * if isWithPadWithSpace is true, insert space between padString and inputString
	 * 
	 * @param inputString
	 * @param padString
	 * @param fullLength
	 * @param isWithPadWithSpace
	 * @return
	 */
	public static String rpad(String inputString, String padString, int fullLength, boolean isWithPadWithSpace) {
		return rpad(inputString + (isWithPadWithSpace ? " " : ""), padString, fullLength);
	}
	
	
	/**
	 * make left padded string with lpadString then right padded string with rpadString less equal than fullLength
	 * 
	 * @param inputString
	 * @param lpadString
	 * @param rpadString
	 * @param fullLength
	 * @return
	 */
	public static String lpadAndRpad(String inputString, String lpadString, String rpadString, int fullLength) {
		int paddingLength = fullLength - inputString.length();
		int lpadLength, rpadLength;
		
		if((paddingLength % 2) != 0) {
			lpadLength = (int) Math.ceil(paddingLength / 2.0);
			rpadLength = (int) Math.floor(paddingLength / 2.0);
		} else {
			lpadLength = paddingLength / 2;
			rpadLength = paddingLength / 2;
		}
		
		return lpad("", lpadString, lpadLength) + inputString + rpad("", rpadString, rpadLength);
	}
	
	/**
	 * make left padded string with lpadString then right padded string with rpadString less equal than fullLength
	 * if isWithPadWithSpace is true, insert space between padString and inputString
	 * 
	 * @param inputString
	 * @param lpadString
	 * @param rpadString
	 * @param fullLength
	 * @param isWithPadWithSpace
	 * @return
	 */
	public static String lpadAndRpad(String inputString, String lpadString, String rpadString, int fullLength, boolean isWithPadWithSpace) {
		return lpadAndRpad((isWithPadWithSpace ? " " : "") + inputString + (isWithPadWithSpace ? " " : ""), lpadString, rpadString, fullLength);
	}
	
	/**
	 * make left padded string with padString then right padded string with padString less equal than fullLength
	 * 
	 * @param inputString
	 * @param padString
	 * @param fullLength
	 * @return
	 */
	public static String lpadAndRpad(String inputString, String padString, int fullLength) {
		return lpadAndRpad(inputString, padString, padString, fullLength);
	}
	
	/**
	 * make left padded string with padString then right padded string with padString less equal than fullLength
	 * if isWithPadWithSpace is true, insert space between padString and inputString
	 * 
	 * @param inputString
	 * @param padString
	 * @param fullLength
	 * @param isWithPadWithSpace
	 * @return
	 */
	public static String lpadAndRpad(String inputString, String padString, int fullLength, boolean isWithPadWithSpace) {
		return lpadAndRpad((isWithPadWithSpace ? " " : "") + inputString + (isWithPadWithSpace ? " " : ""), padString, padString, fullLength);
	}
	
	
	/**
	 * make right padded string with rpadString then left padded string with lpadString less equal than fullLength
	 * 
	 * @param inputString
	 * @param lpadString
	 * @param rpadString
	 * @param fullLength
	 * @return
	 */
	public static String rpadAndLpad(String inputString, String lpadString, String rpadString, int fullLength) {
		int paddingLength = fullLength - inputString.length();
		int lpadLength, rpadLength;
		
		if((paddingLength % 2) != 0) {
			lpadLength = (int) Math.floor(paddingLength / 2.0);
			rpadLength = (int) Math.ceil(paddingLength / 2.0);
		} else {
			lpadLength = paddingLength / 2;
			rpadLength = paddingLength / 2;
		}

		return lpad("", lpadString, lpadLength) + inputString + rpad("", rpadString, rpadLength);
	}
	
	/**
	 * make right padded string with rpadString then left padded string with lpadString less equal than fullLength
	 * if isWithPadWithSpace is true, insert space between padString and inputString
	 * 
	 * @param inputString
	 * @param lpadString
	 * @param rpadString
	 * @param fullLength
	 * @param isWithPadWithSpace
	 * @return
	 */
	public static String rpadAndLpad(String inputString, String lpadString, String rpadString, int fullLength, boolean isWithPadWithSpace) {
		return rpadAndLpad((isWithPadWithSpace ? " " : "") + inputString + (isWithPadWithSpace ? " " : ""), lpadString, rpadString, fullLength);
	}
	
	/**
	 * make right padded string with padString then left padded string with padString less equal than fullLength
	 * 
	 * @param inputString
	 * @param padString
	 * @param fullLength
	 * @return
	 */
	public static String rpadAndLpad(String inputString, String padString, int fullLength) {
		return rpadAndLpad(inputString, padString, padString, fullLength);
	}
	
	/**
	 * make right padded string with padString then left padded string with padString less equal than fullLength
	 * if isWithPadWithSpace is true, insert space between padString and inputString
	 * 
	 * @param inputString
	 * @param padString
	 * @param fullLength
	 * @param isWithPadWithSpace
	 * @return
	 */
	public static String rpadAndLpad(String inputString, String padString, int fullLength, boolean isWithPadWithSpace) {
		return rpadAndLpad((isWithPadWithSpace ? " " : "") + inputString + (isWithPadWithSpace ? " " : ""), padString, padString, fullLength);
	}

}
