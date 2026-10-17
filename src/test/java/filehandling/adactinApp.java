package filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class adactinApp {

	public static void main(String[] args) throws IOException, InterruptedException {

		
		
		FileInputStream fis1=new FileInputStream("config.properties");	

		
		Properties pr=new Properties();
		
		pr.load(fis1);

		String browsername=pr.getProperty("browser");
		
		WebDriver driver=null;
		
		if(browsername.equalsIgnoreCase("chrome"))
		
		{
		
		driver=new ChromeDriver();
		
		}
		
		else if(browsername.equalsIgnoreCase("firefox"))

		{
		
			driver=new FirefoxDriver();

		}
		
		
		else if(browsername.equalsIgnoreCase("edge"))

		{
			
			driver=new EdgeDriver();

		}
		
		
		driver.get(pr.getProperty("url"));
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(pr.getProperty("implicitwait"))));
		
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
