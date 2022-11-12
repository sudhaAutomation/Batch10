package selenium_concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// browser is launched
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		String Expmonthyear = "Aug 2025";
		String expdate="2";
		while(true) {
		String monthyear = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/table[1]/tbody[1]/tr[1]/td[2]")).getText();
		if (monthyear.equals(Expmonthyear)) {
			driver.findElement(By.xpath("//td[(text()='"+expdate+"')]")).click();
			break;
		} else {
			driver.findElement(By.xpath("/html[1]/body[1]/div[4]/table[1]/tbody[1]/tr[1]/td[3]/button[1]")).click();
		}
	
		}
		// System.out.println(monthyear);

	}

}
