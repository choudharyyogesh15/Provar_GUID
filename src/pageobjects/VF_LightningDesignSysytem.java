package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="VF_ Lightning Design Sysytem"                                
               , summary=""
               , page="VF_LightningDesignSysytem"
               , namespacePrefix=""
               , object="Account"
               , connection="RegressionOrg"
     )             
public class VF_LightningDesignSysytem {

	@TextType()
	@VisualforceBy(componentXPath = "apex:outputPanel[not(@id)]//input[contains(@class, \"slds-input\")]")
	public WebElement textInput;
	@TextType()
	@VisualforceBy(componentXPath = "apex:outputPanel[not(@id)]//textarea[contains(@class, \"slds-textarea\")]")
	public WebElement textareaLabel;
	@BooleanType()
	@VisualforceBy(componentXPath = "apex:outputPanel[not(@id)]//div[contains(@class, \"slds-form\")]/div[3]/div/span/label//span[1]")
	public WebElement checkboxLabel;
	@BooleanType()
	@VisualforceBy(componentXPath = "apex:outputPanel[not(@id)]//div[contains(@class, \"slds-checkbox_button-group\")]/span[1]/label//span")
	public WebElement mon;
	@BooleanType()
	@VisualforceBy(componentXPath = "apex:outputPanel[not(@id)]//div[contains(@class, \"slds-checkbox_button-group\")]/span[2]/label//span")
	public WebElement tue;
	@BooleanType()
	@VisualforceBy(componentXPath = "apex:outputPanel[not(@id)]//div[contains(@class, \"slds-checkbox_button-group\")]/span[3]/label//span")
	public WebElement wed;
	@BooleanType()
	@VisualforceBy(componentXPath = "apex:outputPanel[not(@id)]//div[contains(@class, \"slds-checkbox_button-group\")]/span[4]/label//span")
	public WebElement thu;
	@BooleanType()
	@VisualforceBy(componentXPath = "apex:outputPanel[not(@id)]//div[contains(@class, \"slds-checkbox_button-group\")]/span[5]/label//span")
	public WebElement fri;
	@BooleanType()
	@VisualforceBy(componentXPath = "apex:outputPanel[not(@id)]//div[contains(@class, \"slds-form\")]/fieldset[2]/div/span[1]/label//span[1]")
	public WebElement allOpportunitiesOwnedByYou;
	@BooleanType()
	@VisualforceBy(componentXPath = "apex:outputPanel[not(@id)]//div[contains(@class, \"slds-form\")]/fieldset[2]/div/span[2]/label//span[1]")
	public WebElement allContactsInTheAccountOwnedByYou;
	@BooleanType()
	@VisualforceBy(componentXPath = "apex:outputPanel[not(@id)]//div[contains(@class, \"slds-form\")]/fieldset[3]/div/span[1]/label//span[1]")
	public WebElement radioLabelOne;
	@BooleanType()
	@VisualforceBy(componentXPath = "apex:outputPanel[not(@id)]//div[contains(@class, \"slds-form\")]/fieldset[3]/div/span[2]/label//span[1]")
	public WebElement radioLabelTwo;
	@BooleanType()
	@VisualforceBy(componentXPath = "apex:outputPanel[not(@id)]//div[contains(@class, \"slds-radio_button-group\")]/span[1]/label//span")
	public WebElement mon1;
	@BooleanType()
	@VisualforceBy(componentXPath = "apex:outputPanel[not(@id)]//div[contains(@class, \"slds-radio_button-group\")]/span[2]/label//span")
	public WebElement tue1;
	@BooleanType()
	@VisualforceBy(componentXPath = "apex:outputPanel[not(@id)]//div[contains(@class, \"slds-radio_button-group\")]/span[3]/label//span")
	public WebElement wed1;
	@BooleanType()
	@VisualforceBy(componentXPath = "apex:outputPanel[not(@id)]//div[contains(@class, \"slds-radio_button-group\")]/span[4]/label//span")
	public WebElement thu1;
	@BooleanType()
	@VisualforceBy(componentXPath = "apex:outputPanel[not(@id)]//div[contains(@class, \"slds-radio_button-group\")]/span[5]/label//span")
	public WebElement fri1;
	
}
