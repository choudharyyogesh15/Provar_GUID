package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Iframe_ Inside_ Vf_ Auto"                                
               , summary=""
               , page="UAT_FOR_VF"
               , namespacePrefix=""
               , object=""
               , connection="RegressionOrg"
     )             
public class Iframe_Inside_Vf_Auto {

	@PageFrame()
	public static class Yahoomaps {

		@LinkType()
		@FindBy(xpath = "//a[normalize-space(.)='Yahoo Maps']")
		public WebElement yahooMaps;
	}

	@FindBy(css = "#theIframe[src='https://c.eu0.visual.force.com/apex/UAT_IFRAME_VF']")
	public Yahoomaps yahoomaps;
	
}
