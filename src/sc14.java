import java.util.List;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class sc14 {
	static {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	}

	@Test
	public static void m() throws InterruptedException, AWTException

	{

		WebDriver driver = new ChromeDriver();// casting
		driver.manage().window().maximize();// maximize the browser window
		Actions a = new Actions(driver);
		driver.navigate().to("https://www.bluestone.com/");

		WebElement ele = driver.findElement(By.xpath("//li[@class='menuparent gold-coins']"));
		a.moveToElement(ele).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[@data-p='gold-coins-weight-1gms,m']")).click();

		Thread.sleep(2000);

		driver.close();
	}
}