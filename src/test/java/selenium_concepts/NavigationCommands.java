package selenium_concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// browser is launched
		driver.manage().window().maximize();// browser will be maximised
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);// dynamic waits
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);// dynamic waits
		driver.get("https://www.google.com");//home
		driver.get("https://www.keralartc.com/main.html");//home
		driver.navigate().to("https://www.keralartc.com/main.html");
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().forward();
		driver.navigate().refresh();

	}

}
