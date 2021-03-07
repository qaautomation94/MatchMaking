
package TestCases;


import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import PageFactoryandTestdata.HelpingFunction;
import PageFactoryandTestdata.Locatiors;
import PageFactoryandTestdata.TestData;


public class Chat extends HelpingFunction  {

				public static  void chat() throws InterruptedException, AWTException, IOException{
						
						
					Locatiors GetData=PageFactory.initElements(driver, Locatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					driver.get(envirnment);

					Click("Please click chat button",GetData.ChatButton);
					Thread.sleep(3000);
					Click("Please click admin button",GetData.admin);
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,500)");

					List<WebElement> chatConversation = GetData.ChatConversations2;
					chatConversation.get(1).click();
					Thread.sleep(3000);
					Assert.assertTrue(GetData.NoChatText.isDisplayed());
					Thread.sleep(3000);
					
					List<WebElement> mailConversation = GetData.MailConversations;
					mailConversation.get(1).click();
					
					Click("Please click Set Favourite button",GetData.SetFavourite);
					Thread.sleep(3000);
					Assert.assertTrue(GetData.SetFavouriteText.isDisplayed() || GetData.AlreadyFavourite.isDisplayed());
					Thread.sleep(3000);
					Click("Please click Show Interest button",GetData.ShowInterest);
					Thread.sleep(3000);
					Assert.assertTrue(GetData.AlreadyShowedInterest.isDisplayed() || GetData.ShowInterestSuccess.isDisplayed());
					Thread.sleep(3000);
					List<WebElement> blockIcon = GetData.BlockIcon;
					blockIcon.get(3).click();
					Click("Please click Block Profile button",GetData.BlockProfile);
					Thread.sleep(3000);
					Assert.assertTrue(GetData.BlockProfileText.isDisplayed() || GetData.AlreadyBlockProfileText.isDisplayed());
					Thread.sleep(3000);
					
					blockIcon.get(3).click();
					Thread.sleep(3000);
					List<WebElement> reportProfile = GetData.ReportProfile;
					reportProfile.get(1).click();
					
					js.executeScript("window.scrollBy(0,1200)");
					
					Input("Please enter Reasons and Evidence", GetData.Reason, TestData.REASON);
					Click("Please click Report User Profile button",GetData.ReportUserProfile);
					
					//UNBLOCK
					Click("Please click Favours button",GetData.Favours);
					js.executeScript("window.scrollBy(0,300)");
					
					List<WebElement> myBlocked = GetData.MyBlocked2;
					myBlocked.get(1).click();
					js.executeScript("window.scrollBy(0,300)");
					Click("Please click Remove button",GetData.Remove);
					
					List<WebElement> myFavourites = GetData.MyFavourites2;
					myFavourites.get(1).click();
					js.executeScript("window.scrollBy(0,300)");
					Click("Please click Delete button",GetData.Delete);
					
					driver.switchTo().alert().accept();
				}
				
}

