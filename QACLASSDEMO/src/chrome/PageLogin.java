package chrome;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class PageLogin {
	WebDriver Demodriver;
	
	
	public PageLogin(WebDriver Demodriver1)
	{
	this.Demodriver= Demodriver1;
	PageFactory.initElements(Demodriver1, this);

	}
//By Nameuser= By.name("username");
//By Password = By.name("password");
//By BtnSub = By.name("SUBMIT");

@FindBy(name="username")
WebElement UserName;

@FindBy(name="password")
WebElement Password;

@FindBy(name="SUBMIT")
WebElement BTNSub;



public WebElement UserName()
{

return UserName;
}
public WebElement Password()
{
return  Password;	
}

public WebElement SubmitBtn()
{
return BTNSub;
}


}
