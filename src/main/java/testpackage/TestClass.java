package testpackage;

import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class TestClass {

	public static void main(String[] args) throws Throwable {
//		String[] stringArray = new String[] {"1", "2"};
//		
//		for(String children : stringArray) {
//			System.out.println(children);
//		}
//		
//		System.out.println();
//		
//		List<String> stringList = Arrays.asList(stringArray);
//		
//		for(String children : stringList) {
//			System.out.println(children);
//		}
//		
//		System.out.println();
//		
//		String[] secondStringArray = stringList.toArray(new String[stringList.size()]);
//		
//		for(String children : secondStringArray) {
//			System.out.println(children);
//		}
//		
//		StringBuffer sb = new StringBuffer();
//		
//		sb.append(stringList);
//		
//		System.out.println(sb.toString());
//		
//		System.out.println(new Date().toLocaleString());
//		System.out.println("블레이드  소울2".split(" ").length);
		
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis() - 86400000)));
		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		
		System.out.println(String.format("%s 번째 파일에 다음과 같은 오류가 있습니다.\n%s", 1, "정말 우려스러운 상황이군요."));
		
		System.out.println("12345".charAt(2));
		
		System.out.println("역시 중은 모닝.근데 씬님 썬크림은 안 바르시나요 그리고 목에 파데 바르면 옷에 안 묻어요 이리저리 돌리면 묻을 것 같은데.".replace(".", " "));
		
		List<String> tempList = Arrays.asList("1", "2", "3", "4");
		
		System.out.println(tempList.subList(1, tempList.size()));
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
