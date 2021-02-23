package PageFactoryandTestdata;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Master.ExecutionFile;



public class Locatiors extends ExecutionFile{
	

	@FindBy(xpath="//input[contains(@id,'user')]") public WebElement UserName;
	@FindBy(xpath="//input[contains(@id,'password')]") public WebElement Password;
	@FindBy(xpath="//input[contains(@id,'Submit')]") public WebElement LoginButton;
	@FindBy(xpath="//a[contains(@href, '/publishers')]") public WebElement Publishers;
	@FindBy(xpath="//tbody/tr") public List<WebElement> publisherrecords;
	@FindBy(xpath="//a[contains(@href, '/offers')]") public WebElement Offers;
	
	@FindBy(xpath="//button[contains(@data-test, 'inspect')]") public List<WebElement> ViewBudget;

	@FindBy(xpath="//div[contains(@class, 'ant-empty-description')]") public List<WebElement> nobudget;

		
}




