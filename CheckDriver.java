package chekDriver;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckDriver {

	public static void main(String[] args) throws InterruptedException {
	 WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	//bcz of using mobile net site not opening and got delayes so used sleep 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(6000);
	
	driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
	
	Set<String> windowsIDs=driver.getWindowHandles();
	List<String> windowListIDs=new ArrayList(windowsIDs);
	for (String windowID:windowListIDs) {
		String Pagetitle=driver.switchTo().window(windowID).getTitle();
		if(Pagetitle.equals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM")) {
			
			Thread.sleep(5000);
			driver.close();
			
		}
		
		
		
	}
	}
}
