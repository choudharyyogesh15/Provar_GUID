package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Created_Date_1"                                
     , summary=""
     , relativeUrl=""
     , connection="RegressionOrg"
     )             
public class Created_Date_1 {

	@LinkType()
	@FindBy(xpath = "//tr[contains(@class, \"x-grid3-hd-row\")]/td[10]/div")
	public WebElement CreatedDate1;
			
}
