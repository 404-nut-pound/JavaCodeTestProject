package testpackage;

import java.nio.file.Paths;
import java.security.MessageDigest;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.regex.Pattern;

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
//		System.out.println("홈페이지1224매장위치 1호점 경기도 군포시 산본동 9141 지하1층2호점 수원시 팔달구 덕영대로 899 지하1층페이스북 1000(전화번호)네이버카페 인스타그램 1201영상제보 및 출연요청 12".split(" ").length);
//		System.out.println("홈페이지1224매장위치 1호점 경기도 군포시 산본동 9141 지하1층2호점 수원시 팔달구 덕영대로 899 지하1층페이스북 1000(전화번호)네이버카페 인스타그램 1201영상제보 및 출연요청 12".replaceAll("\\s{2,}", " ").split(" ").length);
		
//		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis() - 86400000)));
//		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
//		System.out.println(LocalDateTime.now());
		
//		System.out.println(String.format("%s 번째 파일에 다음과 같은 오류가 있습니다.\n%s\n%.03f", 1, "정말 우려스러운 상황이군요.", 12323.123));
//		
//		System.out.println("12345".charAt(2));
//		
//		System.out.println("역시 중은 모닝.근데 씬님 썬크림은 안 바르시나요 그리고 목에 파데 바르면 옷에 안 묻어요 이리저리 돌리면 묻을 것 같은데.".replace(".", " "));
//		
//		List<String> tempList = Arrays.asList("1", "2", "3", "4");
//		
//		System.out.println(tempList.subList(1, tempList.size()));
//		
//		System.out.println("Processor count - " + Runtime.getRuntime().availableProcessors());
//		
//		System.out.println(Pattern.matches(".*(\\d|[a-zA-Z]){15,}.*", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"));
		
//		List<String> tempList = Arrays.asList("가나다라", "가", "가나", "가나다");
		
//		System.out.println(tempList);
//		System.out.println(tempList.sort(Comparator.reverseOrder()));
		
//		System.out.println(600.0 / 1 >= 600);
		
//		System.out.println("\\u00001234".replaceAll("\\\\u\\d{4}", ""));
		
//		String temp = "비속어 re.compile('이기야') 치환";
//		
//		System.out.println(temp.substring(temp.indexOf("'") + 1, temp.lastIndexOf("'")));
		
//		System.out.println("10:50".replaceAll("([0-9-]+:[0-9-]+)", "A"));
		
//		try {
//			List<String> fileList = Files.lines(Paths.get("/data_bak2/load_tmp/inno.txt"))
//										.collect(Collectors.toList());
//			
//			List<Path> depth1PathList = Files.list(Paths.get("/data_bak2/part2_review_02_name_mask"))
//											.filter(path -> Files.isDirectory(path))
//											.collect(Collectors.toList());
//			
//			List<String> movedList = Files.list(Paths.get("/data_bak2/load_tmp/inno"))
//										.map(path -> path.getFileName().toString())
//										.collect(Collectors.toList());
//			
//			for(Path depth1Path : depth1PathList) {
//				List<Path> depth2PathList = Files.list(depth1Path)
//												.filter(path -> fileList.contains(path.getFileName().toString())
//																&& !movedList.contains(path.getFileName().toString()))
//												.collect(Collectors.toList());
//				
//				System.out.println("Target files - " + depth2PathList.size());
//				
//				for(Path depth2Path : depth2PathList) {
//					try {
//						Files.copy(depth2Path
//								, Paths.get("/data_bak2/load_tmp/inno" + File.separator + depth2Path.getFileName().toString())
//								, StandardCopyOption.REPLACE_EXISTING);
//					} catch(Exception e) {
//						e.printStackTrace();
//					}
//				}
//			}
//			
//			System.out.println("done.");
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
		
//		System.out.println("".split(" ").length);
		
//		System.out.println(Pattern.matches("(19|20)[0-9]{2}(-|/|\\.)?[0-1][0-9](-|/|\\.)?[0-3][0-9]", "2020.08.25"));
//		System.out.println("문화는 文化".replaceAll("[^\\(\\),\\.\\w\\s가-힣]+", ""));
//		System.out.println(Pattern.matches("", "'30년'도 되지 않았지만 인터넷의 개발과 보급은 우리의 삶을 엄청나게 바꾸어 놓았습니다."));
//		System.out.println("1:19:57 다시봐도 너무 웃겨욬 뜯자마자 도도 달려 들어오는겈".replaceAll("([0-9]{1,2}:)?[0-9]{1,2}:[0-9]{1,2}", ""));
		
//		System.out.println(Paths.get("C:\\Users\\KHS\\Downloads\\tmp").getFileName());
//		
//		System.out.println(String.format("%,.03f", 1234567890.123456));
		
		System.out.println("done.");
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
