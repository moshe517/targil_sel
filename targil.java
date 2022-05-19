package moshe1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class targil {
	WebDriver driver;
	
	
	
	public void launchbrowser()throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\project\\selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.zengo.com/");
	    Thread.sleep(4000);
	    driver.get("https://zengo.com/assets/ethereum-wallet/");
	    Thread.sleep(3000);
	    driver.get("https://www.zengo.com/");
	    Thread.sleep(3000);
	    driver.close();
		driver.quit();
	}
	
	
	
	public static void main(String[] args )  throws InterruptedException {
		targil obj = new targil();
		
		obj.launchbrowser();
		
	   
	  
	 }
	}

