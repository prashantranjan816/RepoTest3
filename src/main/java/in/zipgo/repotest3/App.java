package in.zipgo.repotest3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class App 
{
   @Test
	public void abc() {
		System.out.println("ABC running...");
		
	}
   
   
   
   @Test
   public void abc1() {
	   System.out.println("ABC1 running...");
	   
	   WebDriver driver = new ChromeDriver();
	   driver.get("http://www.google.com");
	   driver.quit();
	   System.out.println("Browser has close");
	   System.out.println("Browser has close");
	   System.out.println("Browser has close");
	   System.out.println("Browser has close");
	   
   }
	
}
