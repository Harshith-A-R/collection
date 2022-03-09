import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.Zip;
import org.openqa.selenium.support.Color;
public class ColorChange {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
		System.setProperty("webdriver.chrome.driver", "A:\\AUTOMATION_TRAINING\\chromedriver.exe");   
		

		
		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
				driver.get("https://demoqa.com/dynamic-properties");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				WebElement we1=driver.findElement(By.xpath("//*[@id=\"colorChange\"]"));
				String s=we1.getCssValue("color");
				String c=Color.fromString(s).asHex();
				
				System.out.println("Color of the button:" +s +"And Hexcode is:" +c);
				Thread.sleep(6000);
				String s1=we1.getCssValue("color");
				String c1=Color.fromString(s1).asHex();
				System.out.println("Color of button after 5 second:" +s1 +"And Hexcode is:" +c1);
				if(c.equals(c1)) {
					System.out.println("Color did not change");
				}
				else {
					System.out.println("Color changed");
				}
			}

		}


