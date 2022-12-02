package LabTask3;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LabTask3 
{
	WebDriver driver;
	@BeforeMethod()
  public void omayoQAFoxTestingStep0() throws Exception
 { 
		driver=new ChromeDriver();                                                                   //Open Chrome Browser
		driver.manage().window().maximize();                                                          //Maximize chrome browser
		driver.get("https://omayo.blogspot.in/");                                                        //Goto Github Login Page
		
}@Test
  public void omayoQAFoxTestingStep1()
  {
  
  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
  driver.findElement(By.id("ta1")).sendKeys("Noman Sharif");
  WebElement Clear1=driver.findElement(By.xpath("//*[ contains (text(), \"The cat was playing in the garden.\" ) ]"));
  Clear1.clear();
  Clear1.sendKeys("I am Ambitious Person");
	  
  }
//print table data
@Test
public void omayoQAFoxTestingStep2()
{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	int rowCount=driver.findElements(By.tagName("tr")).size();
	int ColumnCount=driver.findElements(By.xpath("//table/thead/tr/th")).size();
	System.out.println("Rows are : " + rowCount);
	System.out.println("Coulums are : " + ColumnCount);
	for(WebElement tabledata: driver.findElements(By.tagName("tr")))
	{
		System.out.println(tabledata.getText());
	}
	driver.findElement(By.xpath("//*[@type='text']")).sendKeys("nomansharif03@gmail.com");
	driver.findElement(By.xpath("//*[@type='password']")).sendKeys("123456789");
	driver.findElement(By.xpath("//*[@type='button']")).click();
	Assert.assertEquals(driver.getTitle(), "omayo (QAFox.com)");
}
@Test
public void omayoQAFoxTestingStep3()
{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	String windowhandlers = driver.getWindowHandle();
	WebElement frame1= driver.findElement(By.id("iframe1"));
	driver.switchTo().frame(frame1);
	driver.switchTo().window(windowhandlers);
	Assert.assertEquals(driver.getTitle(), "omayo (QAFox.com)");
	
	WebElement frame2= driver.findElement(By.id("iframe2"));
	driver.switchTo().frame(frame2);
	driver.switchTo().window(windowhandlers);
	Assert.assertEquals(driver.getTitle(), "omayo (QAFox.com)");
	
	driver.findElement(By.name("userid")).sendKeys("nomansharif03@gmail.com");
	driver.findElement(By.name("pswrd")).sendKeys("123456789");
	driver.findElement(By.xpath("//input[@type='button']")).click();
	String alerttext=driver.switchTo().alert().getText();
	System.out.println(alerttext);
	driver.switchTo().alert().accept();
	driver.switchTo().window(windowhandlers);
	Assert.assertEquals(driver.getTitle(), "omayo (QAFox.com)");
	
	
}

public void omayoQAFoxTestingStep4() throws Exception
{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	String Parentwindow=driver.getWindowHandle();
	
	driver.findElement(By.xpath("//option[@value='audix']")).click();
	Thread.sleep(2000);
	WebElement dropdown=driver.findElement(By.xpath("//select[@id='drop1']"));
	Select select= new Select(dropdown);
	Thread.sleep(2000);
	select.selectByVisibleText("doc 1");
	Thread.sleep(2000);
	WebElement clear2=driver.findElement(By.xpath("//input[@name='fname']"));
	clear2.clear();
	clear2.sendKeys("Hello");
	clear2.getText();
	Thread.sleep(2000);
	driver.findElement(By.id("but2")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@name='samename'][1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@name='samename'][2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@name='samename'][3]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("alert2")).click();
	Thread.sleep(2000);
	String alerttext=driver.switchTo().alert().getText();
	System.out.println(alerttext);
	driver.switchTo().alert().accept();
	driver.switchTo().window(Parentwindow);
	driver.findElement(By.linkText("Open a popup window")).click();
	java.util.Set<String> windows=driver.getWindowHandles();
	Iterator<String> iterator = windows.iterator();
	
	while(iterator.hasNext())
	{
		String window = iterator.next();
		driver.switchTo().window(window);
		if(driver.getTitle().equals("Basic Web Page Title"))
			
		{
			String text=driver.findElement(By.xpath("//*[body]")).getText();
			System.out.println(text);
			driver.close();
			
	}
	
	}
	driver.switchTo().window(Parentwindow);
	
	driver.findElement(By.linkText("Try it")).click();
	Thread.sleep(2000);
	Actions action = new Actions(driver);


	WebElement element = driver.findElement(By.linkText(" Double click Here ")); 
	Thread.sleep(2000);
	action.doubleClick(element).perform();
	Thread.sleep(2000);
	String alerttext1=driver.switchTo().alert().getText();
	System.out.println(alerttext1);
	driver.switchTo().alert().accept();
	
	driver.findElement(By.xpath("//button[text()='Check this']")).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='dte']"))).isEnabled();
	Thread.sleep(9000);
	driver.findElement(By.xpath("//input[@id='dte']")).click();
	
}


@Test
public void omayoQAFoxTestingStep5() throws InterruptedException {
	
	driver.findElement(By.id("radio1")).click();
	driver.findElement(By.id("alert1")).click();
	Thread.sleep(2000);
	String alerttext3=driver.switchTo().alert().getText();
	System.out.println(alerttext3);
	driver.switchTo().alert().accept();

	driver.findElement(By.id("checkbox2")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("checkbox1")).click();
	Thread.sleep(2000);
	
	String text4=driver.findElement(By.id("rotb")).getText();
	System.out.println(text4);
	Thread.sleep(3000);
	
	driver.findElement(By.id("prompt")).click();
	Thread.sleep(2000);
	driver.switchTo().alert().sendKeys("Noman Sharif");
	Thread.sleep(2000);
	String alerttext5=driver.switchTo().alert().getText();
	System.out.println(alerttext5);
	driver.switchTo().alert().accept();
	
	driver.findElement(By.id("confirm")).click();
	Thread.sleep(2000);
	String alerttext6=driver.switchTo().alert().getText();
	System.out.println(alerttext6);
	driver.switchTo().alert().dismiss();
	
	driver.findElement(By.xpath("//div[@id='HTML24']/child::div/input[@class='classone']")).sendKeys("Hello there I am");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@id='HTML28']/child::div/input[@class='classone']")).sendKeys("My Name is khan");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='Car']")).click();
	Actions action2 = new Actions(driver);


	WebElement element2 = driver.findElement(By.xpath("//*[@value='Bag']]")); 
	action2.doubleClick(element2).perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@value='Book']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='Book']")).click();
	Thread.sleep(2000);
	
	WebElement element3 = driver.findElement(By.xpath("//*[@class='dropbtn']")); 
	element3.click();
	Thread.sleep(6000);
	WebElement click4=driver.findElement(By.xpath("//*[text()='Facebook']"));
	click4.click();
	
	
	
	
}
@AfterMethod()
public void closetab() throws InterruptedException {
	driver.close();
	
}
}


