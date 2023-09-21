package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="UtilityBar_Console_ContactSLDS"                                
               , summary=""
               , connection="Regmain"
               , lightningComponent="NewContactLDS"
               , namespacePrefix=""
     )             
public class UtilityBar_Console_ContactSLDS {

	@TextType()
	@AuraBy(componentXPath = "//lightning:input[@value='{!v.simpleNewContact.FirstName}']", qualifier = "firstName")
	public WebElement firstName1;
	@TextType()
	@AuraBy(componentXPath = "//lightning:input[@value='{!v.simpleNewContact.LastName}']", qualifier = "lastname")
	public WebElement lastName;
	@TextType()
	@AuraBy(componentXPath = "//lightning:input[@value='{!v.simpleNewContact.Title}']", qualifier = "title")
	public WebElement title;
	@TextType()
	@AuraBy(componentXPath = "//lightning:input[@value='{!v.simpleNewContact.Phone}']", qualifier = "phone")
	public WebElement phoneNumber;
	@TextType()
	@AuraBy(componentXPath = "//lightning:input[@value='{!v.simpleNewContact.Email}']", qualifier = "email")
	public WebElement email;
	@ButtonType()
	@FindByLabel(label = "Save Contact")
	public WebElement saveContact;
	@ButtonType()
	@FindByLabel(label = "Cancel")
	public WebElement cancel;
	
}
