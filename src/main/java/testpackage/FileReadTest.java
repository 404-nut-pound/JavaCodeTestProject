package testpackage;

import static java.util.stream.Collectors.toList;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FileReadTest {

	public static void main(String[] args) throws Throwable {
		Path path = Paths.get(TestClass.class.getResource("/").getPath().substring(1) + "2021-10-26_00-05_004_diff.html");
		
		String[] content = new String(Files.readAllBytes(path), "UTF-8").split("<p>");
		String leftTable = content[1].substring(content[1].indexOf("_id</td>"));
		String rightTable = content[2].substring(content[2].indexOf("_id</td>"));
		
		String regex = "(\\_id<\\/td><td>)(.{24})";
		
		Set<String> leftIdList = new LinkedHashSet<>();
		Set<String> rightIdList = new LinkedHashSet<>();
		
		for(String line : leftTable.replaceAll(regex, "\n$2\n").split("\n")) {
			if(line.length() == 24) {
				leftIdList.add(line);
			}
		}
		System.out.println(leftIdList.size());
		
		for(String line : rightTable.replaceAll(regex, "\n$2\n").split("\n")) {
			if(line.length() == 24) {
				rightIdList.add(line);
			}
		}
		System.out.println(rightIdList.size());
		
		long time1 = System.currentTimeMillis();
		List<String> filteredList = leftIdList.stream().filter(leftId -> !rightIdList.contains(leftId)).collect(toList());
		long time2 = System.currentTimeMillis();
		System.out.println("Stream work time - " + (time2 - time1));
		
		long time3 = System.currentTimeMillis();
		leftIdList.removeAll(rightIdList);
		long time4 = System.currentTimeMillis();
		System.out.println("Collections work time - " + (time4 - time3));
		
		System.out.println(filteredList);
	}
}
