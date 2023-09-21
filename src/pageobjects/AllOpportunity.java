package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="AllOpportunity"                                
     , summary=""
     , relativeUrl=""
     , connection="Regression"
     )             
public class AllOpportunity {

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='SortOpportunity Name']")
	public WebElement Name;
			
}
