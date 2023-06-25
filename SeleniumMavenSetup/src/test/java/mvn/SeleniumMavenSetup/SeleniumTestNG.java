package mvn.SeleniumMavenSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class SeleniumTestNG 
{
	@Test
	public void Test() 
	{
	WebDriver driver=new ChromeDriver();
    driver.get("https://testng.org/doc/download.html");
	}
   
}
