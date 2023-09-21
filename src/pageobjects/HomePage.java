package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="HomePage"                                
               , summary=""
               , connection="Regmain"
               , lightningComponent="NewContactLDS"
               , namespacePrefix=""
     )             
public class HomePage {

	@TextType()
	@AuraBy(componentXPath = "//lightning:input[@value='{!v.simpleNewContact.FirstName}']", qualifier = "firstName")
	public WebElement FirstName;
	@TextType()
	@AuraBy(componentXPath = "//lightning:input[@value='{!v.simpleNewContact.LastName}']", qualifier = "lastname")
	public WebElement lastName;
	@TextType()
	@AuraBy(componentXPath = "//lightning:input[@value='{!v.simpleNewContact.Phone}']", qualifier = "phone")
	public WebElement phoneNumber;
	
}
