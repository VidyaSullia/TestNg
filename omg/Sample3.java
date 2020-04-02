package omg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample3 {
	@Parameters({"browser","username"})
	@Test
	public void aTest(String b, String user) {

		if(b.equals("cc")) {
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\KaVi\\eclipse-workspace\\Day1Continued\\Selenium_Functions\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			WebElement e = driver.findElement(By.id("email"));
			e.sendKeys(user);
			System.out.println(e.getAttribute("value"));
			System.out.println();
		}
		else if (b.equals("ff"))
			 {
				System.setProperty("webdriver.gecko.driver", 
						"C:\\Users\\KaVi\\eclipse-workspace\\Day1Continued\\Selenium_Functions\\driver\\geckodriver.exe");
				WebDriver driver=new FirefoxDriver();
				driver.get("https://www.facebook.com/");
				driver.manage().window().maximize();
				WebElement e = driver.findElement(By.id("email"));
				e.sendKeys(user);
				System.out.println(e.getAttribute("value"));
		}
	}

}
