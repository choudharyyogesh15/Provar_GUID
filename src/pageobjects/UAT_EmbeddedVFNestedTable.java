package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="UAT_ Embedded VF Nested Table"                                
               , summary=""
               , page="UAT_EmbeddedVFNestedTable"
               , namespacePrefix=""
               , object="Contact"
               , connection="RegressionOrg"
     )             
public class UAT_EmbeddedVFNestedTable {

	@PageTable(row = Parent_Table.class)
	@VisualforceBy(componentXPath = "apex:pageBlock[not(@id)]/apex:pageblockTable[@value = \"{!con}\"]")
	public List<Parent_Table> parent_Table;

	@PageRow(byColumn = true)
	public static class Parent_Table {

		@PageTable(row = Child_Table.class)
		@VisualforceBy(componentXPath = "apex:column/apex:pageblockTable[@value = \"{!con}\"]")
		public List<Child_Table> child_Table;
		@TextType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!a.lastname}\"]")
		public WebElement outerColumn1;
	}

	@PageRow(byColumn = true)
	public static class Child_Table {

		@LinkType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!m.email}\"]/a")
		public WebElement innerColumn2;
		@LinkType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!m.email}\"]/a")
		public WebElement innerColumn21;
		@TextType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!m.lastname}\"]")
		public WebElement innerColumn1;
		@LinkType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!m.email}\"]/a")
		public WebElement innerColumn22;
	}
	
}
