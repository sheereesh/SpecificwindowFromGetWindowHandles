package chekDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DropdownPractice {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.opencart.com/index.php?route=account/register");
	Thread.sleep(8000);
WebElement	dropDown=driver.findElement(By.xpath("//select[@id='input-country']"));
Thread.sleep(5000);
	Select dropCountry=new Select(dropDown);
	List<WebElement> listDropdownOptions=dropCountry.getOptions();
	for (WebElement countryDropDown:listDropdownOptions) {
		if(countryDropDown.getText().equals("Cuba")) {
			countryDropDown.click();
			break;
		}
	}
}
}
