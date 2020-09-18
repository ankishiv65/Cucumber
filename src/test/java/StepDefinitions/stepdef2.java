package StepDefinitions;

import org.openqa.selenium.By;

import base.base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.homePage;

public class stepdef2 extends base {
	//for scenario 2
	
	homePage h;

    @And("^Added Items to cart$")
    public void added_items_to_cart()  {
     driver.findElement(By.xpath("//*[@class='increment']")).click();  
    }
    @When("^User searched for (.+)$")
    public void user_searched_for(String vegetables) {
    	h=new homePage(driver);
    	h.search().sendKeys(vegetables);
    	   driver.findElement(By.xpath("//*[@class='search-button']")).click();
    }

    @Then("^Verify selected (.+) is displayed in checkout page$")
    public void verify_selected_is_displayed_in_checkout_page(String vegetables) {
    	 String vege=driver.findElement(By.xpath("//*[@class='product-name']")).getText();
    	 Assert.assertTrue(vege.contains(vegetables));
    }

  
}
