import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookFlight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\eclipse\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://blazedemo.com/index.php");
		
		driver.findElement(By.xpath("//select[@name='fromPort']")).click();
		driver.findElement(By.xpath("//select[@name='fromPort']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//select[@name='fromPort']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//select[@name='fromPort']")).click();
		
		driver.findElement(By.xpath("//select[@name='toPort']")).click();
		driver.findElement(By.xpath("//select[@name='toPort']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//select[@name='toPort']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//select[@name='toPort']")).click();
		
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		

	}

}
