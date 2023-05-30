package Assignments;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class verifyTitleApple {
	
	public static void main(String[] args) {
		// 1)open the browser
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(option);
				
		// 2)Navigate to application
		driver.get("https://Apple.com");
		
		// 3)Verify title is apple
		String expectedTitle = "Apple";
		String actualTitle = driver.getTitle();
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Test case passed");
		}
		
		else {
			System.out.println("Test case Failed");
		}
		// 4)Close the browser
		driver.quit();
	}

}
