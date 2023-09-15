import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoggingPrac {
	
	Logger log = LogManager.getLogger(LoggingPrac.class);

	public static void main(String[] args) {
		
		
		System.out.println("facebook log in is success");
		
		
		System.out.println("facebook account creation is success");
		
WebDriver driver = new EdgeDriver();
		
		WebDriverManager.edgedriver().setup();
		
		System.out.println("browser invocation is success");
		driver.manage().window().maximize();
		
		System.out.println("window got maximized");
		
		driver.get("https://facebook.com");
		
		System.out.println("url got hit");
		

	}
	
	
	public void login()
	{
		
		
		
	}

}
