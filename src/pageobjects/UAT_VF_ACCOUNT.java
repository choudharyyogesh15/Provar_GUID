package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="UAT_ VF_ ACCOUNT"                                
               , summary=""
               , page="UAT_VF_ACCOUNT"
               , namespacePrefix=""
               , object="Account"
               , connection="RegressionOrg"
     )             
public class UAT_VF_ACCOUNT {

	@LinkType()
	@FindBy(linkText = "Close")
	public WebElement close;
	@LinkType()
	@FindBy(xpath = "//div[@class='menuButton menuButtonActivated']//a[text()='Disable Partner Account']")
	public WebElement DisablePartnerAccount;
	
}
