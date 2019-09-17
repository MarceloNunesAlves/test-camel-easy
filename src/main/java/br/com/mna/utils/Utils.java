package br.com.mna.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {

	private static final String[] REPLACES = {"a", "A", "e", "E", "i", "I", "o", "O", "u", "U", "c", "C"};
	private static Pattern[] PATTERNS = new Pattern[12];
	
	static {
		
		PATTERNS[0] = Pattern.compile("[�����]");
		PATTERNS[1] = Pattern.compile("[�����]");
		PATTERNS[2] = Pattern.compile("[����]");
		PATTERNS[3] = Pattern.compile("[����]");
		PATTERNS[4] = Pattern.compile("[����]");
		PATTERNS[5] = Pattern.compile("[����]");
		PATTERNS[6] = Pattern.compile("[�����]");
		PATTERNS[7] = Pattern.compile("[�����]");
		PATTERNS[8] = Pattern.compile("[����]");
		PATTERNS[9] = Pattern.compile("[����]");
		PATTERNS[10] = Pattern.compile("[�]");
		PATTERNS[11] = Pattern.compile("[�]");
		
	}
	
	public static final long toNumber(byte[] p, int off, int len) {
		long ret = 0;
		int done = off + len;
		for (int i = off; i < done; i++)
			ret = ((ret << 8) & 0xffffffff) + (p[i] & 0xff);

		return ret;
	}

	public static final  String toIpAddress(byte[] p, int off, int len) {
		int addr = (int) (Utils.toNumber(p, off, len) & 0xffffffff);
		
		StringBuffer buf = new StringBuffer();
		buf.append(((addr >>> 24) & 0xff)).append('.').append(
				((addr >>> 16) & 0xff)).append('.').append(
				((addr >>> 8) & 0xff)).append('.').append(addr & 0xff);
		return buf.toString();
	}
	
	public static String parseDateToString(Calendar date, String pattern) {
		String str = null;
		if(date != null) {
			DateFormat df = new SimpleDateFormat(pattern);
			str = df.format(date.getTime());
		}
		return str;
	}
	
	public static String parseDateToString(Date date, String pattern) {
		String str = null;
		if(date != null) {
			DateFormat df = new SimpleDateFormat(pattern);
			str = df.format(date.getTime());
		}
		return str;
	}

	public static String replaceSpecial(String text) {
		
		String result = text;
		
		for (int i = 0; i < PATTERNS.length; i++) {
			Matcher matcher = PATTERNS[i].matcher(result);
			result = matcher.replaceAll(REPLACES[i]);
		}
		
		return result;
	}
	
    public static String lpad(String valueToPad, String filler, int size) {  
        while (valueToPad.length() < size) {  
            valueToPad = filler + valueToPad;  
        }  
        return valueToPad;  
    }  
      
    public static String rpad(String valueToPad, String filler, int size) {  
        while (valueToPad.length() < size) {  
            valueToPad = valueToPad+filler;  
        }  
        return valueToPad;  
    }
    
    public static String ultDig(int nod_id) {
    	String ult_dig = String.valueOf(nod_id);
		ult_dig = ult_dig.substring(ult_dig.length()-1, ult_dig.length());
		return ult_dig;
    }

}
