import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest {
	WebDriver driver;
  @Test
  public void f() {
	  
	  driver = new EdgeDriver();

      WebDriverManager.edgedriver().setup();

      driver.get("https://www.google.com/");

      driver.manage().window().maximize();
	  
  }
}
