package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
    @FindBy(css = "div.desktop > div > div.banner__accept-button")
    public WebElement kabulEt;
/*
    public WebElement getShadowRootElement(WebElement element) {
        WebElement ele = (WebElement) ((JavascriptExecutor)Driver.getDriver())
                .executeScript("return arguments[0].shadowRoot", element);
        return ele;
    }

    WebElement root1=Driver.getDriver().findElement(By.className("efilli-layout-n11"));
    WebElement shadowRoot1=getShadowRootElement(root1);
    WebElement shadowElement=shadowRoot1.findElement(By.cssSelector("div[class=banner__accept-button"));


    //document.querySelector("body > efilli-layout-n11").shadowRoot.querySelector("div.desktop > div > div.banner__accept-button")

*/}
