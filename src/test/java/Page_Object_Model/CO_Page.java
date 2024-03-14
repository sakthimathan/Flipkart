package Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_class.Base;

public class CO_Page extends Base {

	public CO_Page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ul[@class='row']/li/child::button[text()='Add to cart']")
	private WebElement Btn;

	@FindBy(xpath = "//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")
	private WebElement Placeorder;

	@FindBy(xpath = "//input[@class='_2IX_2- _17N0em']")
	private WebElement inuput;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submit;

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getInuput() {
		return inuput;
	}

	public WebElement getBtn() {
		return Btn;
	}

	public WebElement getPlaceorder() {
		return Placeorder;
	}

	public void ADDTOCart() {
		click(getBtn());
	}

	public void cart() {
		click(getPlaceorder());
	}

	public void inuput(String text) {
		EnterText(getInuput(), "mail or num");
	}
	
	public void submitbtn() {
     click(getSubmit());
		
	}

}
