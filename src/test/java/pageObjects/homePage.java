package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {
	
public homePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//*[@class='search-keyword']")
WebElement search1;

public WebElement search() {
	return search1;
}
}
