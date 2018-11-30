package Assignment;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;

public class Assignment 
{

	@Test
	
	public void testSearch()
	{
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/insurance/v1/index.php");
		
		
		driver.findElement(By.id("email")).sendKeys("nilmie.gamhewa@gmail.com");
		driver.findElement(By.id("password")).sendKeys("1234");
		driver.findElement(By.name("submit")).click();
		
		driver.findElement(By.id("ui-id-5")).click();
		
		
		Select Title = new Select(driver.findElement(By.id("user_title")));
		Title.selectByVisibleText("Ms");
		Title.selectByIndex(3);
		
		driver.findElement(By.id("user_surname")).sendKeys("Senevirathna");
		driver.findElement(By.id("user_firstname")).sendKeys("Nilmi");
		driver.findElement(By.id("user_phone")).sendKeys("0772273555");
		
		
		Select BirthYear = new Select(driver.findElement(By.id("user_dateofbirth_1i")));
		BirthYear.selectByVisibleText("1989");
		
		Select BirthMonth = new Select(driver.findElement(By.id("user_dateofbirth_2i")));
		BirthMonth.selectByVisibleText("February");
		
		Select BirthDate = new Select(driver.findElement(By.id("user_dateofbirth_3i")));
		BirthDate.selectByVisibleText("8");
		
		//driver.findElement(By.id("licencetype_t")).sendKeys("Full");
		
		WebElement Full = driver.findElement(By.id("user_licencetype_t"));
		WebElement Provisional = driver.findElement(By.id("user_licencetype_f"));
		Full.click();
		
	
		Select licenceperiod = new Select(driver.findElement(By.id("user_licenceperiod")));
		licenceperiod.selectByVisibleText("2");

		Select occupation = new Select(driver.findElement(By.id("user_occupation_id")));
		occupation.selectByVisibleText("Student");
		
		driver.findElement(By.id("user_address_attributes_street")).sendKeys("Bogahawatta");
		driver.findElement(By.id("user_address_attributes_city")).sendKeys("Pannipitiya");
		driver.findElement(By.id("user_address_attributes_county")).sendKeys("SriLanka");
		driver.findElement(By.id("user_address_attributes_postcode")).sendKeys("10231");
		driver.findElement(By.name("commit")).click();

		
		
		//driver.close();
		//driver.quit();
	}
}
