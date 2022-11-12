package selenium_concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsMethods {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// browser is launched
		driver.manage().window().maximize();// browser will be maximised
				driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);// dynamic waits
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);// dynamic waits
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		driver.findElement(By.xpath("//textarea[@id='textbox']")).sendKeys("Testing Notes");
		System.out.println(driver.findElement(By.xpath("//button[@id='createTxt']")).isEnabled());// true

		System.out.println(driver.findElement(By.xpath("//a[@id='link-to-download']")).isDisplayed());// false

	}

}
