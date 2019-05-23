package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String Url=("http://www.ezhrs.com/project1/potdb/login.asp");
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ankit\\Desktop\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get(Url);
	System.out.println("load web page");
	String User = "admin.admin";
	String pass = "welcome";
String Nameuser="username";
String Passwd= "password";
String BtnSub = "SUBMIT";
String Select = "POopco";
String XpathBtn="/html/body/table[1]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/div/form/table/tbody/tr/td[2]/table[2]/tbody/tr/td/div[3]/div/table/tbody/tr[2]/td/div/table/tbody/tr[5]/td[2]/b/input";
String XpathCreatePo= "/html/body/table[1]/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody[1]/tr/td/table[3]/tbody/tr/td/div/table/tbody/tr/td[2]/div/table/tbody/tr/td/table/tbody/tr/td";
String LoginAgain= "/html/body/table/tbody/tr[1]/td/div/table/tbody/tr/td/table/tbody/tr/td/div/form/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td[2]/b/a";




driver.findElement(By.name(Nameuser)).sendKeys(User);
driver.findElement(By.name(Passwd)).sendKeys(pass);
driver.findElement(By.xpath(XpathBtn)).click();	
driver.findElement(By.linkText("Create PO")).click();	
Select oSelect = new Select(driver.findElement(By.name("POopco")));
oSelect.selectByValue("VCVmcm");

}
	
}