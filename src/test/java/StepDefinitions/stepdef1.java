package StepDefinitions;

import java.io.IOException;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.base;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import junit.framework.Assert;
import pageObjects.homePage;

@RunWith(Cucumber.class)
public class stepdef1 extends base {
	
	homePage h;
	//for scenario 1
	 @Given("^User is on the greenkart landing page$")
	    public void user_is_on_the_greenkart_landing_page() throws IOException  {
		driver=base.getdriver();
		 driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	    }

	    @When("^User searched for \"([^\"]*)\"$")
	    public void user_searched_for_something(String vegetable)  {
	    	h=new homePage(driver);
	    	h.search().sendKeys(vegetable);
	        driver.findElement(By.xpath("//*[@class='search-button']")).click();
	    }

	    @Then("^\"([^\"]*)\" results are displayed$")
	    public void something_results_are_displayed(String vegetable)   {
	    	String vegetable_name=driver.findElement(By.xpath("(//*[@class='product-name'])[1]")).getText();
	    	Assert.assertTrue(vegetable_name.contains(vegetable));
	    }
	    @And("^User proceeded to checkout page for purchase$")
	    public void user_proceeded_to_checkout_page_for_purchase()  {
	    	   driver.findElement(By.xpath("//*[text()='ADD TO CART']")).click(); 
	    	   driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/a[4]/img")).click();  
	    	   driver.findElement(By.xpath("//*[text()='PROCEED TO CHECKOUT']")).click(); 
	    }
	    @Then("^Verify selected \"([^\"]*)\" is displayed in checkout page$")
	    public void verify_selected_something_is_displayed_in_checkout_page(String vegetable)  {
	    	 String vege=driver.findElement(By.xpath("//*[@class='product-name']")).getText();
	    	 Assert.assertTrue(vege.contains(vegetable));
	    }

}
