package preparation._04_2023;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FirstProject {
	WebDriver driver;
@Test
	public void fullpro() throws Exception {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\user\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://nxtgenaiacademy.com/mouseevent/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions action = new Actions(driver);
		WebElement a = driver.findElement(By.xpath("//div[@class='collapse navbar-collapse pull-right']//a[contains(text(),'Course Offered')]"));
		action.moveToElement(a).click().build().perform();
		driver.findElement(By.xpath("//div[@class='collapse navbar-collapse pull-right']//a[contains(text(),'QA Automation Course Brochure.')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().back();
		driver.findElement(By.id("textbox")).sendKeys("divya");
		WebElement b = driver.findElement(By.id("dblclick"));
		action.moveToElement(b).doubleClick().build().perform();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement c = driver.findElement(By.id("rightclick"));
		action.moveToElement(c).contextClick().build().perform();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Alert Popup"))).click();
		driver.findElement(By.xpath("//button[@onclick='myFunctionOne()']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[@onclick='myFunctionTwo()']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.id("demo")).getText());
		driver.findElement(By.xpath("//button[@onclick='myFunctionThree()']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.id("demoone")).getText());
		}
}
