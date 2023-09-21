package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="V Ftablescroll"                                
               , summary=""
               , page="VFtablescroll"
               , namespacePrefix=""
               , object="Case"
               , connection="RegressionOrg"
     )             
public class VFtablescroll {

	@PageTable(row = Con.class)
	@VisualforceBy(componentXPath = "apex:pageblockTable[@id='pbd']")
	public List<Con> con;

	@PageRow(byColumn = true)
	public static class Con {

		@TextType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!a.lastname}\"]")
		public WebElement lastName;
	}
	
}
