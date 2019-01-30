package AutomationSite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutomationSiteDressSearch {
	@FindBy (xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a")
	WebElement printedSummerDress;
	
	public void getDressText() {
		printedSummerDress.getText();
	}
}
