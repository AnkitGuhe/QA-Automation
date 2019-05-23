package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PagePO {
	WebDriver Demodriver;
	
	
	public PagePO(WebDriver Demodriver1)
	{
	this.Demodriver= Demodriver1;

	}

By Link= By.linkText("Create PO");

public WebElement Pageclick()
{
return Demodriver.findElement(Link); 

}
}