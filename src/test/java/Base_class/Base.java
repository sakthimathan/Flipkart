package Base_class;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	public static WebDriver driver = null;
	public static WebDriverWait wait = null;

	public void BrowserQuit() {
		driver.quit();

	}
  
	public void click(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

	public void EnterText(WebElement element, String text) {
		element.click();
		element.clear();
		element.sendKeys(text);
	}

	public void selectbyvalue(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByValue(text);

	}

	public void selectbyindex(WebElement element, int value) {
		Select select = new Select(element);
		select.selectByIndex(value);
	}

	public void selectbyvisible(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	public void Alert() {
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		alert.accept();

	}

	public void sendValues(WebElement ele, String text) {
		ele.sendKeys(text, Keys.ENTER);

	}

	public void handelwindow(int num) {
		Set<String> handles = driver.getWindowHandles();
		List list = new ArrayList(handles);
	
		driver.switchTo().window((String) list.get(num));
	}

	public void javascript(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		
		
	}
	
	
}
