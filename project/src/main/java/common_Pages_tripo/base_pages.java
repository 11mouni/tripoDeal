package common_Pages_tripo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base_pages {
	public static WebDriver driver;
	public static void openUrl()
	{
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
	}
	
	public static void DriverClose()
	{
		driver.quit();
	}
	
	

}
