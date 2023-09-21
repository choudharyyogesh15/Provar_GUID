package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="VerifyQuickActions"                                
     , summary=""
     , relativeUrl=""
     , connection="RegressionOrg"
     )             
public class VerifyQuickActions {

	@LinkType()
	@FindBy(xpath = "//a[contains(@class, \"subjectLink\")]")
	public WebElement Email;
	@LinkType()
	@FindBy(xpath = "//a[contains(@class, \"subjectLink\")]")
	public WebElement meeting;
	@ButtonType()
	@FindByLabel(label = "Close")
	public WebElement close;
			
}
