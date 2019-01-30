package testPackage;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import AutomationSite.AutomationSiteDressSearch;
import AutomationSite.AutomationSiteHomePage;

public class AutomationSiteTest {
WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@After
	public void teardown() {
		driver.quit();
	}
	
	@Test
	public void searchTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		AutomationSiteHomePage searchPage = PageFactory.initElements(driver, AutomationSiteHomePage.class);
		searchPage.inputSearch("dress");
		searchPage.search();
		WebElement dressSearch = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a"));
		assertEquals("Dress not found", "Printed Summer Dress", dressSearch.getText());
	}
}
