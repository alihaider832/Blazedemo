import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ChooseFlight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\eclipse\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://blazedemo.com/reserve.php");
		
		driver.findElement(By.xpath("//tr[3]//td[1]//input[1]")).click();
		driver.navigate().to("http://blazedemo.com/purchase.php");
		
		driver.findElement(By.id("inputName")).sendKeys("Ali");
		driver.findElement(By.id("address")).sendKeys("House no.5");
		driver.findElement(By.id("city")).sendKeys("Lahore");
		driver.findElement(By.id("state")).sendKeys("LAHORE");
		driver.findElement(By.id("zipCode")).sendKeys("5191");
		
		Select s = new Select(driver.findElement(By.id("cardType")));
		s.selectByValue("dinersclub");
		
		driver.findElement(By.id("creditCardNumber")).sendKeys("25549797464");
		driver.findElement(By.id("creditCardMonth")).sendKeys("25549797464");
		driver.findElement(By.id("creditCardYear")).sendKeys("2019");
		driver.findElement(By.id("nameOnCard")).sendKeys("Ali Haider");
		System.out.println(driver.findElement(By.id("rememberMe")).isSelected());
		driver.findElement(By.id("rememberMe")).click();
		System.out.println(driver.findElement(By.id("rememberMe")).isSelected());
		
		if (driver.findElement(By.id("rememberMe")).isSelected())
		{
			driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();

		}
		
		else
		{
			System.out.println("Click on remember me!!");
		}
		

	}

}
