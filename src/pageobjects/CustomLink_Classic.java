package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="CustomLink_Classic"                                
     , summary=""
     , relativeUrl=""
     , connection="RegressionOrg"
     )             
public class CustomLink_Classic {

//	@TextType()
//	@FindBy(xpath = "(//td[@id='bodyCell']//td)[2]")
//	public WebElement RecordDeleted1;
	@LinkType()
	@FindBy(css = ".ptBreadcrumb a")
	public WebElement SharingPage_AccountName;
	@TextType()
	@FindBy(xpath = "//td[normalize-space(.)='The record you attempted to access has been deleted. The user who deleted this record may be able to recover it from the Recycle Bin. Deleted data is stored in the Recycle Bin for 15 days.']")
	public WebElement RecordDeleted;
			
}
