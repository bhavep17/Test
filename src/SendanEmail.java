import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class SendanEmail {
	
	private WebDriver driver;
	private String baseURL;
	
  
	@BeforeClass
	  public void beforeClass() {
		  System.setProperty("webdriver.chrome.driver","D:\\selenium-java-3.141.59\\Drivers\\Chrome90\\chromedriver.exe\\");
		  driver = new ChromeDriver();
		  baseURL = "http://www.gmail.com/";
		// Maximize the browser's window
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get(baseURL);
		  
	  }
	@Test
  public void Sendemail() {
		
		driver.findElement(By.id("identifierId")).sendKeys("abcgef595");
		driver.findElement(By.id("identifierNext")).click();
		driver.findElement(By.name("password")).sendKeys("abcabca@c"); // Enter your password
	
		driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
		driver.findElement(By.xpath("//div[@class='T-I T-I-KE L3']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("to")).sendKeys("abcgef595@gmail.com");
		driver.findElement(By.name("subjectbox")).sendKeys("TestEmail");
		driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf tS-tW']")).sendKeys("TestEmail123	");
		//driver.findElement(By.xpath("//div[@id=':75']")).click();
		driver.findElement(By.id(":75")).click();
  }
	@AfterClass
	  public void afterClass() {
		driver.close();
	  }


}
