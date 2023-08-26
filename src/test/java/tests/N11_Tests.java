package tests;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.Pages;
import utils.ConfigReader;
import utils.Driver;

import static org.testng.AssertJUnit.assertEquals;

public class N11_Tests {

    Pages elements = new Pages();

    @Test
    public void AnasayfayaGidis() {
        Driver.getDriver().get("https://www.n11.com/");
        assertEquals(Driver.getDriver().getTitle(), "n11 - 10 Üzerinden 11'lik Alışveriş Deneyimi");
        elements.getKampanyaPopup().click();

        Actions actions = new Actions(Driver.getDriver());
        actions.moveByOffset(1342,20).click().perform();


    }


}
