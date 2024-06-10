package StepDefinitions;

import Pages.DialogContent;
import Pages.Methods;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.ObjectUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.awt.*;

import static Utilities.GWD.*;

public class _21_uploadAssignments extends Methods {
    DialogContent dc=new DialogContent();
    @Given("Go to the Assignment HomePage")
    public void goToTheAssignmentHomePage() {

        dc.wait.until(ExpectedConditions.visibilityOf(dc.Assignments));
        dc.myClick(dc.Assignments);
    }

    @When("Student should be able to click on the submit icon")
    public void studentShouldBeAbleToClickOnTheSubmitIcon() {

        dc.wait.until(ExpectedConditions.visibilityOf(dc.SubmitIcon));
        dc.myClick(dc.SubmitIcon);
    }


    @And("Student should be able to access text editor and write a text")
    public void studentShouldBeAbleToAccessTextEditorAndWriteAText() {

        Assert.assertTrue(dc.textEditorAssertion.getText().contains("Submission Attempt"));
        String text="I want to work as a software tester in an it company";
        dc.mySendKeys(dc.writeText,text);
    }

    @Then("Student should be able to create a picture or table")
    public void studentShouldBeAbleToCreateAPictureOrTable() throws AWTException, InterruptedException {

        Robot robot= new Robot();
        robot.mouseMove(500, 500);

        leftClick(1);

        iframeSwitch(0);

        enterKey(1);

        robot.mouseMove(568, 490);

        leftClick(1);

        dc.mySendKeys(dc.tableText1, "Techno Study");

        tabKey(3);

        dc.mySendKeys(dc.tableText2, "SDET");

        robot.mouseMove(550, 600);

        leftClick(1);

        enterKey(1);

        robot.mouseMove(520, 470);

        leftClick(1);

        UploadFile("C:\\Users\\DELL\\Desktop\\techno.JPG");

        enterKey(1);

        GWD.getDriver().switchTo().defaultContent();

    }

    @And("Student should be able to attach a file")
    public void studentShouldBeAbleToAttachAFile() throws InterruptedException {


        UploadFile("C:\\Users\\DELL\\Desktop\\aaaa.JPG");

    }

    @And("The student should be able to record his changes as a draft")
    public void theStudentShouldBeAbleToRecordHisChangesAsADraft() {

        waitUntilVisibilityOf(dc.notSaveIcon);
        Assert.assertTrue(dc.notSaveIcon.isDisplayed());
        dc.wait.until(ExpectedConditions.textToBePresentInElement(dc.succesMessages,"Successfully saved as a draft"));
        Assert.assertEquals(dc.succesMessages.getText(),"Successfully saved as a draft");
        System.out.println(dc.succesMessages.getText());
    }

    private void waitUntilVisibilityOf(WebElement notSaveIcon) {
        dc.wait.until(ExpectedConditions.visibilityOf(notSaveIcon));
    }

}
