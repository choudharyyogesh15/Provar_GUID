package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Utility Bar_ Visualforce"                                
               , summary=""
               , page="VF_Account_Page"
               , namespacePrefix=""
               , object="Account"
               , connection="Regmain"
     )             
public class UtilityBar_Visualforce {

	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!account.Name}\"]")
	@SalesforceField(name = "Name", object = "Account")
	public WebElement accountName;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!account.Type}\"]")
	@SalesforceField(name = "Type", object = "Account")
	public WebElement type;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!account.Phone}\"]")
	@SalesforceField(name = "Phone", object = "Account")
	public WebElement phone;
	@TextType()
	@FindBy(xpath = "//td/div/input[@size='20']")
	public WebElement accountName1;
	@ChoiceListType(values = { @ChoiceListValue(value = "Analyst"), @ChoiceListValue(value = "Competitor"),
			@ChoiceListValue(value = "Customer"), @ChoiceListValue(value = "Integrator"),
			@ChoiceListValue(value = "Investor"), @ChoiceListValue(value = "Partner"),
			@ChoiceListValue(value = "Press"), @ChoiceListValue(value = "Prospect"),
			@ChoiceListValue(value = "Reseller"), @ChoiceListValue(value = "Other") })
	@FindByLabel(label = "Type")
	public WebElement type1;
	@TextType()
	@FindBy(name = "j_id0:j_id1:j_id2:j_id3:j_id6")
	public WebElement phone1;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!save}']")
	public WebElement save;
	
}
