

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Mainpage 
{
	WebDriver driver;
	By myacc=By.linkText("My Account");
	public Mainpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void clickOnMyacc()
	{
		driver.findElement(myacc).click();
	}
}
