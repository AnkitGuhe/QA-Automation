import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String url = "http://www.demo.guru99.com/V4/";
		String Username= "mngr195228";
		String Pass = "YhYhUhU";
		driver.get(url);
		System.out.println(driver.getTitle());
		driver.findElement(By.name("uid")).sendKeys(Username);	
		driver.findElement(By.name("password")).sendKeys(Pass);
        driver.findElement(By.name("btnLogin")).click();
		
	}

}
