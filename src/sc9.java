import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class sc9 {
	static {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	}
	@Test
	public static void m() throws InterruptedException, AWTException

	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		driver.navigate().to("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung m20",Keys.ENTER);;
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class=\"a-button-text a-declarative\"]")).click();
		driver.findElement(By.id("s-result-sort-select_1")).click();
		driver.findElement(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]")).click();
		Thread.sleep(2000);
		//WebElement ele = driver.findElement(By.xpath("//span[@class=\"a-size-medium a-color-success\"]"));
		//Thread.sleep(2000);
		//System.out.println(ele.getText());
		driver.findElement(By.xpath("//input[@id=\"buy-now-button\"]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("srrana1710@gmail.com",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("9438533819", Keys.ENTER);
		Thread.sleep(2000);
		
		
		
		
		
		

}
}
