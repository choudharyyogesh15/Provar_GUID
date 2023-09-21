package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="CustomControllerDemo"                                
               , summary=""
               , connection="Regmain"
               , auraComponent="CustomControllerDemo"
               , namespacePrefix=""
     )             
public class CustomControllerDemo {

	@TextType()
	@AuraBy(componentXPath = "//aura:expression[@value= '{!v.opportunity.StageName}']")
	public WebElement Stage;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//tr[2]//lightning-formatted-number")
	public WebElement Probability;
	@TextType()
	@AuraBy(componentXPath = "//aura:expression[@value= '{!v.opportunity.Description}']")
	public WebElement Decription;
	@TextType()
	@AuraBy(componentXPath = "//aura:expression[@value= '{!v.opportunity.Description}']")
	public WebElement Decription1;
	@TextType()
	@AuraBy(componentXPath = "//lightning:formattedNumber[@value= '{!v.OpportunityTotal}']")
	public WebElement Total;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Save']")
	public WebElement save;
	
}
