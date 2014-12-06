package dummygit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsEbay {

	WebDriver driver = new FirefoxDriver();
	@Before
	public void setUp() throws Exception 
	{
		driver.get("http://www.ebay.in//");
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception 
	{
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div[1]/table/tbody/tr/td[5]/a"))).build().perform();
		Thread.sleep(6000);
		a.moveToElement(driver.findElement(By.id("gh-as-a"))).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("gh-as-a"))).click();
		
	}

}
