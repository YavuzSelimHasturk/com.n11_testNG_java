package tests;

import org.testng.annotations.Test;
import pages.Pages;
import utils.ConfigReader;
import utils.Driver;

import static org.testng.AssertJUnit.assertEquals;

public class N11_Tests {

    Pages elements = new Pages();

    @Test
    public void AnasayfayaGidis(){
        Driver.getDriver().get("https://www.n11.com/");
        assertEquals(Driver.getDriver().getTitle(),"n11 - 10 Üzerinden 11'lik Alışveriş Deneyimi");
        elements.getKampanyaPopup().click();


    }

}
