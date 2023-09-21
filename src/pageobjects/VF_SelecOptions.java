package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="VF_ Selec Options"                                
               , summary=""
               , page="VF_SelecOptions"
               , namespacePrefix=""
               , object=""
               , connection="RegressionOrg"
     )             
public class VF_SelecOptions {

	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!test}']")
	public WebElement test;
	@BooleanType()
	@FindByLabel(label = "Canada")
	public WebElement canada;
	@TextType()
	@FindBy(xpath = "//li[normalize-space(.)='a:CANADA']")
	public WebElement Can;
	
}
