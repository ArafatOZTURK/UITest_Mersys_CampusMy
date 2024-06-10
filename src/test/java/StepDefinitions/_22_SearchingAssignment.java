package StepDefinitions;

import Pages.DialogContent;
import Pages.Methods;
import com.sun.jdi.Method;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.awt.*;

public class _22_SearchingAssignment extends Methods {

    DialogContent dc=new DialogContent();

    @Given("student Go to the Assignment HomePage")
    public void goToTheAssignmentHomePage() {

        dc.wait.until(ExpectedConditions.visibilityOf(dc.Assignments));
        dc.myClick(dc.Assignments);
    }

    @Given("The Student should be able to see and click the search button")
    public void theStudentShouldBeAbleToSeeAndClickTheSearchButton() {
        waitUntilVisibilityOf(dc.searchButton);
        Assert.assertEquals(dc.searchButton.getText(), "Search");
        dc.myClick(dc.searchButton);
    }

    @When("Listing of tasks when default search is completed")
    public void listingOfTasksWhenDefaultSearchIsCompleted() {

        if (!dc.OverdueText.isDisplayed()) {
            System.out.println("the list is empty");
        } else {
            System.out.println("the list is not empty");
        }

    }

    private void waitUntilVisibilityOf(WebElement notSaveIcon) {
        dc.wait.until(ExpectedConditions.visibilityOf(notSaveIcon));
    }

    @And("the student should be able to search assignment by filtering")
    public void theStudentShouldBeAbleToSearchAssignmentByFiltering() {
        dc.myClick(dc.courseSelect);
        myJsClick(dc.courseBio);

        dc.myClick(dc.statusSelect);
        myJsClick(dc.statusPublished);

        dc.myClick(dc.semesterSelect);
        myJsClick(dc.semesterSelect1);

        dc.myClick(dc.searchButton);

    }

    @And("Search and verify assignments using the date button")
    public void searchAndVerifyAssignmentsUsingTheDateButton() {


        waitUntilVisibilityOf(dc.dueDate);
        dc.myClick(dc.dueDate);
        dc.myClick(dc.thisMounth);

        dc.myClick(dc.searchButton);

    }

    @And("Search and verify assignments using the sorting menu")
    public void searchAndVerifyAssignmentsUsingTheSortingMenu() {
        myJsClick(dc.defaultViewBtn);

        for (int i = 0; i < dc.viewList.size() - 1; i++) {
            myJsClick(dc.viewList.get(i));

            if (!dc.OverdueText.isDisplayed()) {
                System.out.println("List is empty");

            } else {
                System.out.println("List is not empty");
            }
            myJsClick(dc.defaultViewBtn);

        }
    }
}


