package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="AppPageHeaderand3Columns"                                
               , summary=""
               , connection="LightningCustomization"
               , lightningComponent="NewContactLDS"
               , namespacePrefix=""
     )             
public class AppPageHeaderand3Columns {

	@TextType()
	@AuraBy(componentXPath = "//lightning:input[@value= '{!v.simpleNewContact.FirstName}']")
	public WebElement firstName;
	@TextType()
	@AuraBy(componentXPath = "//lightning:input[@value= '{!v.simpleNewContact.LastName}']")
	public WebElement lastName;
	@TextType()
	@AuraBy(componentXPath = "//lightning:input[@value= '{!v.simpleNewContact.Title}']")
	public WebElement title;
	@TextType()
	@AuraBy(componentXPath = "//lightning:input[@value= '{!v.simpleNewContact.Phone}']")
	public WebElement phoneNumber;
	@TextType()
	@AuraBy(componentXPath = "//lightning:input[@value= '{!v.simpleNewContact.Email}']")
	public WebElement email;
	@ButtonType()
	@FindByLabel(label = "Save Contact")
	public WebElement saveContact;
	@ButtonType()
	@FindByLabel(label = "Cancel")
	public WebElement cancel;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, \"flexipageComponent\")]/button[1]")
	public WebElement cancelbyxpath;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, \"flexipageComponent\")]/button[2]")
	public WebElement saveContactbyxpath;
	
}
