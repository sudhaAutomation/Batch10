package selenium_concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSetting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// browser is launched
	 driver.manage().window().maximize();// browser will be maximised
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();// browser is launched
		driver1.manage().window().maximize();// browser will be maximised
		driver1.get("https://digitechinc.in/demos/1swishzz_staging/admin");

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\msedgedriver.exe");
		WebDriver driver2 = new EdgeDriver();// browser is launched
		driver2.manage().window().maximize();// browser will be maximised
		driver2.get("https://digitechinc.in/demos/1swishzz_staging/admin");

		// driver.close();

	}

}
