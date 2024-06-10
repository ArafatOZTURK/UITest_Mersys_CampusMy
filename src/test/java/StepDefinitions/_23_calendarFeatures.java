package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class _23_calendarFeatures {

    DialogContent dc= new DialogContent();
    @Given("the student should be able to click calendar button")
    public void theStudentShouldBeAbleToClickCalendarButton() {
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.calendarButton));
        dc.myClick(dc.calendarButton);

    }
    @When("The student should be able to see the default date of today and the weekly course plan on the Calendar page")
    public void theStudentShouldBeAbleToSeeTheDefaultDateOfTodayAndTheWeeklyCoursePlanOnTheCalendarPage() {

        Assert.assertTrue(dc.historyDateButton.getText().contains("Monday"));
        Assert.assertTrue(dc.weeklyCoursePlan.getText().contains(" Weekly Course"));
    }

    @Then("The student should be able to view the status of scheduled courses")
    public void theStudentShouldBeAbleToViewTheStatusOfScheduledCourses() {

    }
}
