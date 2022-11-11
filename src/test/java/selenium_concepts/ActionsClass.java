package selenium_concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// browser is launched
		driver.manage().window().maximize();// browser will be maximised
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);// dynamic waits
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);// dynamic waits
		driver.get("https://www.epfindia.gov.in/site_en/");
		Actions act = new Actions(driver);
		// act.moveToElement(driver.findElement(By.partialLinkText("Establishme"))).build().perform();
		// driver.findElement(By.xpath("//a[contains(text(),'Exempted
		// ReturnManual')]")).click();
		act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Directory')]"))).doubleClick().build()
				.perform();
		//act.doubleClick(driver.findElement(By.xpath("//a[contains(text(),'Directory')]"))).build().perform();
		act.contextClick(driver.findElement(By.xpath("//a[contains(text(),'Payroll Data')]"))).build().perform();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
	//explicit wait on single element
	
	}

}
