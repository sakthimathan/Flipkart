package stepDefinition;

import org.openqa.selenium.support.ui.ExpectedConditions;

import Base_class.Base;
import Page_O_Manager.Page_Manager;
import io.cucumber.java.en.Then;

public class Check_out extends Base {

	Page_Manager pom = new Page_Manager();

	@Then("user add the product in cart and verify the product and proceed to checkout for validate  the mail-id and OTP")
	public void user_add_the_product_in_cart_and_verify_the_product_and_proceed_to_checkout_for_validate_the_mail_id_and_otp() {
		handelwindow(1);

		// WebElement btn = pom.getCo_Page().getBtn();
		String url = driver.getCurrentUrl();
		System.out.println("url--->" + url);
		javascript(pom.getCo_Page().getBtn());
		wait.until(ExpectedConditions.visibilityOf(pom.getCo_Page().getBtn()));
		wait.until(ExpectedConditions.elementToBeClickable(pom.getCo_Page().getBtn()));
		pom.getCo_Page().ADDTOCart();
		javascript(pom.getCo_Page().getPlaceorder());
		pom.getCo_Page().cart();
		pom.getCo_Page().inuput("mmathan161@gmail.com");
		pom.getCo_Page().submitbtn();

	}

}
