package testpackage;

import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class TestClass {

	public static void main(String[] args) throws Throwable {
		String[] stringArray = new String[] {"1", "2"};
		
		for(String children : stringArray) {
			System.out.println(children);
		}
		
		System.out.println();
		
		List<String> stringList = Arrays.asList(stringArray);
		
		for(String children : stringList) {
			System.out.println(children);
		}
		
		System.out.println();
		
		String[] secondStringArray = stringList.toArray(new String[stringList.size()]);
		
		for(String children : secondStringArray) {
			System.out.println(children);
		}
		
		StringBuffer sb = new StringBuffer();
		
		sb.append(stringList);
		
		System.out.println(sb.toString());
		
//		System.out.println(new Date().toLocaleString());
//		System.out.println("블레이드  소울2".split(" ").length);
		
		// 데이터 암호화 (중복 방지) 
//		StringBuffer hashingDataString = new StringBuffer();
//		hashingDataString.append(temp.get("product_name").toString());
//		if(temp.get("pr_code") != null) {
//			hashingDataString.append(temp.get("pr_code").toString());
//		}
//		hashingDataString.append(temp.get("category_code").toString());
//		hashingDataString.append(temp.get("key_path").toString());
//		hashingDataString.append(temp.get("value").toString());
		
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis() - 86400000)));
		System.out.println(LocalDate.now());
		
	}
	
	public static String hashing(String data) {
		try{
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			byte[] hash = digest.digest(data.getBytes("UTF-8"));
			StringBuffer hexString = new StringBuffer();
			
			for (int i = 0; i < hash.length; i++) {
				String hex = Integer.toHexString(0xff & hash[i]);
				if(hex.length() == 1) hexString.append('0');
				hexString.append(hex);
			}
			
			return hexString.toString();
			
		} catch(Exception ex){
			throw new RuntimeException(ex);
		}
	}
}
