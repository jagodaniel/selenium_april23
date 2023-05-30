package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTextIsDisplayed {
	
	public static void main(String[] args) {
		//1) open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//2) maximize it
		driver.manage().window().maximize();
		
		//3) Navigate to application
		driver.get("https://facebook.com");
		
		//4) verify the text 'Facebook helps you connect and share with the people in your life.' is displayed to the visit
		boolean textStatus = driver.findElement(By.xpath("//h2{contains(@class,'eso')}")).isDisplayed();
		if (textStatus == true) {
			System.out.println("Test case passed");
		}
		
		else {
			System.out.println("Test case failed");
		}
	
		//5) close the browser
		driver.quit();
	}

}
