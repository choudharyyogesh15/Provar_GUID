package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Pageblock_table"                                
               , summary=""
               , page="UAT_IFRAME_VF"
               , namespacePrefix=""
               , object="Case"
               , connection="RegressionOrg"
     )             
public class Pageblock_table {

	@PageTable(row = Table.class)
	@VisualforceBy(componentXPath = "apex:pageblockTable[@id='pbd']")
	public List<Table> table;

	@PageRow(byColumn = true)
	public static class Table {

		@TextType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!a.lastname}\"]")
		public WebElement lastName;
		@ButtonType()
		@VisualforceBy(componentXPath = "apex:commandButton[@action='{!delcontact}']")
		public WebElement deleteButton;
		@TextType()
		@VisualforceBy(componentXPath = "apex:column[4]")
		public WebElement deleteLink;
		@LinkType()
		@VisualforceBy(componentXPath = "apex:column[5]/apex:outputField[@value = \"{!a.email}\"]/a")
		public WebElement email;
		@TextType()
		@VisualforceBy(componentXPath = "apex:column[6]")
		public WebElement mobile;
		
		
		
	}
	
}
