package selenium_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTablehandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\Downloads\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// browser is launched
		driver.manage().window().maximize();// browser will be maximised
		driver.get("https://digitechinc.in/demos/1swishzz_staging/admin");
		driver.findElement(By.name("email")).sendKeys("admin@admin.com");

		Thread.sleep(2000);// static wait
		driver.findElement(By.name("password")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Course Batche Schedules List')]")).click();
		// String str = driver.findElement(By.xpath(
		// "//td[contains(text(),'java')]"))
		// .getText();
		// String str = driver.findElement(By.xpath(
		// "//tbody/tr[2]/td[1]"))
		// .getText();
		int rows = driver.findElements(By.xpath("//tbody/tr")).size();
		System.out.println(rows);

		int cols = driver.findElements(By.xpath("//tbody/tr[2]/td")).size();
		System.out.println(cols);

		/// html/body/div/section/div/div/section/div/div/div[2]/table/tbody/tr[1]/td[1]
		// System.out.println(str);
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= cols; j++) {
				System.out.print(
						driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[" + j + "]")).getText() + "      ");

			}
			System.out.println();

		}

		for (int i = 0; i < rows; i++) {
			String coursname = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[1]")).getText();
			System.out.println(coursname);
			if (coursname.equals("testing")) {
				driver.findElement(By.xpath("")).click();

			}
		}
		driver.close();
	}

}
