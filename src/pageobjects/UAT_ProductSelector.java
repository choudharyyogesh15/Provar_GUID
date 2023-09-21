package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="UAT_ Product Selector"                                
               , summary=""
               , page="UAT_ProductSelector"
               , namespacePrefix=""
               , object="Opportunity"
               , connection="PrereleaseOrg"
     )             
public class UAT_ProductSelector {

	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!Opportunity.Name}\"]")
	@SalesforceField(name = "Name", object = "Opportunity")
	public WebElement opportunityName;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!Opportunity.StageName}\"]")
	@SalesforceField(name = "StageName", object = "Opportunity")
	public WebElement stage;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!Opportunity.CloseDate}\"]")
	@SalesforceField(name = "CloseDate", object = "Opportunity")
	public WebElement closeDate;
	@LinkType()
	@FindBy(linkText = "25/08/2020")
	public WebElement closeDate1;
	@PageTable(row = LineItems.class)
	@VisualforceBy(componentXPath = "apex:pageBlockTable[@value = \"{!LineItems}\"]")
	public List<LineItems> lineItems;
	@PageRow(byColumn = true)
	public static class LineItems {

		@BooleanType()
		@VisualforceBy(componentXPath = "apex:inputCheckbox[@value = \"{!Check}\"]")
		public WebElement checkBox;
		@ChoiceListType()
		@VisualforceBy(componentXPath = "apex:selectList[@value = \"{!dummyId}\"]")
		public WebElement selectProduct;
		@TextType()
		@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!lines.TotalPrice}\"]")
		public WebElement amount;
		@VisualforceBy(componentXPath = "apex:inputTextArea[@value = \"{!lines.Description}\"]")
		@SalesforceField(name = "Description", object = "Opportunity")
		public WebElement notes;
	}
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!save}']")
	public WebElement save;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!cancel}']")
	public WebElement cancel;
	
}
