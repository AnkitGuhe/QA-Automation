import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args)
	{

			System.setProperty("webdriver.chrome.driver","C:\\Users\\ankit\Desktop\\chromedriver.exe");
			WebDriver Driver= new ChromeDriver();
			Driver.get("http://www.google.com");
		System.out.println(Driver.getTitle());
			
			}

		}

	}

}
