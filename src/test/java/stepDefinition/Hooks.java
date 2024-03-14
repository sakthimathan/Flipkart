package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base_class.Base;
import io.cucumber.java.Before;

public class Hooks extends Base {

	@Before
	public void BrowserLanuch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");

	}

}
