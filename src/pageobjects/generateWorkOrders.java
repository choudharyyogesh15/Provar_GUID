package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="generateWorkOrders"                                
     , summary=""
     , relativeUrl=""
     , connection="FieldServiceLightning"
     )             
public class generateWorkOrders {

	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Close this window']")
	public WebElement closeThisWindow;
			
}
