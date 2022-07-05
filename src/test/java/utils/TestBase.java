package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestBase {
	public static WebDriver driver;
	public static Properties properties;


	public TestBase() throws IOException {
		properties = new Properties();
		FileInputStream file = new FileInputStream("src\\test\\resources\\configs\\config.properties");
		properties.load(file);
//		String url = properties.getProperty("URL");
//		System.out.println(url);
	}

	public void initialization() {
        
		System.setProperty("webdriver.chrome.driver", properties.getProperty("pathDriver"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(properties.getProperty("URL"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

//	public static void takeScreenShots(String name) throws IOException {
//		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(srcFile, new File("target\\snopshots\\"+ name + ".png"));
//	}

	
	
}
