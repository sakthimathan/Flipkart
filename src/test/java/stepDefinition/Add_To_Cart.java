package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import Base_class.Base;
import Page_O_Manager.Page_Manager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Add_To_Cart extends Base {

	Page_Manager pom = new Page_Manager();

	@When("user in home page and verify the page load successfully")
	public void user_in_home_page_and_verify_the_page_load_successfully() {
		String title = driver.getTitle();
		System.out.println("Titel ------" + title);
		Assert.assertEquals(title,
				"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");

	}

	@Then("user search the product and view the deatils of the product")
	public void user_search_the_product_and_view_the_deatils_of_the_product() {
		pom.getATc_Page().Entervalue("mobiles");

	}

	@Then("add the product into cart")
	public void add_the_product_into_cart() {
		wait.until(ExpectedConditions.elementToBeClickable(pom.getATc_Page().getProduct()));
		pom.getATc_Page().searchprodu();
		WebElement prod = pom.getATc_Page().getProduct();
		String text = prod.getText();
		System.out.println("Product name------>" + text);

	}

}
