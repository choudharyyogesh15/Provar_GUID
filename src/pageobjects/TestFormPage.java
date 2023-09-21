package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;
import com.provar.plugins.forcedotcom.core.ui.pagecontrols.cke.CkEditor;

@SalesforcePage( title="Test Form Page"                                
               , summary=""
               , page="TestFormPage"
               , namespacePrefix=""
               , object="Case"
               , connection="RegressionOrg"
     )             
public class TestFormPage {

	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Currency__c}\"]")
	@SalesforceField(name = "Currency__c", object = "Case")
	public WebElement currency;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.TestNumber__c}\"]")
	@SalesforceField(name = "TestNumber__c", object = "Case")
	public WebElement testNumber;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.BusinessHoursId}\"]")
	@SalesforceField(name = "BusinessHoursId", object = "Case")
	public WebElement businessHours;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!save}']")
	public WebElement save;
	@VisualforceBy(componentXPath = "apex:include[@pagename='UAT_INNERVF']//apex:inputField[@value = \"{!case.BusinessHoursId}\"]")
	@SalesforceField(name = "BusinessHoursId", object = "Case")
	public WebElement businessHours1;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.TestURL__c}\"]")
	@SalesforceField(name = "TestURL__c", object = "Case")
	public WebElement testURL;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Reason}\"]")
	@SalesforceField(name = "Reason", object = "Case")
	public WebElement caseReason;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.IsEscalated}\"]")
	@SalesforceField(name = "IsEscalated", object = "Case")
	public WebElement escalated;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Subject}\"]")
	@SalesforceField(name = "Subject", object = "Case")
	public WebElement subject;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.AccountId}\"]")
	@SalesforceField(name = "AccountId", object = "Case")
	public WebElement accountName;
	@LinkType()
	@FindBy(linkText = "21/06/2019")
	public WebElement testDate;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.TestMulti__c}\"]")
	@SalesforceField(name = "TestMulti__c", object = "Case")
	public WebElement testMulti;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.TestPercent__c}\"]")
	@SalesforceField(name = "TestPercent__c", object = "Case")
	public WebElement testPercent;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.AssetId}\"]")
	@SalesforceField(name = "AssetId", object = "Case")
	public WebElement asset;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Origin}\"]")
	@SalesforceField(name = "Origin", object = "Case")
	public WebElement caseOrigin;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Description}\"]")
	@SalesforceField(name = "Description", object = "Case")
	public WebElement description;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Priority}\"]")
	@SalesforceField(name = "Priority", object = "Case")
	public WebElement priority;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Type}\"]")
	@SalesforceField(name = "Type", object = "Case")
	public WebElement type;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.ContactId}\"]")
	@SalesforceField(name = "ContactId", object = "Case")
	public WebElement contactName;
	@BooleanType()
	@VisualforceBy(componentXPath = "apex:selectOption[1]")
	public WebElement one;
	@BooleanType()
	@VisualforceBy(componentXPath = "apex:selectOption[2]")
	public WebElement two;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.TestRichText__c}\"]")
	@SalesforceField(name = "TestRichText__c", object = "Case")
	public CkEditor textAreaDelegate_TestRichText__c;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.TestDate__c}\"]")
	@SalesforceField(name = "TestDate__c", object = "Case")
	public WebElement testDate1;
	@VisualforceBy(componentXPath = "apex:include[@pagename='UAT_INNERVF']//apex:inputField[@value = \"{!case.TestPercent__c}\"]")
	@SalesforceField(name = "TestPercent__c", object = "Case")
	public WebElement testPercent1;
	@VisualforceBy(componentXPath = "apex:include[@pagename='UAT_INNERVF']//apex:inputField[@value = \"{!case.AssetId}\"]")
	@SalesforceField(name = "AssetId", object = "Case")
	public WebElement asset1;
	@VisualforceBy(componentXPath = "apex:include[@pagename='UAT_INNERVF']//apex:inputField[@value = \"{!case.Origin}\"]")
	@SalesforceField(name = "Origin", object = "Case")
	public WebElement caseOrigin1;
	@VisualforceBy(componentXPath = "apex:include[@pagename='UAT_INNERVF']//apex:inputField[@value = \"{!case.Description}\"]")
	@SalesforceField(name = "Description", object = "Case")
	public WebElement description1;
	@VisualforceBy(componentXPath = "apex:include[@pagename='UAT_INNERVF']//apex:inputField[@value = \"{!case.Priority}\"]")
	@SalesforceField(name = "Priority", object = "Case")
	public WebElement priority1;
	@VisualforceBy(componentXPath = "apex:include[@pagename='UAT_INNERVF']//apex:inputField[@value = \"{!case.Type}\"]")
	@SalesforceField(name = "Type", object = "Case")
	public WebElement type1;
	@LinkType()
	@FindBy(linkText = "Click Here!!!!!")
	public WebElement clickHere;
	@VisualforceBy(componentXPath = "apex:include[@pagename='UAT_INNERVF']//apex:inputField[@value = \"{!case.Currency__c}\"]")
	@SalesforceField(name = "Currency__c", object = "Case")
	public WebElement currency1;
	@VisualforceBy(componentXPath = "apex:include[@pagename='UAT_INNERVF']//apex:inputField[@value = \"{!case.TestNumber__c}\"]")
	@SalesforceField(name = "TestNumber__c", object = "Case")
	public WebElement testNumber1;
	@VisualforceBy(componentXPath = "apex:include[@pagename='UAT_INNERVF']//apex:inputField[@value = \"{!case.TestURL__c}\"]")
	@SalesforceField(name = "TestURL__c", object = "Case")
	public WebElement testURL1;
	@VisualforceBy(componentXPath = "apex:include[@pagename='UAT_INNERVF']//apex:inputField[@value = \"{!case.Reason}\"]")
	@SalesforceField(name = "Reason", object = "Case")
	public WebElement caseReason1;
	@VisualforceBy(componentXPath = "apex:include[@pagename='UAT_INNERVF']//apex:inputField[@value = \"{!case.IsEscalated}\"]")
	@SalesforceField(name = "IsEscalated", object = "Case")
	public WebElement escalated1;
	@VisualforceBy(componentXPath = "apex:include[@pagename='UAT_INNERVF']//apex:inputField[@value = \"{!case.Subject}\"]")
	@SalesforceField(name = "Subject", object = "Case")
	public WebElement subject1;
	@VisualforceBy(componentXPath = "apex:include[@pagename='UAT_INNERVF']//apex:inputField[@value = \"{!case.AccountId}\"]")
	@SalesforceField(name = "AccountId", object = "Case")
	public WebElement accountName1;
	@VisualforceBy(componentXPath = "apex:include[@pagename='UAT_INNERVF']//apex:inputField[@value = \"{!case.TestMulti__c}\"]")
	@SalesforceField(name = "TestMulti__c", object = "Case")
	public WebElement testMulti1;
	@VisualforceBy(componentXPath = "apex:include[@pagename='UAT_INNERVF']//apex:inputField[@value = \"{!case.ContactId}\"]")
	@SalesforceField(name = "ContactId", object = "Case")
	public WebElement contactName1;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:include[@pagename='UAT_INNERVF']//apex:commandButton[@action='{!save}']")
	public WebElement save1;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Click Here!!!!!']")
	public WebElement clickHere1;
	@TextType()
	@SalesforceField(object = "Case")
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.TestDate__c}\"]")
	public WebElement testDate2;
	@LinkType()
	@FindBy(linkText = "16/09/2019")
	public WebElement testDate21;
	@VisualforceBy(componentXPath = "apex:include[@pagename='UAT_INNERVF']//apex:inputField[@value = \"{!case.TestDate__c}\"]")
	@SalesforceField(name = "TestDate__c", object = "Case")
	public WebElement testDate3;
	@LinkType()
	@FindBy(linkText = "29/06/2020")
	public WebElement testDate4;
	@LinkType()
	@FindByLabel(label = "TestDate")
	public WebElement testDate5;
	
}
