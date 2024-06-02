package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import Utilities.Tools;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.Set;

public class _02_HomePageSteps {
    DialogContent dc=new DialogContent();
    @And("See the logo and click on")
    public void seeTheLogoAndClickOn() {
        Tools.Wait(2);
        Assert.assertTrue(dc.homePageLogo.isDisplayed(),"logo can not be displayed");
        dc.myClick(dc.homePageLogo);

    }

    @Then("Navigate to home page")
    public void navigateToHomePage() {
        String anasayfaWindowsID=GWD.getDriver().getWindowHandle();
        Set<String> windowIdler=GWD.getDriver().getWindowHandles();
        for (String id:windowIdler) {
            if (!id.equals(anasayfaWindowsID))
                GWD.getDriver().switchTo().window(id);
        }
        Assert.assertTrue(GWD.getDriver().getCurrentUrl().equals("https://techno.study/"));
    }

}
