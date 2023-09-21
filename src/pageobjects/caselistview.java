package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="caselistview"                                
     , summary=""
     , relativeUrl=""
     , connection="RegressionOrg"
     )             
public class caselistview {

	@TextType()
	@FindBy(xpath = "//div[@title='Date/Time Opened']")
	public WebElement CreatedDate;
	@LinkType()
	@FindBy(linkText = "Sort Descending")
	public WebElement sortDescending;
			
}
