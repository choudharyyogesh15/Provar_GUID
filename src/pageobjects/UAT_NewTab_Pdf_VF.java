package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="UAT_ New Tab_ Pdf_ VF"                                
               , summary=""
               , page="UAT_NewTab_Pdf_VF"
               , namespacePrefix=""
               , object=""
               , connection="RegressionOrg"
     )             
public class UAT_NewTab_Pdf_VF {

	@LinkType()
	@FindBy(linkText = "Click here for pdf in new tab")
	public WebElement clickHereForPdfInNewTab;
	
}
