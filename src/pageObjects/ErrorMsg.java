package pageObjects;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ErrorMsg
{
public static WebDriver driver = null;


public static WebElement Qstn(WebDriver driver) throws InterruptedException
{

	WebElement erromsg =  driver.findElement(By.xpath("//span[@class='msg']"));
    String txt = erromsg.getText();
       
    
    
     if(txt.equals("Question posted ssuccessfully\033[0m"))
      {
        System.out.println("\033[32;1;2mtrue");
        System.out.println("\033[32;1;2mSuccess Message\033[0m ---> " + erromsg.getText());

      }
      else
      {
       
   	   System.out.println("false");
       System.out.println("\033[31;1mError Message\033[0m ---> " + erromsg.getText());
       driver.navigate().to("http://www.edunuts.com/discussions");
      
      }
      
		return null;

}

}
