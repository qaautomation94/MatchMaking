
package TestCases;


import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import PageFactoryandTestdata.HelpingFunction;
import PageFactoryandTestdata.Locatiors;
import PageFactoryandTestdata.TestData;


public class Profile extends HelpingFunction  {

				public static  void editProfile() throws InterruptedException, AWTException, IOException{
						
						
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					
					Actions action = new Actions(driver);
					WebElement prof = GetData.profile;
					action.moveToElement(prof).build().perform();

					Click("Please click Edit Profile button",GetData.EditProfile);
					Thread.sleep(10000);
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,500)");
					
					Input("Please Enter Profile title", GetData.ProfileTitle, TestData.TITLE);
					Input("Please Enter Profile Proposal", GetData.ProfileProposal, TestData.PROPOSAL);
					
					Click("Please click Submit Your Proposal for Review button",GetData.SubmitProposal);
					
					Assert.assertTrue(GetData.SuccessMessage.isDisplayed());

					
				}
				
				public static  void editAccount() throws InterruptedException, AWTException, IOException{
					
					
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					
					Actions action = new Actions(driver);
					WebElement prof = GetData.profile;
					action.moveToElement(prof).build().perform();

					Click("Please click Edit Account button",GetData.EditAccount);
					Thread.sleep(10000);
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,700)");
					
					Select day = new Select(GetData.ChangeDOB);
					day.selectByIndex(5);
					
					
					Click("Please click on Update Account Details button",GetData.AccountDetails);
					
					//Assert.assertTrue(GetData.SuccessMessage.isDisplayed());

					
				}
				
               public static  void editPersonal() throws InterruptedException, AWTException, IOException{
					
					
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					
					Actions action = new Actions(driver);
					WebElement prof = GetData.profile;
					action.moveToElement(prof).build().perform();

					Click("Please click Edit Personal button",GetData.EditPersonal);
					Thread.sleep(10000);
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,300)");
					
					Select body = new Select(GetData.Body);
					body.selectByIndex(3);
					
					JavascriptExecutor bottomscroll = (JavascriptExecutor) driver;
					bottomscroll.executeScript("window.scrollBy(0,1000)");
					
					
					Click("Please click on Update Personal Profile button",GetData.PersonalProposal);
					
					//Assert.assertTrue(GetData.SuccessMessage.isDisplayed());

					
				}
               
               public static  void editPartner() throws InterruptedException, AWTException, IOException{
					
					
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					
					Actions action = new Actions(driver);
					WebElement prof = GetData.profile;
					action.moveToElement(prof).build().perform();

					Click("Please click Edit Partner button",GetData.EditPartner);
					Thread.sleep(10000);
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,300)");
					
					Select weight = new Select(GetData.Weight);
					weight.selectByIndex(7);
					
					JavascriptExecutor bottomscroll = (JavascriptExecutor) driver;
					bottomscroll.executeScript("window.scrollBy(0,1000)");
					
					
					Click("Please click on Update Partner Preferences button",GetData.PartnerPreferences);
					
					//Assert.assertTrue(GetData.SuccessMessage.isDisplayed());

					
				}
               
               public static  void editSettings() throws InterruptedException, AWTException, IOException{
					
					
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					
					Actions action = new Actions(driver);
					WebElement prof = GetData.profile;
					action.moveToElement(prof).build().perform();

					Click("Please click Edit Settings button",GetData.EditSettings);
					Thread.sleep(10000);
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,300)");
					
					Click("Please click on Subscribe Email Notifications button",GetData.EmailNotification);
					Click("Please click on Update Preferences button",GetData.UpdatePreferences);
					
					//Assert.assertTrue(GetData.SuccessMessage.isDisplayed());

				}
               
               public static  void editVerification() throws InterruptedException, AWTException, IOException{
					
					
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					
					Actions action = new Actions(driver);
					WebElement prof = GetData.profile;
					action.moveToElement(prof).build().perform();

					Click("Please click Edit Verification button",GetData.EditVerification);
					Thread.sleep(10000);
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,300)");
					
					Input("Please Enter Real Full Name", GetData.RealName, TestData.REALNAME);
					Input("Please Enter Mobile Number", GetData.MobileNumber, TestData.MOBILENUMBER);
					Click("Please click on Verify My Account button",GetData.VerifyAccount);
					
					//Assert.assertTrue(GetData.SuccessMessage.isDisplayed());

				}


			
}

