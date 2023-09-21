package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="UAT_ Embedded VF Data Table 02"                                
               , summary=""
               , page="UAT_EmbeddedVFDataTable"
               , namespacePrefix=""
               , object="Contact"
               , connection="RegressionOrg"
     )             
public class UAT_EmbeddedVFDataTable02 {

	@PageTable(row = Emb_VF_Table.class)
	@VisualforceBy(componentXPath = "apex:dataTable[@value = \"{!con}\"]")
	public List<Emb_VF_Table> emb_VF_Table;

	@PageRow(byColumn = true)
	public static class Emb_VF_Table {

		@TextType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!a.lastname}\"]")
		public WebElement lastName;
		@LinkType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!a.email}\"]/a")
		public WebElement email;
		@TextType()
		@VisualforceBy(componentXPath = "apex:column[3]")
		public WebElement mobile;
	}
	
}
