package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Leads_CreatedDate"                                
     , summary=""
     , relativeUrl=""
     , connection="RegressionOrg"
     )             
public class Leads_CreatedDate {

	@LinkType()
	@FindBy(xpath = "//th[contains(@class, \"initialSortDesc\")]/div/a")
	public WebElement CreatedDate;
			
}
