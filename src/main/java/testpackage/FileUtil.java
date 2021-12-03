package testpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor
public class FileUtil {

	/**
	 * read file content with input charset
	 * 
	 * @param filePath
	 * @param fileName
	 * @param charset default UTF-8
	 * @return
	 * @throws Exception 
	 */
	public static String readFile(String filePath, String fileName, String charset) throws Exception {
		if(StringUtil.isNullOrEmpty(filePath) || StringUtil.isNullOrEmpty(fileName)) {
			throw new Exception("Empty parameter input!!!");
		}
		
		StringBuffer sb = new StringBuffer();
		
		charset = StringUtil.nullToString(charset, "UTF-8");
		
		Path fullPath = Paths.get(filePath + (filePath.endsWith(File.separator) ? "" : File.separator) + fileName);
		
		if(Files.exists(fullPath)) {
			if(Files.isReadable(fullPath)) {
				try {
					sb.append(new String(Files.readAllBytes(fullPath), charset));
				} catch(Exception e) {
					log.error(e.getMessage(), e);
				} finally {
				}
			} else {
				throw new SecurityException();
			}
		} else {
			throw new FileNotFoundException();
		}
		
		return sb.toString();
	}
	
	/**
	 * write file content
	 * 
	 * @param filePath
	 * @param fileName
	 * @param inputString
	 * @throws Exception 
	 */
	public static void writeFile(String filePath, String fileName, String inputString) throws Exception {
		if(StringUtil.isNullOrEmpty(filePath) || StringUtil.isNullOrEmpty(fileName) || StringUtil.isNullOrEmpty(inputString)) {
			throw new Exception(String.format("Empty parameter input!!!\nFilePath - %s\nFileName - %s\nInputString - %d"
												, filePath, fileName, inputString.length())
					);
		}
		
		Path dirPath = Paths.get(filePath)
				, fullPath = Paths.get(filePath + (filePath.endsWith(File.separator) ? "" : File.separator) + fileName);
		
		if(!Files.isDirectory(dirPath)) {
			Files.createDirectories(dirPath);
		}
		
		if(Files.isWritable(dirPath)) {
			try {
				Files.write(fullPath, inputString.getBytes(), StandardOpenOption.CREATE);
			} catch (Exception e) {
				log.error(e.getMessage(), e);
			} finally {
			}
		} else {
			throw new SecurityException(String.format("CANNOT WRITE FILE - %s", dirPath.toString()));
		}
	}
	
	/**
	 * @param fileName
	 * @return fileName.substring(0, fileName.lastIndexOf("."));
	 */
	public static String getFileBaseName(String fileName) {
		return fileName.substring(0, fileName.lastIndexOf("."));
	}
	
	/**
	 * 
	 * @param fileName
	 * @return fileName.substring(fileName.lastIndexOf(".") + 1);
	 */
	public static String getFileExtension(String fileName) {
		return fileName.substring(fileName.lastIndexOf(".") + 1);
	}
	
}
