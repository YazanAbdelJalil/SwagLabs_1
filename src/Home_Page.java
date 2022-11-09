import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Home_Page {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\my new driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

		String user_name = "standard_user";
		String password = "secret_sauce";

		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(user_name);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

		String actualTitle = driver.getTitle();
		String expectedTitle = "Swag Labs";

		Assert.assertEquals(actualTitle, expectedTitle);
		
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")).click();

		String actualClik1= driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]")).getText();
		String expectedClik1= "REMOVE";
		Assert.assertEquals(actualClik1,expectedClik1 );
		
		String actualClik2= driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-bike-light\"]")).getText();
		String expectedClik2= "REMOVE";
		Assert.assertEquals(actualClik2,expectedClik2 );
		
		String actualClik3= driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-bolt-t-shirt\"]")).getText();
		String expectedClik3= "REMOVE";
		Assert.assertEquals(actualClik3,expectedClik3 );
		
		String actualClik4= driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-fleece-jacket\"]")).getText();
		String expectedClik4= "REMOVE";
		Assert.assertEquals(actualClik4,expectedClik4 );
		
		String actualClik5= driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-onesie\"]")).getText();
		String expectedClik5= "REMOVE";
		Assert.assertEquals(actualClik5,expectedClik5 );
		
		String actualClik6= driver.findElement(By.xpath("//*[@id=\"remove-test.allthethings()-t-shirt-(red)\"]")).getText();
		String expectedClik6= "REMOVE";
		Assert.assertEquals(actualClik6,expectedClik6 );
	}

}
