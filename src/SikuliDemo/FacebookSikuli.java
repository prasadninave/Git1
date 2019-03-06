package SikuliDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class FacebookSikuli {

	public static void main(String[] args) throws FindFailed, InterruptedException {
		
		Pattern email= new Pattern("E:\\Selenium\\Selenium2\\sikulijars\\SkikuliScreenShot\\email.JPG");
		Pattern password= new Pattern("E:\\Selenium\\Selenium2\\sikulijars\\SkikuliScreenShot\\password.JPG");
		Pattern login= new Pattern("E:\\Selenium\\Selenium2\\sikulijars\\SkikuliScreenShot\\login.JPG");
		Pattern backward= new Pattern("E:\\Selenium\\Selenium2\\sikulijars\\SkikuliScreenShot\\backward.JPG");
		Pattern forgotac= new Pattern("E:\\Selenium\\Selenium2\\sikulijars\\SkikuliScreenShot\\forgotac.JPG");
		Pattern resetpassword=new Pattern("E:\\Selenium\\Selenium2\\sikulijars\\SkikuliScreenShot\\resetpassword.JPG");
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\16122018\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
		
		Screen screen= new Screen();
		
		screen.type(email,"goluninave@gmail.com");
		screen.type(password,"flowergay");
		screen.click(login);
		Thread.sleep(5000);
		screen.click(backward);
		//screen.click(backward);
		Thread.sleep(5000);
		screen.click(forgotac);
		screen.find(resetpassword);
  
		
		
		

	}

}
