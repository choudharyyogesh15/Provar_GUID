package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Google"                                
     , summary=""
     , relativeUrl=""
     , connection="RegressionOrg"
     )             
public class Google {

	@TextType()
	@FindBy(name = "q")
	public WebElement GoogleSearch;
	@TextType()
	@FindBy(xpath = "//div/div/div/div/div/div/div[normalize-space(.)='The page no longer exists. Try reloading it. If the problem persists, contact Salesforce support.']")
	public WebElement ErrorPopup;
			
}
