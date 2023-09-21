package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Contact_Created_Date"                                
     , summary=""
     , relativeUrl=""
     , connection="RegressionOrg"
     )             
public class Contact_Created_Date {

	@LinkType()
	@FindBy(xpath = "//th[contains(@class, \"initialSortDesc\")]/div/a/span[1]")
	public WebElement CreatedDate;
			
}
