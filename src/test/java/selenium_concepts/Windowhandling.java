package selenium_concepts;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// browser is launched
		driver.manage().window().maximize();// browser will be maximised
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);// dynamic waits
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);// dynamic waits
		driver.get("https://www.keralartc.com/main.html");
		driver.findElement(By.xpath("//a[contains(text(),'E-Ticketing')]")).click();

		driver.findElement(By.xpath("//a[contains(text(),'City Circular')]")).click();
		// driver.findElement(By.xpath("//a[contains(text(),'features')]")).click();
		String window = driver.getWindowHandle();// we can get only one window id
		System.out.println(window);
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();

		System.out.println(it.hasNext());
		String parentwindow = it.next();
		System.out.println("home page window " + parentwindow);
		Thread.sleep(2000);
		System.out.println(it.hasNext());
		String childwindow1 = it.next();
		System.out.println("E ticketing window " + childwindow1);

		System.out.println(it.hasNext());
		String childwindow2 = it.next();
		System.out.println("city circular window " + childwindow2);
		driver.switchTo().window(childwindow2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Cancel Tickets')]")).click();
		driver.switchTo().window(childwindow1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'features')]")).click();
		Thread.sleep(2000);
		driver.close();
		driver.quit();

	}

}
