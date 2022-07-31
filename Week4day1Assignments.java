import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week4day1Assignments {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		driver.findElement(By.xpath("//span[text()='From Contact']/following::img")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> lstwindow = new ArrayList<String>(windowHandles);
		String calling = lstwindow.get(1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
		String calling1 = lstwindow.get(0);
		driver.findElement(By.xpath("//span[text()='To Contact']/following::img")).click();
		String calling2 = lstwindow.get(1);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
		String calling3 = lstwindow.get(0);
		driver.findElement(By.linkText("Merge")).click();
	}

}
