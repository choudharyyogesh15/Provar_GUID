package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Created_Date_Sort"                                
     , summary=""
     , relativeUrl=""
     , connection="RegressionOrg"
     )             
public class Created_Date_Sort {

	@LinkType()
	@FindBy(xpath = "//tr[contains(@class, \"slds-text-title--caps\")]/th[9]/div/a")
	public WebElement CreatedDate;
			
}
