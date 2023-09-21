package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="VF Community"                                
               , summary=""
               , page="VFCommunity"
               , namespacePrefix=""
               , object="Case"
               , connection="RegressionOrg"
     )             
public class VFCommunity {

	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.AssetId}\"]")
	@SalesforceField(name = "AssetId", object = "Case")
	public WebElement asset;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Origin}\"]")
	@SalesforceField(name = "Origin", object = "Case")
	public WebElement caseOrigin;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.BusinessHoursId}\"]")
	@SalesforceField(name = "BusinessHoursId", object = "Case")
	public WebElement businessHours;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Reason}\"]")
	@SalesforceField(name = "Reason", object = "Case")
	public WebElement caseReason;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Description}\"]")
	@SalesforceField(name = "Description", object = "Case")
	public WebElement description;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Priority}\"]")
	@SalesforceField(name = "Priority", object = "Case")
	public WebElement priority;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Type}\"]")
	@SalesforceField(name = "Type", object = "Case")
	public WebElement type;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.IsEscalated}\"]")
	@SalesforceField(name = "IsEscalated", object = "Case")
	public WebElement escalated;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Subject}\"]")
	@SalesforceField(name = "Subject", object = "Case")
	public WebElement subject;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.ContactId}\"]")
	@SalesforceField(name = "ContactId", object = "Case")
	public WebElement contactName;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.AccountId}\"]")
	@SalesforceField(name = "AccountId", object = "Case")
	public WebElement accountName;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!save}']")
	public WebElement save;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!save}']")
	public WebElement save1;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!cancel}']")
	public WebElement cancel;
	
}
