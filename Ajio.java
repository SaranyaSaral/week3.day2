package week3.day2;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {



	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://www.ajio.com/");



driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags",Keys.ENTER);
Thread.sleep(2000);
driver.findElement(By.xpath("//label[@for='Men']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
Thread.sleep(2000);
String element=driver.findElement(By.xpath("//div[@class='length']")).getText();
System.out.println(element);
System.out.println("brand list");

List<WebElement> BagBrandlist = driver.findElements(By.className("brand"));
System.out.println("size" + BagBrandlist.size());

for(WebElement webElement : BagBrandlist) {
	String text = webElement.getText();
	System.out.println(text);
}

List<WebElement> listname = driver.findElements(By.className("name"));
System.out.println("list name;"  + listname) ;
for(WebElement webElement : listname) {
	String text = webElement.getText();
	System.out.println(text);
}
	


	}}	


