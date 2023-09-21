package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Created_Date"                                
     , summary=""
     , relativeUrl=""
     , connection="RegressionOrg"
     )             
public class Created_Date {

	@LinkType()
	@FindBy(xpath = "//tr[contains(@class, \"slds-text-title--caps\")]/th[9]/div/a")
	public WebElement CreatedDate;
	@LinkType()
	@FindBy(xpath = "//tr[contains(@class, \"x-grid3-hd-row\")]/td[10]/div")
	public WebElement CreatedDate1;
			
}
