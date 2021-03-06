
package TestCases;


import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import PageFactoryandTestdata.HelpingFunction;
import PageFactoryandTestdata.Locatiors;


public class Chat extends HelpingFunction  {

				public static  void chat() throws InterruptedException, AWTException, IOException{
						
						
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					driver.get(envirnment);

					Click("Please click chat button",GetData.ChatButton);
					Thread.sleep(10000);
					//	Assert.assertTrue(GetData.Publishers.isDisplayed());
					driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

					
				}
				
}

