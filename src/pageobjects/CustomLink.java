package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="CustomLink"                                
     , connection="RegressionOrg"
     )             
public class CustomLink {

	@BooleanType()
	@FindBy(xpath = "//div[contains(@class, \"warning\")]//input")
	public WebElement donTWarnMeAgainForWwwGoogleCom;
	@TextType()
	@FindBy(xpath = "//p[contains(@class, \"detail\")]")
	public WebElement RecordDeleted;
	@LinkType()
	@FindBy(xpath = "(//table[@class = 'forceRecordLayout forceVirtualTreeGrid--default forceVirtualTreeGrid resizable-cols']//th)[7]//a")
	public WebElement AccName;
	@TextType()
	//@FindBy(id = "logo")
	@FindBy(xpath = "//form[@id='tsf']/div/div/div/a")
	public WebElement Alphabet;
	@LinkType()
	@FindBy(linkText = "Investors")
	public WebElement investors;
	@TextType()
	@FindBy(id = "lst-ib")
	public WebElement searchBox;
	@ButtonType()
	@FindBy(xpath = "//button[@aria-label=\"Directions\"]")
	public WebElement direction;
	@TextType()
	@FindBy(xpath = "//input[@id='searchboxinput']")
	public WebElement search;
	@TextType()
	@FindBy(xpath = "//input[2]")
	public WebElement search_text;
	@TextType()
	@FindBy(xpath = "//div/input[@name='q']")
	public WebElement google_search;
	@LinkType()
	@FindBy(xpath = "//li[3]/a[normalize-space(.)='Create an account']")
	public WebElement createAnAccount;
	@TextType()
	@FindBy(xpath = "//input[@id='yschsp']")
	public WebElement searchQuery;
	@LinkType()
	@FindBy(xpath = "//a[contains(@class,'mobile-after') and @data-action='create an account']")
	public WebElement getGmailCreateAnAccount;
	@TextType()
	@FindBy(xpath = "//*[@aria-label=\"Settings\"]/span")
	public WebElement settingIcon;		
}
