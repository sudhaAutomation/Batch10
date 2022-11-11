package selenium_concepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// browser is launched
		driver.manage().window().maximize();// browser will be maximised
		driver.get("https://digitechinc.in/demos/1swishzz_staging/admin");
		driver.findElement(By.name("email")).sendKeys("admin@admin.com");

		Thread.sleep(2000);//static wait
		driver.findElement(By.name("password")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Courses")).click();
		
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/a[1]")).click();
		Alert alrt=driver.switchTo().alert();
		
		System.out.println(alrt.getText());
		//alrt.accept();
		alrt.dismiss();
		

	}

}




