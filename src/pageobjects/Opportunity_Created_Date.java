package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Opportunity_Created_Date"                                
     , summary=""
     , relativeUrl=""
     , connection="RegressionOrg"
     )             
public class Opportunity_Created_Date {

	@LinkType()
	@FindBy(xpath = "//tr[contains(@class, \"slds-text-title--caps\")]/th[9]/div/a/span[2]")
	public WebElement CreatedDate;
			
}
