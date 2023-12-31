package common_Pages_tripo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class login_page extends base_pages {
	//xpath
	static By from = By.xpath("//div[@data-testid='to-testID-origin']//input[@type='text']");
	static By to = By.xpath("//div[@data-testid='to-testID-destination']//input[@type='text']");
    static By ToSc = By.xpath("//div[text()='DHM']");
	
    static By depart = By.xpath("//div[text()='Departure Date']");
	static By depDate = By.xpath("//div[@class='css-1dbjc4n r-18u37iz']//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73']//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']");
	static By passenger = By.xpath("//div[normalize-space()='Passengers']");
	
	
	
	
	//Webelement
	public static WebElement from()
	{
		return driver.findElement(from);	
	}
	
	public static WebElement tO()
	{
		return driver.findElement(to);
	}
	
	public static WebElement toS()
	{
		return driver.findElement(ToSc);	
	}
	
	public static WebElement dePart()
	{
		return driver.findElement(depart);
	}
	
	public static WebElement depdate()
	{
		return driver.findElement(depDate);
	}
	
	public static WebElement Ppassenger()
	{
		return driver.findElement(passenger);
		
	}
	

	
	
	//action 
	public static void giveFrom()
	{
		from().sendKeys("agra");
	}
	
	public static void giveTo()
	{
		tO().click();		
	}
	
	public static void toSC()
	{
		toS().click();		
	}
	
	public static void DeparT()
	{
		dePart().click();
	}
	
	public static void departDatE()
	{
		depdate().click();
	}
	
	public static void PassengeR()
	{
		Ppassenger().click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("windows.scrollBy(0,200)");
	}
	
//	public static void scrolling()
//	{
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("windows.scrollBy(0,200)");
//	}
//	

	
	
}
