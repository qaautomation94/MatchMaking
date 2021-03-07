
package TestCases;


import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
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

					
				}
				
				public static  void forgotPassword() throws InterruptedException, AWTException, IOException{
					
					
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					driver.get(envirnment);
					
					Click("Please click Forgot Password link",GetData.ForgotPassword);
					
					JavascriptExecutor scroll = (JavascriptExecutor) driver;
					scroll.executeScript("window.scrollBy(0,300)");
					
					Input("Please Enter UserName", GetData.ForgotEmail, TestData.email);
					Thread.sleep(3000);

					Click("Please click Forgot Password button",GetData.ForgotButton);
					Thread.sleep(5000);
					
				}
}

