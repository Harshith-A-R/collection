
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.chrome.ChromeOptions;
		import org.openqa.selenium.support.ui.Select;
public class DatePicker {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",   "A:\\AUTOMATION_TRAINING\\chromedriver.exe");   
		

	
				ChromeOptions options = new ChromeOptions();
//				options.addArguments("--disable-notifications");
				WebDriver driver=new ChromeDriver(options);
				driver.manage().window().maximize();
				driver.get("https://demoqa.com/date-picker");
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.findElement(By.id("datePickerMonthYearInput")).click();
				WebElement we1=driver.findElement(By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
				Select year=new Select(we1);
				year.selectByValue("1996");
				WebElement we2=driver.findElement(By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
				Select month=new Select(we2);
				month.selectByValue("7");
				
				driver.findElement(By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[3]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"dateAndTimePickerInput\"]")).click();Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id='dateAndTimePicker']/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/div/span[1]")).click();Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id='dateAndTimePicker']/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/div[1]/div[9]")).click();Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id='dateAndTimePicker']/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/span[1]")).click();Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id='dateAndTimePicker']/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div[1]/div[7]")).click();Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id='dateAndTimePicker']/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[4]")).click();Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id='dateAndTimePicker']/div[2]/div[2]/div/div/div[3]/div[2]/div/ul/li[28]")).click();
				System.out.println("Date and time successfully inserted.");
				Thread.sleep(3000);
				System.out.println("Chrome closed");
//				driver.close();

			}
}

		
