

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logoutpage 
{
	
	WebDriver driver;
	By logout=By.linkText("Log Out");
	public Logoutpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void clickOnLogout()
	{
		driver.findElement(logout).click();
	}
}
