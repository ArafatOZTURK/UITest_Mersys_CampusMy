package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class Methods {

    public WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));

    DialogContent dc= new DialogContent();

    public void leftClick(int quantity) {

        Robot robot;

        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < quantity; i++) {
            robot.delay(1000);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            robot.delay(1000);
        }
    }

    public void iframeSwitch(int index) {
        dc.wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(index));
    }

    public void enterKey(int quantity) {

        Robot robot;

        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < quantity; i++) {
            robot.delay(1000);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        }

    }
    public void tabKey(int quantity) {

        Robot robot;

        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < quantity; i++) {
            robot.delay(500);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }

    }

    public void myJsClick(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].click();", element);
    }

    public void UploadFile(String pathFile) throws InterruptedException {

        Robot robot;

        {
            try {
                robot = new Robot();
            } catch (AWTException e) {
                throw new RuntimeException(e);
            }
        }

        StringSelection createPathFile = new StringSelection(pathFile);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(createPathFile, null);

        wait(1);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        wait(1);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        wait(1);

    }
}
