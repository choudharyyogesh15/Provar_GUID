package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;
import com.provar.plugins.forcedotcom.core.ui.pagecontrols.cke.CkEditor;
import java.util.List;

@SalesforcePage( title="UAT_ VF_ INSIDE_ VF"                                
               , summary=""
               , page="UAT_VF_INSIDE_VF"
               , namespacePrefix=""
               , object="Case"
               , connection="RegressionOrg"
     )             
public class UAT_VF_INSIDE_VF {

	@VisualforceBy(componentXPath = "apex:form//apex:inputField[@value = \"{!case.Currency__c}\"]")
	@SalesforceField(name = "Currency__c", object = "Case")
	public WebElement currency;
	
	@VisualforceBy(componentXPath = "apex:form//apex:inputField[@value = \"{!case.Type}\"]")
	@SalesforceField(name = "Type", object = "Case")
	public WebElement type;

	@BooleanType()
	@VisualforceBy(componentXPath = "apex:form//apex:selectRadio/apex:selectOption[1]")
	public WebElement one;

	@VisualforceBy(componentXPath = "apex:include[@pagename='UAT_VF_Only']//apex:form//apex:inputField[@value = \"{!case.Currency__c}\"]")
	@SalesforceField(name = "Currency__c", object = "Case")
	public WebElement currency1;

	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.TestMulti__c}\"]")
	@SalesforceField(name = "TestMulti__c", object = "Case")
	public WebElement testMulti;

	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.TestNumber__c}\"]")
	@SalesforceField(name = "TestNumber__c", object = "Case")
	public WebElement testNumber;

	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.TestPercent__c}\"]")
	@SalesforceField(name = "TestPercent__c", object = "Case")
	public WebElement testPercent;

	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.TestURL__c}\"]")
	@SalesforceField(name = "TestURL__c", object = "Case")
	public WebElement testURL;

	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.AssetId}\"]")
	@SalesforceField(name = "AssetId", object = "Case")
	public WebElement asset;

	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.BusinessHoursId}\"]")
	@SalesforceField(name = "BusinessHoursId", object = "Case")
	public WebElement businessHours;

	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Reason}\"]")
	@SalesforceField(name = "Reason", object = "Case")
	public WebElement caseReason;

	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Origin}\"]")
	@SalesforceField(name = "Origin", object = "Case")
	public WebElement caseOrigin;

	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Description}\"]")
	@SalesforceField(name = "Description", object = "Case")
	public WebElement description;

	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.IsEscalated}\"]")
	@SalesforceField(name = "IsEscalated", object = "Case")
	public WebElement escalated;

	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Subject}\"]")
	@SalesforceField(name = "Subject", object = "Case")
	public WebElement subject;

	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Priority}\"]")
	@SalesforceField(name = "Priority", object = "Case")
	public WebElement priority;

	@VisualforceBy(componentXPath = "apex:include[@pagename='UAT_VF_Only']//apex:form//apex:inputField[@value = \"{!case.Type}\"]")
	@SalesforceField(name = "Type", object = "Case")
	public WebElement type1;

	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.ContactId}\"]")
	@SalesforceField(name = "ContactId", object = "Case")
	public WebElement contactName;

	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.AccountId}\"]")
	@SalesforceField(name = "AccountId", object = "Case")
	public WebElement accountName;

	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.TestRichText__c}\"]")
	@SalesforceField(name = "TestRichText__c", object = "Case")
	public CkEditor textAreaDelegate_TestRichText__c;

	@BooleanType()
	@VisualforceBy(componentXPath = "apex:include[@pagename='UAT_VF_Only']//apex:form//apex:selectRadio/apex:selectOption[1]")
	public WebElement one1;

	@ButtonType()
	@VisualforceBy(componentXPath = "apex:include[@pagename='UAT_VF_Only']//apex:form//apex:commandButton[@action='{!save}']")
	public WebElement save;

	@LinkType()
	@FindByLabel(label = "TestDate")
	public WebElement testDate;

	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.TestFormula__c}\"]")
	@SalesforceField(name = "TestFormula__c", object = "Case")
	public WebElement TestFormula;

	@ButtonType()
	@VisualforceBy(componentXPath = "apex:form//apex:commandButton[@action='{!cancel}']")
	public WebElement cancel;

	@LinkType()
	@FindBy(linkText = "Google Search")
	public WebElement googleSearch;

	@LinkType()
	@FindBy(linkText = "Google Maps")
	public WebElement googleMaps;

	@LinkType()
	@FindByLabel(label = "Yahoo Maps")
	public WebElement yahooMaps;

	@LinkType()
	@FindBy(linkText = "Google News")
	public WebElement googleNews;

	@PageTable(row = Con.class)
	@VisualforceBy(componentXPath = "apex:pageblockTable[@id='pbd']")
	public List<Con> Con;

	@PageRow(byColumn = true)
	public static class Con {

		@TextType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!a.lastname}\"]")
		public WebElement lastName;
		@BooleanType()
		@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!a.donotcall}\"]")
		public WebElement checkbox;
		@ButtonType()
		@VisualforceBy(componentXPath = "apex:commandButton[@action='{!delcontact}']")
		public WebElement deleteButton;
		@LinkType()
		@VisualforceBy(componentXPath = "apex:commandLink[@value='Delete']")
		public WebElement deleteLink;
		@LinkType()
		@VisualforceBy(componentXPath = "apex:column[5]/apex:outputField[@value = \"{!a.email}\"]/a")
		public WebElement email;
		@TextType()
		@VisualforceBy(componentXPath = "apex:column[6]")
		public WebElement mobile;
		@TextType()
		@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!a.accountid}\"]")
		public WebElement lookup;
	}

	@PageTable(row = Con1.class)
	@VisualforceBy(componentXPath = "apex:pageBlock[not(@id)][5]/apex:pageBlockSection/apex:pageblockTable[@value = \"{!con}\"]")
	public List<Con1> Con1;

	@PageRow(byColumn = true)
	public static class Con1 {

		@TextType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!a.lastname}\"]")
		public WebElement outerColumn1;
		@PageTable(row = Con2.class)
		@VisualforceBy(componentXPath = "apex:column/apex:pageblockTable[@value = \"{!con}\"]")
		public List<Con2> Con2;
	}

	@PageRow(byColumn = true)
	public static class Con2 {

		@TextType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!m.lastname}\"]")
		public WebElement innerColumn1;
		@LinkType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!m.email}\"]/a")
		public WebElement innerColumn2;
	}

	@PageTable(row = Con3.class)
	@VisualforceBy(componentXPath = "apex:dataTable[@value = \"{!con}\"]")
	public List<Con3> Con3;

	@PageRow(byColumn = true)
	public static class Con3 {

		@TextType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!a.lastname}\"]")
		public WebElement lastName;
		@LinkType()
		@VisualforceBy(componentXPath = "apex:column[2]/apex:outputField[@value = \"{!a.email}\"]/a")
		public WebElement email;
		@TextType()
		@VisualforceBy(componentXPath = "apex:column[3]")
		public WebElement mobile;
	}
	
}
