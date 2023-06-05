package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void setUp () {
		
		WebDriverManager.chromedriver().setup();
		driver.get("http://uitestingplayground.com/");
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void tearDown () {
		driver.close();
	}

}
