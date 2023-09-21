package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="CustomLinkActions"                                
     , summary=""
     , relativeUrl=""
     , connection="RegressionOrg"
     )             
public class CustomLinkActions {

	@PageWait.Field(field = "zoom_in_button", timeoutSeconds = 10)
	@ButtonType()
	@FindBy(id = "widget-zoom-in")
	public WebElement zoom_in_button;
	@LinkType()
	@FindBy(linkText = "News")
	public WebElement news;
	@TextType()
	@FindBy(name = "q")
	public WebElement searchbox;
	@FindBy(xpath = "//span[normalize-space(.)='Gmail']")
	@LinkType()
	public WebElement gmail;
	//@LinkType()
	//@FindBy(linkText = "Yahoo")
	//public WebElement yahoo;
	@LinkType()
	//@FindBy(id = "header-logo")
	//public WebElement yahoo;
	@FindBy(id = "ybar-logo")
	public WebElement yahoo;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Gmail']")
	public WebElement gmail1;
	@LinkType()
	@FindBy(xpath = "//div/div[1]/div[2]/div[1]/div/div/div[1]/div[3]/div[1]/a[normalize-space(.)='Create an account']")
	public WebElement getGmailCreateAnAccount;
			
}
