package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="caselistview2"                                
     , summary=""
     , relativeUrl=""
     , connection="RegressionOrg"
     )             
public class caselistview2 {

	@TextType()
	@FindBy(xpath = "//div[text()='Created Date']")
	public WebElement CreatedDate;
	@LinkType()
	@FindBy(linkText = "Sort Descending")
	public WebElement sortDescending;
			
}
