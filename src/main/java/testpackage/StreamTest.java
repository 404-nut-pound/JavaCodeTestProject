package testpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import org.springframework.core.io.ClassPathResource;

public class StreamTest {
	
	public static void main(String[] args) {
		List<String> nameList = Collections.emptyList();
		
		Map<String, List<String>> nameListMap = new ConcurrentHashMap<>();
		
		try {
			ClassPathResource classPathResource = new ClassPathResource("name_part1.txt");
			
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(classPathResource.getInputStream()));
			
			nameList = bufferedReader.lines().collect(Collectors.toList());
			
			System.out.println(nameList.size());
			
			Set<String> lastNameSet = nameList.stream().map(name -> name.trim().substring(0, 1)).collect(Collectors.toSet());
			
			System.out.println(lastNameSet);
			
			for(String name : nameList) {
				for(String lastName : lastNameSet) {
					if(name.trim().startsWith(lastName)) {
						List<String> tempNameList = nameListMap.get(lastName);
						
						if(tempNameList == null) {
							tempNameList = new ArrayList<String>();
						}
						
						tempNameList.add(name);
						
						nameListMap.put(lastName, tempNameList);
						
						break;
					}
				}
			}
			
			System.out.println(nameListMap);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
