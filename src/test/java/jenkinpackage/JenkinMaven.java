package jenkinpackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JenkinMaven {
	
	@Test
	public void jenkin2()
	{
		System.out.println("welcome to jenkinsssss world");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\raselvam\\Downloads\\selenium\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		
	}


}
