package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;
import com.provar.plugins.forcedotcom.core.ui.pagecontrols.aura.ui.AuraUiInputDataTime;

@SalesforcePage( title="CreateNewEvent_on_FlexiPageAG"                                
               , summary=""
               , connection="flexi"
               , lightningComponent="CreateNewEvent"
               , namespacePrefix=""
     )             
public class CreateNewEvent_on_FlexiPageAG {

	@TextType()
	@AuraBy(componentXPath = "//ui:inputText[@aura:id= 'Subject']")
	public WebElement subject;
	@TextType()
	@AuraBy(componentXPath = "//ui:inputText[@aura:id= 'Description']")
	public WebElement description;
	@TextType()
	@AuraBy(componentXPath = "//ui:inputDateTime[@aura:id= 'eventStartDate']")
	public AuraUiInputDataTime startDateTime;
	@TextType()
	@AuraBy(componentXPath = "//ui:inputDateTime[@aura:id= 'eventEndDate']")
	public AuraUiInputDataTime endDateTime;
	@PageRow()
	public static class Contacts {

		@TextType()
		@AuraBy(componentXPath = "//ui:inputText[@aura:id= 'eId']")
		public WebElement Email;
		@TextType()
		@AuraBy(componentXPath = "//aura:expression[@value= '{!contac.Name}']")
		public WebElement ContactName;
		@TextType()
		@AuraBy(componentXPath = "//aura:expression[@value= '{!contac.Id}']")
		public WebElement Id;
	}
	@AuraBy(componentXPath = "//aura:iteration[@iterationListName = 'v.contacts']")
	@PageTable(firstRowContainsHeaders = false, row = Contacts.class)
	public List<Contacts> contacts;
	
}
