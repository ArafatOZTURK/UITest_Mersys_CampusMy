package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import Utilities.Tools;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import javax.swing.*;
import java.time.Duration;

public class _03_MainMenuControl {
    DialogContent dc = new DialogContent();

    @Then("user checks home page elements")
    public void userChecksHomePageElements() {
        dc.myClick(dc.courseTab1);
        dc.verifyContainsText(dc.welcomeText, "Welcome");

        dc.myClick(dc.calendarTab2);
        dc.wait.until(ExpectedConditions.visibilityOf(dc.calendarTabLabel));
        Assert.assertTrue(dc.calendarTabLabel.isDisplayed());

        dc.myClick(dc.attendanceTab3);
        dc.wait.until(ExpectedConditions.visibilityOf(dc.attendanceTabLabel));
        Assert.assertTrue(dc.attendanceTabLabel.isDisplayed());

        Tools.Wait(3);

        dc.myClick(dc.assignmentTab4);
        dc.wait.until(ExpectedConditions.visibilityOf(dc.attendanceTabLabel));
        Assert.assertTrue(dc.attendanceTabLabel.isDisplayed());

        dc.myClick(dc.gradingTab5);
        dc.wait.until(ExpectedConditions.visibilityOf(dc.gradingTabLabel));
        Assert.assertTrue(dc.gradingTabLabel.isDisplayed());

        dc.myClick(dc.hamburger);
        dc.wait.until(ExpectedConditions.visibilityOf(dc.messageText));
        Assert.assertTrue(dc.messageText.isDisplayed());
        dc.myClick(dc.messageText);
        Tools.Wait(2);
        dc.myClick(dc.inboxtext);
        Tools.Wait(2);


        dc.myClick(dc.newChatmessageText);
        Tools.Wait(2);
        dc.wait.until(ExpectedConditions.visibilityOf(dc.assignmenttext));
        Tools.Wait(2);
        Assert.assertTrue(dc.assignmenttext.isDisplayed());
        dc.myClick(dc.closethewindow);//hamburgerden sonrakı msj kısmının sonu




        dc.myClick(dc.messagebox);
        Tools.Wait(2);
        Assert.assertTrue(dc.messageBoxCheck.isDisplayed());
        dc.myClick(dc.closethewindow);//2. msj kutusu

        dc.myClick(dc.TopNavProfil);
        Tools.Wait(2);
        Assert.assertTrue(dc.MyCertificate.isDisplayed());//profıl kısmı







    }

    @And("See menu")
    public void seeMenu() {
    }
}
