
package TestCases;


import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import PageFactoryandTestdata.HelpingFunction;
import PageFactoryandTestdata.Locatiors;
import PageFactoryandTestdata.TestData;


public class Mail extends HelpingFunction  {

				public static  void mail() throws InterruptedException, AWTException, IOException{
						
						
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());

					Click("Please click Mail button",GetData.Mail);
					driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,300)");
					
					Click("Please click View Mail button",GetData.ViewMail);
					driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
					Click("Please click Reply Mail button",GetData.ReplyMail);
					
					JavascriptExecutor scroll2 = (JavascriptExecutor) driver;
					scroll2.executeScript("window.scrollBy(0,900)");
					
					Input("Please Enter Subject", GetData.Subject, TestData.SUBJECT);
					Input("Please Enter Content", GetData.Content, TestData.CONTENT);
					Click("Please click Send Message button",GetData.SendMessage);
					
					JavascriptExecutor scroll3 = (JavascriptExecutor) driver;
					scroll3.executeScript("window.scrollBy(0,300)");
					
					Assert.assertTrue(GetData.SentMessageTitle.isDisplayed());
				}
				
}

