package checksum;

import java.io.FileInputStream;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;

public class CheckedStreamTest {

	public static void main(String args[]) throws Throwable {
		byte[] buffer = new byte[1024];
		
		String fileName = "D:/Eclipse/workspace/TestJavaProject/src/com/saltlux/util/sample.txt";
		
		CheckedInputStream cis = new CheckedInputStream(new FileInputStream(fileName), new CRC32());
		
		/* int readLength = */cis.read(buffer);
		
		String readContent = new String(buffer, "UTF-8");
		
		System.out.println(readContent + "\n");
		
		System.out.println("줄 바꿈 나누기 결과 - " + readContent.split("\r\n\r\n")[1]);
		
//		Checksum cksum = cis.getChecksum();
		
		System.out.println(cis.getChecksum().getValue());
		
		cis.close();
	}
}
