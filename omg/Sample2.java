package omg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sample2 {
	@DataProvider(name="values")
	public Object[][] data() {
		return new Object[][] {{"Arnav","Arnav@1234","Arnav kumar"},{"khushi","khushi2234","khushu kumari"}};

	}
	@Test(dataProvider="values")
	private void aTest(String s[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KaVi\\eclipse-workspace\\Day1Continued\\Selenium_Functions\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.id("email"));
		e.sendKeys(s[0]);
		System.out.println(e.getAttribute("value"));
		Assert.assertEquals(s[0], e.getAttribute("value"));
		
		WebElement p = driver.findElement(By.id("pass"));
		p.sendKeys(s[1]);
		System.out.println(p.getAttribute("value"));
		Assert.assertEquals(s[1], p.getAttribute("value"));
		
		WebElement f = driver.findElement(By.name("firstname"));
		f.sendKeys(s[2]);
		System.out.println(f.getAttribute("value"));
		Assert.assertEquals(s[2], f.getAttribute("value"));
		
	}



}
