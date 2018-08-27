package mavenpckg1;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Class1 {
	@Test
	public void launchapplication() {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://mvnrepository.com/artifact/org.testng/testng/6.14.3");
	}
}
