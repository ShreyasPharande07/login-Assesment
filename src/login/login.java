package login;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class login {
	
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException 
	{
//SETUP CHROME BROWSER
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
//NAVIGATE TO LOGIN PAGE	
		driver.get("https://codesandbox.io/s/sweet-shockley-z3t0c9?file=/src/App.js");
        Thread.sleep(3000);
        
//ENTER VALID EMAIL
        WebElement Email = driver.findElement(By.xpath("//input[@type='text']"));
        Email.click();
        Email.sendKeys("shreyas@gmail.com");
        Thread.sleep(3000);
        
        
//ENTER VALID PASSWORD
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Abc@123");
        Thread.sleep(3000);
        
//CLICK SUBMIT
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		
		
        
        
        
				
		

		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
