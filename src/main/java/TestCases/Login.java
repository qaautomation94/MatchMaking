
package TestCases;


import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import PageFactoryandTestdata.HelpingFunction;
import PageFactoryandTestdata.Locatiors;
import PageFactoryandTestdata.TestData;


public class Login extends HelpingFunction  {

				public static  void login() throws InterruptedException, AWTException, IOException{
						
						
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					driver.get(envirnment);
					Input("Please Enter UserName", GetData.UserName, TestData.USER);
					Input("Please Enter Password", GetData.Password, TestData.PASS);
					Thread.sleep(3000);

					Click("Please click login button",GetData.LoginButton);
					Thread.sleep(5000);
				//	Assert.assertTrue(GetData.Publishers.isDisplayed());

					
				}
				
}

