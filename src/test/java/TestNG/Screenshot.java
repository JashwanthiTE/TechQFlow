package TestNG;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class Screenshot {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot TS=(TakesScreenshot)driver;
		File Loginpage= TS.getScreenshotAs(OutputType.FILE);
		File LoginTRG=new File("C:\\Users\\Jeshwanthi\\eclipse-workspace\\TechQFlow\\Screenshots\\Image.jpg");
		FileUtils.copyFile(Loginpage, LoginTRG);
		
	}

}
