package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtnAndCheckboxes {

	public static void main(String[] args) {
		// 1) Open the browser
		ChromeDriver driver = new ChromeDriver();
		
		// 2) maximize it
		driver.manage().window().maximize();
		
		// 3) Navigate to application
		driver.get("https:letcode.in/radio");
		
		// 4) select 'yes' option from the first radio button
		driver.findElement(By.id("yes")).click();
		
		// 5) verify 'bar' option from 4th radio button is selected by default when a user loads this page
		boolean barRadioBtnStatus = driver.findElement(By.id("notfoo")).isSelected();
		if(barRadioBtnStatus == true) {
			System.out.println("bar radio button is selected by default");
		}
		else {
			System.out.println("bar radio button is not selected by default");
		}
		
		// 6) verify 'remember me' checkbox is selected by default when a user loads page
		boolean rememberMecheckbox = driver.findElement(By.xpath("input{contains(@type,'checkbox')}")).isSelected();
		if(rememberMecheckbox == true) {
			System.out.println("remember Me check box is not selected ");
		}
		else {
			System.out.println("remeber Me checked box is not selected by default");
		}
	     // 7) select 'T & c ' checkbox
		driver.findElement(By.xpath("//input{contains(@type, 'checkbox')}){2}")).click();
		
		// 8) Close the browser
	
	}
}
