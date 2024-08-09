package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class AnnotationAndPriority {
	WebDriver driver;
	@Test(priority=1)
	void OpenApp()
	{
		driver= new EdgeDriver();
		driver.get("https://demo.guru99.com/v4/");
		driver.manage().window().maximize();
		
	}
	@Test(priority=2)
	void Login()
	{
		driver.findElement(By.name("uid")).sendKeys("mngr564832");
		driver.findElement(By.name("password")).sendKeys("panUrEj");
		driver.findElement(By.name("btnLogin")).click();
	}
	@Test(priority=3)
	void Search()
	{
		System.out.println("This is to search");
	}
	@Test(priority=4)
	void CloseApp()
	{
		driver.close();
	}
	
}
