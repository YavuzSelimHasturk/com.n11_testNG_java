package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class Pages {

    public Pages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//button[text()='Daha Sonra'])[1]")
    WebElement kampanyaPopup;

    public WebElement getKampanyaPopup() {
        return kampanyaPopup;
    }

}
