package Rest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	//private static final Alert ConfirmationAlert = null;

	public Alerts() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chrlauncher-win64-stable-codecs-sync");
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		//SimpleAlert
		/*driver.findElement(By.id("alertBox")).click();
		Alert SimpleAlert = driver.switchTo().alert();
		System.out.println(SimpleAlert.getText());
		Thread.sleep(2000);
		SimpleAlert.accept();*/
		
		//ConfirmationAlert alert
		/*driver.findElement(By.id("confirmBox")).click();
		Alert ConfirmationAlert = driver.switchTo().alert();
		System.out.println(ConfirmationAlert.getText());
		Thread.sleep(2000);
		ConfirmationAlert.dismiss();*/
		
		//PromptAlert
		driver.findElement(By.id("promptBox")).click();
		Alert PromptAlert = driver.switchTo().alert();
		System.out.println(PromptAlert.getText());
		PromptAlert.sendKeys("nn");
		Thread.sleep(2000);
		PromptAlert.dismiss();
		
	}

}
