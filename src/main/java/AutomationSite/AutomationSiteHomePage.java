package AutomationSite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutomationSiteHomePage {
	@FindBy (xpath = "//*[@id=\"search_query_top\"]")
	private WebElement searchBox;
	
	@FindBy (xpath = "//*[@id=\"searchbox\"]/button")
	private WebElement searchBoxButton;
	
	public void inputSearch(String input) {
		searchBox.sendKeys(input);
	}
	
	public void search() {
		searchBoxButton.click();
	}
}
