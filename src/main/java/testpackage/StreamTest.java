package testpackage;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
//		try {
//			List<String> nameList = Collections.emptyList();
//			
//			Map<String, List<String>> nameListMap = new ConcurrentHashMap<>();
//			
//			try {
//				ClassPathResource classPathResource = new ClassPathResource("name_part1.txt");
//				
//				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(classPathResource.getInputStream()));
//				
//				nameList = bufferedReader.lines().collect(Collectors.toList());
//				
//				System.out.println(nameList.size());
//				
//				Set<String> lastNameSet = nameList.stream().map(name -> name.trim().substring(0, 1)).collect(Collectors.toSet());
//				
//				System.out.println(lastNameSet);
//				
//				for(String name : nameList) {
//					for(String lastName : lastNameSet) {
//						if(name.trim().startsWith(lastName)) {
//							List<String> tempNameList = nameListMap.get(lastName);
//							
//							if(tempNameList == null) {
//								tempNameList = new ArrayList<String>();
//							}
//							
//							tempNameList.add(name);
//							
//							nameListMap.put(lastName, tempNameList);
//							
//							break;
//						}
//					}
//				}
//				
//				System.out.println(nameListMap);
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
			
//			try {
//				List<Path> filterPathList = new ArrayList<>();
//				
//				List<Path> filterDirectoryList = Files.list(Paths.get("C:\\Users\\KHS\\Downloads\\tmp\\filter_data")).collect(Collectors.toList());
//				
//				for (Path filterDirectoryPath : filterDirectoryList) {
//					if (Files.isDirectory(filterDirectoryPath)) {
//						List<Path> filterFileList = Files.list(filterDirectoryPath).collect(Collectors.toList());
//						
//						for (Path filterFilePath : filterFileList) {
//							if (filterFilePath.toString().endsWith("csv")) {
//								filterPathList.add(filterFilePath);
//							}
//						}
//					}
//				}
//				
//				System.out.println("load done.");
//				
//				filterPathList.forEach(filterPath -> {
//					try {
//						StringBuilder sb = new StringBuilder();
//						
//						Files.lines(filterPath)
//							.filter(line -> line.replace(",", "").length() > 0)
//							.flatMap(line -> Arrays.asList(line.split(",")[3].split("\\|")).stream())
//							.distinct()
//							.forEach(condition -> sb.append(condition + "\n"));
//						
//						FileUtil.writeFile("C:\\Users\\KHS\\Downloads\\tmp", "conditions.txt", sb.toString());
//					} catch (Exception e) {
//						e.printStackTrace();
//					}
//				});
//				
//				System.out.println("write file done.");
//				
//				StringBuilder sb = new StringBuilder();
//				
//				Files.lines(Paths.get("C:\\Users\\KHS\\Downloads\\tmp\\conditions.txt"))
//					.distinct()
//					.sorted()
//					.filter(line -> !line.startsWith("비속어"))
//					.forEach(line -> sb.append(line + "\n"));
//				
//				Files.lines(Paths.get("C:\\Users\\KHS\\Downloads\\tmp\\conditions.txt"))
//					.distinct()
//					.sorted()
//					.filter(line -> line.startsWith("비속어"))
//					.map(line -> line.substring(line.indexOf("'") + 1, line.lastIndexOf("'")))
//					.forEach(line -> sb.append(line + "\n"));
//				
//				FileUtil.writeFile("C:\\Users\\KHS\\Downloads\\tmp", "conditions_distinct.txt", sb.toString());
//				
//				System.out.println("distinct done.");
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
			
//			List<String> filterVOList = Files
//					.lines(Paths.get(
//							"D:\\dev\\workspace\\nia-duplecheck\\target\\classes\\filter\\BOHB_2021-12-11_16_file.csv"),
//							Charset.forName("UTF-8"))
//					.filter(line -> !StringUtil.isNullOrEmpty(line.replace(",", ""))).map(line -> line.split(",")[0])
//					.collect(Collectors.toList());
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
		
//		try {
//			Map<String, Integer> regexpMap = new ConcurrentHashMap<>();
//			
//			List<Path> depth1PathList = Files.list(Paths.get("."))
//					.filter(path -> Files.isDirectory(path))
//					.collect(Collectors.toList());
//			
//			for(Path depth1Path : depth1PathList) {
//				System.out.println(depth1Path.toAbsolutePath().toString());
//				Files.list(depth1Path)
//				.filter(path -> path.getFileName().toString().endsWith("json"))
////				.parallel()
//				.forEach(path -> {
//					try {
//						String fileContent = FileUtil.readFile(path.getParent().toString(), path.getFileName().toString(), "UTF-8");
//						
//						if(!StringUtil.isNullOrEmpty(fileContent)) {
////							Matcher matcher = Pattern.compile("&(#[0-9]+|[a-zA-Z]+);").matcher(fileContent);
//							Matcher matcher = Pattern.compile("<(\\/|!--)?[a-zA-Z][^>가-힣]*>").matcher(fileContent);
//							
//							while(matcher.find()) {
//								String matchedStr = matcher.group().split(" ")[0];
//								
//								Integer matchedCnt = (regexpMap.get(matchedStr) == null ? 0 : regexpMap.get(matchedStr));
//								
//								regexpMap.put(matchedStr, ++matchedCnt);
//							}
//						}
//					} catch(Exception e) {
//						e.printStackTrace();
//					}
//				});
//			}
//			
//			StringBuilder sb = new StringBuilder();
//			
//			regexpMap.forEach((k, v) -> sb.append(k + "\t" + v + "\n"));
//			
////			System.out.println(sb.toString());
////			FileUtil.writeFile(".", "amp_list.txt", sb.toString());
//			FileUtil.writeFile(".", "tag_list.txt", sb.toString());
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
		
		try {
			Stream<String> lines = Files.lines(Paths.get("C:\\Users\\KHS\\Downloads\\tmp\\amp_list.txt"));
			
			lines.forEach(line -> {
				
				
			});
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(String.format("done with %,.03f secs.", (System.currentTimeMillis() - startTime) / 1000.0));
	}

}
