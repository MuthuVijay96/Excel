package ops;
import java.util.List;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
public class Method {
	private static final By driver = null;
	public static void main (String[]args) throws Throwable {  
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Exel\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://facebook.com/");
		driver.manage().window().maximize();
	WebElement element = driver.findElement (By.id("email"));
	Actions ac = new Actions(driver);
	     ac.sendKeys(element, "Selenium").perform();
	     ac.doubleClick(element).perform();
	     ac.contextClick(element).perform();
}
	}
