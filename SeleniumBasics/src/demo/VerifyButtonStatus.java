package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyButtonStatus {

	public static void main(String[] args) {
		//1) open the browser 
		ChromeDriver driver = new ChromeDriver();
		
		//2) maximize it
		driver.manage().window().maximize();
		
		//4) verify the button with 'Disable' text is disabled (not clickable)by default.
		boolean disabledBtnstatus = driver.findElement(By.id("isDisabled")).isEnabled();
		if (disabledBtnstatus == true) {
			System.out.println("Disabled button is clickable(enabled)");
		}
		else {
			System.out.println("Disabled button is not clickable (disabled)");
		}
	
		// 5) close the browser
	}
}
