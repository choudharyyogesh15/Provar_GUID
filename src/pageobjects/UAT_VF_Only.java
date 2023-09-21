package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.model.ui.api.UiFacet;
import com.provar.core.testapi.annotations.*;
import com.provar.plugins.forcedotcom.core.ui.pagecontrols.cke.CkEditor;

@SalesforcePage( title="UAT_ VF_ Only"                                
               , summary=""
               , page="UAT_VF_Only"
               , namespacePrefix=""
               , object="Case"
               , connection="RegressionOrg"
     )             
public class UAT_VF_Only {

	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Currency__c}\"]")
	@SalesforceField(name = "Currency__c", object = "Case")
	public WebElement Currency;
	@LinkType()
	@FindBy(linkText = "18/09/2018")
	public WebElement testDate;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.TestDate__c}\"]")
	@SalesforceField(name = "TestDate__c", object = "Case")
	public WebElement testDate1;
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
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.AssetId}\"]")
	@SalesforceField(name = "AssetId", object = "Case")
	public WebElement asset1;
	@TextType()
	@FindBy(xpath = "//form/div[6]/div/div/div/div[1]/div/div[2]/table/tbody/tr/td[1]/table/tbody/tr[2]/td[1]")
	public WebElement test;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!save}']")
	public WebElement save;
	@LinkType()
	@FindBy(linkText = "06/06/2019")
	public WebElement testDate2;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Description}\"]")
	@SalesforceField(name = "Description", object = "Case")
	public WebElement description;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Subject}\"]")
	@SalesforceField(name = "Subject", object = "Case")
	public WebElement subject;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Reason}\"]")
	@SalesforceField(name = "Reason", object = "Case")
	public WebElement caseReason;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Priority}\"]")
	@SalesforceField(name = "Priority", object = "Case")
	public WebElement priority;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Type}\"]")
	@SalesforceField(name = "Type", object = "Case")
	public WebElement type;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.IsEscalated}\"]")
	@SalesforceField(name = "IsEscalated", object = "Case")
	public WebElement escalated;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Origin}\"]")
	@SalesforceField(name = "Origin", object = "Case")
	public WebElement caseOrigin;
	@BooleanType()
	@VisualforceBy(componentXPath = "apex:selectOption[1]")
	public WebElement one;
	@BooleanType()
	@VisualforceBy(componentXPath = "apex:selectOption[2]")
	public WebElement two;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.TestRichText__c}\"]")
	@SalesforceField(name = "TestRichText__c", object = "Case")
	public CkEditor textAreaDelegate_TestRichText__c;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.BusinessHoursId}\"]")
	@SalesforceField(name = "BusinessHoursId", object = "Case")
	public WebElement businessHours;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.AccountId}\"]")
	@SalesforceField(name = "AccountId", object = "Case")
	public WebElement accountName;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.AssetId}\"]")
	@SalesforceField(name = "AssetId", object = "Case")
	public WebElement asset2;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.ContactId}\"]")
	@SalesforceField(name = "ContactId", object = "Case")
	public WebElement contactName;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!cancel}']")
	public WebElement cancel;
	@LinkType()
	@FindBy(linkText = "Yahoo Maps")
	public WebElement yahooMaps;
	
	@PageTable(row = PageBlockTable.class)
	@VisualforceBy(componentXPath = "apex:pageblockTable[@id='pbd']")
	public List<PageBlockTable> pageBlockTable;

	@PageRow(byColumn = true)
	public static class PageBlockTable {

		@TextType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!a.lastname}\"]")
		public WebElement lastName;
		@ButtonType()
		@VisualforceBy(componentXPath = "apex:commandButton[@action='{!delcontact}']")
		public WebElement deleteButton;
		@LinkType()
		@VisualforceBy(componentXPath = "apex:commandLink[@value='Delete']")
		public WebElement deleteLink;
		@LinkType()
		@VisualforceBy(componentXPath = "apex:outputField[@value='{!a.email}']")
		public WebElement email;
		@TextType()
		@VisualforceBy(componentXPath = "apex:outputField value='{!a.email}'")
		public WebElement mobile;
		@TextType()
		@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!a.accountid}\"]")
		public WebElement lookup;
	}

	@PageTable(row = Con.class)
	@VisualforceBy(componentXPath = "apex:dataTable[@value = \"{!con}\"]")
	public List<Con> con;

	@PageRow(byColumn = true)
	public static class Con {

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

	@PageRow()
	public static class HtmlTable {

		@TextType()
		@FindBy(xpath = "//td[normalize-space(.)='Jill']")
		public WebElement firstName;
		@TextType()
		@FindBy(xpath = "//td[normalize-space(.)='Smith']")
		public WebElement lastName;
		@TextType()
		@FindBy(xpath = "//td[normalize-space(.)='50']")
		public WebElement age;
		@TextType()
		@FindBy(xpath = "//td[normalize-space(.)='abc']")
		public WebElement random;
	}

	@PageRow(byColumn = true)
	public static class Con1 {

		@TextType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!a.lastname}\"]")
		public WebElement outerColumn1;
		@PageTable(row = Con2.class)
		@VisualforceBy(componentXPath = "apex:column/apex:pageblockTable[@value = \"{!con}\"]")
		public List<Con2> Con2;
		@TextType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!a.lastname}\"]")
		public WebElement outerColumn11;
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
	
	@PageTable(row = Con4.class)
	@VisualforceBy(componentXPath = "apex:pageblockTable[@id='pbd']")
	public List<Con4> Con4;

	@PageRow(byColumn = true)
	public static class Con4 {

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

	@PageTable(row = Con41.class)
	@VisualforceBy(componentXPath = "apex:pageblockTable[@id='pbd']")
	public List<Con41> con4;

	@PageRow(byColumn = true)
	public static class Con41 {

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
		@TextType()
		@VisualforceBy(componentXPath = "apex:pageblockTable[@id='pbd']//apex:outputField[@value = \"{!a.lastname}\"]")
		public WebElement lastName;
	}

	@PageRow()
	public static class Html_table {
		@FacetFindBy(findBy = @FindBy(xpath = ".//th[normalize-space(.)='First name']"), facet = UiFacet.HEADER)
		@TextType()
		@FindBy(xpath = "//td[normalize-space(.)='Jill']")
		public WebElement firstName;
		@FacetFindBy(findBy = @FindBy(xpath = ".//th[normalize-space(.)='Last name']"), facet = UiFacet.HEADER)
		@TextType()
		@FindBy(xpath = "//td[normalize-space(.)='Smith']")
		public WebElement lastName;
		@FacetFindBy(findBy = @FindBy(xpath = ".//th[normalize-space(.)='Age']"), facet = UiFacet.HEADER)
		@TextType()
		@FindBy(xpath = "//td[normalize-space(.)='50']")
		public WebElement age;
		@FacetFindBy(findBy = @FindBy(xpath = ".//th[normalize-space(.)='Random']"), facet = UiFacet.HEADER)
		@TextType()
		@FindBy(xpath = "//td[normalize-space(.)='abc']")
		public WebElement random;
	}

	@PageTable(row = Con1.class)
	@VisualforceBy(componentXPath = "apex:pageBlock[not(@id)][5]/apex:pageBlockSection/apex:pageblockTable[@value = \"{!con}\"]")
	public List<Con1> con1;
	
	@FacetFindBys(value = {
            @FacetFindBy(findBy = @FindBy(xpath = "(//div[6]//td[1]/table)[1]/tbody/tr"), facet = UiFacet.DATA_ROWS),
            @FacetFindBy(findBy = @FindBy(xpath = "//td[normalize-space(.)='Jill']"), facet = UiFacet.HEADER_ROW) })
    @FindBy(xpath = "//div/table/tbody/tr/td/table")
    @PageTable(firstRowContainsHeaders = false, row = Html_table.class)
    public List<Html_table> html_table;
	
	
}
