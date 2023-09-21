package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;
import com.provar.plugins.forcedotcom.core.ui.pagecontrols.aura.ui.AuraUiInputDataTime;

@SalesforcePage( title="LightningComponentQA_Contact"                                
               , summary=""
               , connection="RegressionOrg"
               , auraComponent="CreateNewEvent"
               , namespacePrefix=""
     )             
public class LightningComponentQA_Contact {

	@TextType()
	@AuraBy(componentXPath = "//force:modal//ui:inputText[@value= '{!v.newEvent.Subject}']")
	public WebElement subject;
	@TextType()
	@AuraBy(componentXPath = "//force:modal//ui:inputText[@value= '{!v.newEvent.Description}']")
	public WebElement description;
	@TextType()
	@AuraBy(componentXPath = "//force:modal//ui:inputDateTime[@value= '{!v.newEvent.StartDateTime}']")
	public AuraUiInputDataTime eventStartDate;
	@TextType()
	@AuraBy(componentXPath = "//force:modal//ui:inputDateTime[@value= '{!v.newEvent.EndDateTime}']")
	public AuraUiInputDataTime eventEndDate;
	@TextType()
	@AuraBy(componentXPath = "//force:modal//ui:inputDateTime[@value= '{!v.newEvent.EndDateTime}']")
	public AuraUiInputDataTime eventEndDate1;
	@TextType()
	@AuraBy(componentXPath = "//force:modal//ui:inputDateTime[@value= '{!v.newEvent.StartDateTime}']")
	public AuraUiInputDataTime eventStartDate1;
	@PageRow()
	public static class Contacts {

		@TextType()
		@AuraBy(componentXPath = "//force:modal//ui:inputText[@value= '{!contac.Email}']")
		public WebElement Email;
		@TextType()
		@AuraBy(componentXPath = "//force:modal//aura:expression[@value= '{!contac.Name}']")
		public WebElement ContactName;
		@TextType()
		@AuraBy(componentXPath = "//force:modal//aura:expression[@value= '{!contac.Id}']")
		public WebElement Id;
	}
	@AuraBy(componentXPath = "//aura:iteration[@iterationListName = 'v.contacts']")
	@PageTable(firstRowContainsHeaders = false, row = Contacts.class)
	public List<Contacts> contacts;
	
}
