package testpackage;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		try {
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
			
			try {
				List<Path> filterPathList = new ArrayList<>();
				
				List<Path> filterDirectoryList = Files.list(Paths.get("C:\\Users\\KHS\\Downloads\\tmp\\filter_data")).collect(Collectors.toList());
				
				for (Path filterDirectoryPath : filterDirectoryList) {
					if (Files.isDirectory(filterDirectoryPath)) {
						List<Path> filterFileList = Files.list(filterDirectoryPath).collect(Collectors.toList());
						
						for (Path filterFilePath : filterFileList) {
							if (filterFilePath.toString().endsWith("csv")) {
								filterPathList.add(filterFilePath);
							}
						}
					}
				}
				
				System.out.println("load done.");
				
				filterPathList.forEach(filterPath -> {
					try {
						StringBuilder sb = new StringBuilder();
						
						Files.lines(filterPath)
							.filter(line -> line.replace(",", "").length() > 0)
							.flatMap(line -> Arrays.asList(line.split(",")[3].split("\\|")).stream())
							.distinct()
							.forEach(condition -> sb.append(condition + "\n"));
						
						FileUtil.writeFile("C:\\Users\\KHS\\Downloads\\tmp", "conditions.txt", sb.toString());
					} catch (Exception e) {
						e.printStackTrace();
					}
				});
				
				System.out.println("write file done.");
				
				StringBuilder sb = new StringBuilder();
				
				Files.lines(Paths.get("C:\\Users\\KHS\\Downloads\\tmp\\conditions.txt"))
					.distinct()
					.sorted()
					.filter(line -> !line.startsWith("비속어"))
					.forEach(line -> sb.append(line + "\n"));
				
				Files.lines(Paths.get("C:\\Users\\KHS\\Downloads\\tmp\\conditions.txt"))
					.distinct()
					.sorted()
					.filter(line -> line.startsWith("비속어"))
					.map(line -> line.substring(line.indexOf("'") + 1, line.lastIndexOf("'")))
					.forEach(line -> sb.append(line + "\n"));
				
				FileUtil.writeFile("C:\\Users\\KHS\\Downloads\\tmp", "conditions_distinct.txt", sb.toString());
				
				System.out.println("distinct done.");
			} catch (Exception e) {
				e.printStackTrace();
			}
			
//			List<String> filterVOList = Files
//					.lines(Paths.get(
//							"D:\\dev\\workspace\\nia-duplecheck\\target\\classes\\filter\\BOHB_2021-12-11_16_file.csv"),
//							Charset.forName("UTF-8"))
//					.filter(line -> !StringUtil.isNullOrEmpty(line.replace(",", ""))).map(line -> line.split(",")[0])
//					.collect(Collectors.toList());
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(String.format("done. %,f", (System.currentTimeMillis() - startTime) / 1000.0));
	}

}
