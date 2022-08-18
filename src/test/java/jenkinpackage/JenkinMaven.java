package jenkinpackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class JenkinMaven {
	
	@Parameters("Browser")
	@Test
	public void jenkin2(String browsername)
	{
		if(browsername.equalsIgnoreCase("Chrome"))
		{
			
        System.out.println("welcome");
        
		System.setProperty("webdriver.chrome.driver","C:\\Users\\raselvam\\Downloads\\selenium\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		}
		
		else
		{
			System.out.println("not chrome");
		}
	}


}
