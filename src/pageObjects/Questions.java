package pageObjects;
//GitBash commit
//GitHub Commit
//Fresh GitBash GitHub

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Questions 
{

	public static WebElement pquestions(WebDriver driver) throws InterruptedException
	{
		   
		    WebElement askQ = driver.findElement(By.xpath("//a[@data-action='ask-question']"));
		    askQ.click();
		    
	    
		    Actions act = new Actions(driver);

			act.keyDown(Keys.LEFT_CONTROL).keyDown(Keys.LEFT_SHIFT).perform();
			
			WebElement title = driver.findElement(By.xpath("//input[@id='question-title']"));
			title.click();
			title.sendKeys("What you think about Education in India ?");
			
			WebElement ds = driver.findElement(By.xpath("//input[@id='question-title']"));
			ds.click();
			ds.sendKeys(Keys.TAB);
			
		  
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			WebElement desc = driver.findElement(By.xpath("//iframe[@id='question-description_ifr']"));
			desc.click();
			desc.sendKeys("Education in India");
			
			
			WebElement topics = driver.findElement(By.xpath("//input[@placeholder='Topics (example: DU, learning, philosophy)']"));
			topics.click();
			topics.sendKeys("education");
			
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			

			driver.findElement(By.xpath("html/body/div[3]/div/div/form/div[1]/div[2]/ul/li[1]/a")).click();
			
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			WebElement Submit = driver.findElement(By.xpath("//button[@type='submit']"));
			Submit.click();
		
			
    		 WebElement erromsg =  driver.findElement(By.xpath("//span[@class='msg']"));
		     String txt = erromsg.getText();
		        
		     
		     
		      if(txt.equals("Question posted ssuccessfully\033[0m"))
		       {
		         System.out.println("\033[32;1;2mtrue");
		         System.out.println("\033[32;1;2mSuccess Message\033[0m ---> " + erromsg.getText());
		
			Thread.sleep(1000);
			
		    act.keyUp(Keys.LEFT_CONTROL).keyDown(Keys.LEFT_SHIFT).perform();

		    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		    
		    WebElement Verify = driver.findElement(By.xpath("//h4[@class='question-title']"));
		    System.out.println(Verify.getText());
		    
		    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    
		       }
		       else
		       {
		        
		    	System.out.println("\033[31;1mfalse\033[0m");
		        System.out.println("\033[31;1mError Message\033[0m ---> " + erromsg.getText());
		      
		        
		       driver.navigate().to("http://www.edunuts.com/discussions");
		        
		       }
		    
		    
		return null;
		
		       
		
	}
}
