package ops;
import java.util.List;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
public class Method2 {
	private static final By driver = null;
	public static void main (String[]args) throws Throwable {  
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Exel\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://https://demo.guru99.com/test/drag_drop.html/");
		driver.manage().window().maximize();
		WebElement src = driver.findElement(By.xpath("//a[contains(text(),'BANK']"));
		WebElement desc = driver.findElement(By.xpath("//li[@class='placeholder']"));
		
	Actions ac = new Actions(driver);
	     ac.dragAndDrop(src,desc).build().perform();
	     
}
	}

