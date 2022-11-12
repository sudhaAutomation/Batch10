package selenium_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownhandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// browser is launched
		driver.manage().window().maximize();// browser will be maximised
		driver.get("https://digitechinc.in/demos/1swishzz_staging/admin");
		driver.findElement(By.name("email")).sendKeys("admin@admin.com");
		// Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("123456");
		// Thread.sleep(2000);
		driver.findElement(By.name("submit")).sendKeys(Keys.ENTER);
		// Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Send Message")).click();
		// Thread.sleep(3000);
		// driver.findElement(By.xpath("//select[@name='course_id']")).click();
		// Thread.sleep(3000);
		Select sel = new Select(driver.findElement(By.xpath("//select[@name='course_id']")));
		sel.selectByVisibleText("testing");
		Thread.sleep(3000);
		driver.close();

	}

}
