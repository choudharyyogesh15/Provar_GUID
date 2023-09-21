package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="FlexiAppPages"                                
     , summary=""
     , relativeUrl=""
     , connection="PrereleaseOrg"
     )             
public class FlexiAppPages {

	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//h2")
	@TextType()
	public WebElement Page_name;
			
}
