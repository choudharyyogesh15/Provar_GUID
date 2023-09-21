package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;
import com.provar.plugins.forcedotcom.core.ui.pagecontrols.aura.ui.AuraUiInputDataTime;

@SalesforcePage( title="Create New Event"                                
               , summary=""
               , connection="flexi"
               , lightningComponent="CreateNewEvent"
               , namespacePrefix=""
     )             
public class CreateNewEvent {

	@TextType()
	@AuraBy(componentXPath = "//force:modal//ui:inputText[@aura:id= 'Subject']")
	public WebElement subject;
	@TextType()
	@AuraBy(componentXPath = "//force:modal//ui:inputText[@aura:id= 'Description']")
	public WebElement description;
	@TextType()
	@AuraBy(componentXPath = "//force:modal//ui:inputDateTime[@aura:id= 'eventStartDate']")
	public AuraUiInputDataTime startDateTime;
	@TextType()
	@AuraBy(componentXPath = "//force:modal//ui:inputDateTime[@aura:id= 'eventEndDate']")
	public AuraUiInputDataTime endDateTime;
	@PageRow()
	public static class Contacts {

		@TextType()
		@AuraBy(componentXPath = "//force:modal//ui:inputText[@aura:id= 'eId']")
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
	@TextType()
	@AuraBy(componentXPath = "//force:modal//ui:button[@press= 'c.handleSaveEvent']")
	public WebElement saveEvent;
	@ButtonType()
	@AuraBy(componentXPath = "//force:modal//ui:button[@aura:id= 'publisherCancelButton']")
	public WebElement cancel;
	@LinkType()
	@FindBy(linkText = "TestSearch")
	public WebElement testSearch;
	
}
