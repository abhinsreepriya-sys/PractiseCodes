
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//To fetch the tagname
		String Url = "http://www.facebook.com";
        String tagName = "";
        
        driver.get(Url);
        Thread.sleep(2000);
        tagName = driver.findElement(By.id("email")).getTagName();
        System.out.println(tagName);
		/*
		 * //To take screenshot of the page TakesScreenshot ts = (TakesScreenshot)
		 * driver; File srcFile = ts.getScreenshotAs(OutputType.FILE); File destFile =
		 * new File(".\\screenshot\\FacebookLogin.png"); //FileUtils.copyFile(srcFile,
		 * destFile);
		 */
        Thread.sleep(2000);
        driver.close();
        System.exit(0);
	}

}
