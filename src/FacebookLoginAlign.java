import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginAlign {

	public static void main(String[] args) {
		
				System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe"); 
				WebDriver driver = new ChromeDriver(); 
				driver.get("www.facebook.com/"); 
				//find the user name field  
				WebElement unTB = driver.findElement(By.id("email")); 
				//store the height of user name  
				int username_height = unTB.getSize().getHeight(); 
				//store the width of user name  
				int username_width = unTB.getSize().getWidth(); 
				System.out.println(username_height); 
				System.out.println(username_width); 
				//find the password field 
				WebElement pwdTB = driver.findElement(By.id("pass")); 
				//store the height of password 
				int password_height = pwdTB.getSize().getHeight(); 
				//store the width of password 
				int password_width = pwdTB.getSize().getWidth(); 
				System.out.println(password_height); 
				System.out.println(password_width); 
				//check the height and width of user name and password fields are same  
				if(username_height==password_height && username_width==password_width)
				{ 
					System.out.println("Username and password fields are aligned");
				}else{ 
				System.out.println("Username and password fields are NOT aligned"); 
				} 
				 

	}

}
