package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="ContactSLDS"                                
               , summary=""
               , connection="LightningCustomization"
               , lightningComponent="NewContactLDS"
               , namespacePrefix=""
     )             
public class ContactSLDS {

	@TextType()
	@AuraBy(componentXPath = "//force:modal//lightning:input[@value='{!v.simpleNewContact.FirstName}']", qualifier = "firstName")
	public WebElement firstName;
	@TextType()
	@AuraBy(componentXPath = "//force:modal//lightning:input[@value='{!v.simpleNewContact.LastName}']", qualifier = "lastname")
	public WebElement lastName;
	@TextType()
	@AuraBy(componentXPath = "//force:modal//lightning:input[@value='{!v.simpleNewContact.Title}']", qualifier = "title")
	public WebElement title;
	@TextType()
	@AuraBy(componentXPath = "//force:modal//lightning:input[@value='{!v.simpleNewContact.Phone}']", qualifier = "phone")
	public WebElement phoneNumber;
	@TextType()
	@AuraBy(componentXPath = "//force:modal//lightning:input[@value='{!v.simpleNewContact.Email}']", qualifier = "email")
	public WebElement email;
	@ButtonType()
	@FindByLabel(label = "Save Contact")
	public WebElement saveContact;
	@ButtonType()
	@FindByLabel(label = "Cancel")
	public WebElement cancel;
	
}
