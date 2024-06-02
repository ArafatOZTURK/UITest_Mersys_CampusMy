package StepDefinitions;

import Pages.DialogContent;
import Utilities.Tools;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class _04_HamburgerMenuControl {

    @Then("Checking new message, inbox, outbox and trash")
    public void checkingNewMessageInboxOutboxAndTrash() {
        DialogContent dc=new DialogContent();

        dc.myClick(dc.hamburger);
        dc.myClick(dc.messageText);
        Tools.Wait(2);
        Assert.assertTrue(dc.HamburgerNewMessage.isDisplayed());
        dc.myClick(dc.HamburgerNewMessage);
        Tools.Wait(2);
        Assert.assertTrue(dc.NewMessageAssert.isDisplayed());


        dc.myClick(dc.hamburger);
        dc.myClick(dc.messageText);
        Tools.Wait(2);
        Assert.assertTrue(dc.inboxtext.isDisplayed());
        dc.myClick(dc.inboxtext);
        Tools.Wait(2);
        Assert.assertTrue(dc.InboxAssert.isDisplayed());

        dc.myClick(dc.hamburger);
        dc.myClick(dc.messageText);
        Tools.Wait(2);
        Assert.assertTrue(dc.Outbox.isDisplayed());
        dc.myClick(dc.Outbox);
        Tools.Wait(2);
        Assert.assertTrue(dc.OutBoxAssert.isDisplayed());


        dc.myClick(dc.hamburger);
        dc.myClick(dc.messageText);
        Tools.Wait(2);
        Assert.assertTrue(dc.Trash.isDisplayed());
        dc.myClick(dc.Trash);
        Tools.Wait(2);
        Assert.assertTrue(dc.TrashAssert.isDisplayed());








    }
}
