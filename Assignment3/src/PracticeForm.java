import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;





public class PracticeForm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",   "A:\\AUTOMATION_TRAINING\\chromedriver.exe");   
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Harshith");
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("A R");
		
		driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("harsha@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
		
		driver.findElement(By.xpath("//*[@id=\"userNumber\"]")).sendKeys("9060353690");
		
		driver.findElement(By.id("dateOfBirthInput")).click();
		WebElement we1=driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
												
		Select year= new Select(we1);
		year.selectByValue("1997");
		
		WebElement we2=driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
		Select month=new Select(we2);
		month.selectByVisibleText("April");
		
		driver.findElement(By.xpath("//*[.='13']")).click();
		
//		driver.findElement(By.id("subjectsInput")).sendKeys("Hindi");
		WebElement subject=driver.findElement(By.id("subjectsInput"));
		subject.sendKeys("Hindi");
		subject.sendKeys(Keys.ENTER);
		subject.sendKeys("English");
		subject.sendKeys(Keys.ENTER);

		
		
		WebElement upload=driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		upload.sendKeys("C:\\Users\\harsha\\Desktop\\HTML\\Real me\\realme-6.jpg");
		
		driver.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("#614,Nagasandra,"+"bengalore");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[.='Sports']")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label")).click();
		
		WebElement state=driver.findElement(By.xpath("//*[@id='react-select-3-input']"));
		state.sendKeys("Rajasthan");
		state.sendKeys(Keys.ENTER);
		WebElement city=driver.findElement(By.xpath("//input[@id='react-select-4-input']"));

		city.sendKeys("Jaipur");
		city.sendKeys(Keys.ENTER);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("closeLargeModal")).click();
		System.out.println("Chrome closed");
		

		
		

	}

}
