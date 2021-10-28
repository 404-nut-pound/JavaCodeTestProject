package springpackage;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.ResourceUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) throws Throwable {
		ConfigurableApplicationContext context = SpringApplication.run(MainApplication.class, args);
		
		log.debug("Hello World!");
		
		ClassPathResource classPathResource = new ClassPathResource("logback-spring.xml");
//		
//		log.debug(StringUtil.lpadAndRpad("File content", "=", 20, true) + "\n{}\n", new String(FileCopyUtils.copyToByteArray(classPathResource.getInputStream()), "UTF-8"));
		
		String resourcePath = classPathResource.getPath();
		String resourceRealPath = ResourceUtils.getFile(resourcePath).getAbsolutePath().toString();
		
		log.debug("File exists - {} / {} / {}", resourcePath, resourceRealPath
										, Files.exists(Paths.get(resourceRealPath), LinkOption.NOFOLLOW_LINKS));
		//File exists - logback-spring.xml / D:\dev\workspace\JavaCodeTestProject\logback-spring.xml / false
	}

}
