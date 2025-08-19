package BasicOperation;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class NewTest {
	
	WebDriver driver;
  @Test
  public void f() {
	  //WebDriverManager.chromedriver().setup();
	  
	  driver = new ChromeDriver();
	  driver.get("https://www.redbus.in/");
	  driver.manage().window().maximize();
	  String title = driver.getTitle();
	  System.out.println("title of the site is :" + title);
  }
  @BeforeClass
  public void beforeClass() {
  }

}
