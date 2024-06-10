package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends ParentPage {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElement userName;
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement password;
    @FindBy(xpath = "//span[text()=' LOGIN ']")
    public WebElement loginButton;
    @FindBy(xpath = "//span[contains(text(),'Welcome')]")
    public WebElement welcomeText;
    // @FindBy(xpath = "//div[contains(text(),'invalid')]")
    // public WebElement invalidText;

    @FindBy(xpath = "//div[@class='ng-star-inserted']/img")
    public WebElement homePageLogo;

    @FindBy(xpath = "(//span[@class='mdc-button__label'])[1]")
    public WebElement courseTab1;
    @FindBy(xpath = "(//span[@class='mdc-button__label'])[2]")
    public WebElement calendarTab2;
    @FindBy(xpath = "(//span[@class='mdc-button__label'])[3]")
    public WebElement attendanceTab3;
    @FindBy(xpath = "(//span[@class='mdc-button__label'])[4]")
    public WebElement assignmentTab4;
    @FindBy(xpath = "(//span[@class='mdc-button__label'])[5]")
    public WebElement gradingTab5;
    @FindBy(xpath = "(//span[@class='mdc-tab__text-label'])[1]")
    public WebElement calendarTabLabel;
    @FindBy(xpath = "(//span[@class='mdc-tab__text-label'])[1]")
    public WebElement attendanceTabLabel;
    @FindBy(xpath = "//span[contains(text(),' Assignments ')]")
    public WebElement assignmentTabLabel;

    @FindBy(xpath = "//span[contains(text(),' Grading ')]")
    public WebElement gradingTabLabel;

    @FindBy(xpath = "(//*[@class='svg-inline--fa fa-bars fa-fw'])[1]")
    public WebElement hamburger;

    @FindBy(xpath = "//span[text()='Messaging']")
    public WebElement messageText;
    @FindBy(xpath = "//button[@class='mat-mdc-tooltip-trigger mdc-icon-button mat-mdc-icon-button mat-unthemed mat-mdc-button-base mat-mdc-tooltip-disabled']")
    public WebElement newChatmessageText;
    @FindBy(xpath = "//div[text()=' Student_8 11A ']")
    public WebElement newMessageCheck;

    @FindBy(xpath = "(//button[@class='mat-mdc-tooltip-trigger mdc-icon-button mat-mdc-icon-button mat-unthemed mat-mdc-button-base'])[2]")
    public WebElement closethewindow;

    @FindBy(xpath = "//span[text()='Inbox']")
    public WebElement inboxtext;

    @FindBy(xpath = "//span[contains(text(),' Assignment')]")
    public WebElement assignmenttext;

    @FindBy(xpath = "(//button[@class='mat-mdc-tooltip-trigger mdc-icon-button mat-mdc-icon-button mat-unthemed mat-mdc-button-base'])[1]")
    public WebElement messagebox;

    @FindBy(xpath = "//span[@class='title dialog-title']")
    public WebElement messageBoxCheck;

    @FindBy(xpath = "//button[@class='mat-mdc-menu-trigger user-button mdc-button mat-mdc-button mat-unthemed mat-mdc-button-base ng-star-inserted']")
    public WebElement TopNavProfil;

    @FindBy(xpath = "//span[text()='My Certificates']")
    public WebElement MyCertificate;

    @FindBy(xpath = "//span[text()='New Message']")
    public WebElement HamburgerNewMessage;


    @FindBy(xpath = "//span[text()=' New Message ']")
    public WebElement NewMessageAssert;

    @FindBy(xpath = "//span[text()=' Inbox ']")
    public WebElement InboxAssert;

    @FindBy(xpath = "//span[text()='Outbox']")
    public WebElement Outbox;

    @FindBy(xpath = "//span[text()=' Outbox ']")
    public WebElement OutBoxAssert;

    @FindBy(xpath = "//span[text()='Trash']")
    public WebElement Trash;

    @FindBy(xpath = "//span[text()=' Trash ']")
    public WebElement TrashAssert;




    @FindBy(xpath = "(//*[text()='Assignments'])[1]")
    public WebElement Assignments;

    @FindBy(xpath = "(//span[@class='mat-mdc-focus-indicator'])[21]")
    public WebElement SubmitIcon;
    @FindBy(xpath="//*[@class='mce-content-body ']")
    public WebElement writeText;

    @FindBy(css="[id='tinymce'] table tbody tr:nth-child(1) td:nth-child(1)")
    public WebElement tableText1;

    @FindBy(css="[id='tinymce'] table tbody tr:nth-child(2) td:nth-child(2)")
    public WebElement tableText2;

    @FindBy(css = "[class='svg-inline--fa fa-triangle-exclamation fa-fw']")
    public WebElement notSaveIcon;

    @FindBy(css="[class='mat-expansion-panel-header-description ng-star-inserted']")
    public WebElement succesMessages;

    @FindBy(xpath="//span[text()='Search']")
    public WebElement searchButton;

    @FindBy(xpath="//div[@id='mat-select-value-5']")
    public WebElement semesterBox;

    @FindBy(xpath="//span[@class='mdc-list-item__primary-text'][text()]")
    public WebElement semesterAll;
    @FindBy(xpath="(//strong[@class='ng-star-inserted'])[1]")
    public WebElement OverdueText;

    @FindBy(xpath="//mat-toolbar-row[@class='mat-toolbar-row']")
    public WebElement textEditorAssertion;

    @FindBy(xpath="//div[@id='mat-select-value-33']")
    public WebElement courseSelect;

    @FindBy(xpath="//mat-option[@class='mat-mdc-option mdc-list-item ng-tns-c1154042729-164 ng-star-inserted custom-cursor-on-hover'][1]")
    public WebElement courseBio;

    @FindBy(xpath = "//div[@id='mat-select-value-35']")
    public WebElement statusSelect;
    @FindBy(xpath = "//*[text()=' Published ']")
    public WebElement statusPublished;


    @FindBy(xpath = "//div[@id='mat-select-value-37']")
    public WebElement semesterSelect;


    @FindBy(xpath = "//div[@style='display: flex; flex-direction: column;']")
    public WebElement semesterSelect1;

    @FindBy(css = " mat-datepicker-toggle svg+span")
    public WebElement dueDate;


    @FindBy(css = " //span[text()=' This month ']")
    public WebElement thisMounth;
    @FindBy(css = "[class='selected-flag'] :nth-child(3)")
    public WebElement defaultViewBtn;

    @FindBy(css = "[class='cdk-overlay-pane'] span span span:nth-child(1)")
    public List<WebElement> viewList;

    @FindBy(css = "(//ms-layout-menu-button//span/span)[3]")
    public WebElement calendarButton;

    @FindBy(css = "(//div/span/span)[3]")
    public WebElement weeklyCoursePlan;

    @FindBy(css = "//h4[@style='padding-bottom: 12px; margin: 0px !important; color: #303f9f; width: 100%;']")
    public WebElement historyDateButton;








}
