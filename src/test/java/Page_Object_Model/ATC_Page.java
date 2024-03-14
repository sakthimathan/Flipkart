package Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_class.Base;

public class ATC_Page extends Base {

	public ATC_Page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='col col-7-12']/child::div[contains(text(),'Nothing ')]")
	private WebElement product;

	@FindBy(name = "q")
	private WebElement searchbox;

	public WebElement getProduct() {
		return product;
	}

	public WebElement getSearchbox() {
		return searchbox;
	}

	public void Entervalue(String text) {
		sendValues(getSearchbox(), text);
	}

	public void searchprodu() {
		click(getProduct());
	}

}
