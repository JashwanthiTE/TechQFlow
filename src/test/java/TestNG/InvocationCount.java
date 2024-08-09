package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class InvocationCount {
	@Test(invocationCount=4,invocationTimeOut = 100000)
	//@Test(invocationCount=4,threadPoolSize = 2)
	public void test() throws InterruptedException
	{
		WebDriver driver= new EdgeDriver();
		driver.get("https://randomuser.me/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[@data-label='name']")).click();
		System.out.println("Username : " + driver.findElement(By.id("user_value")).getText());
		driver.findElement(By.xpath("//li[@data-label='email']")).click();
		System.out.println("Email : " + driver.findElement(By.id("user_value")).getText());
	}

}
