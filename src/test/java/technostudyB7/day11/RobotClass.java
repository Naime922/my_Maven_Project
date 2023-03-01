package technostudyB7.day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import seleniumTasks.TaskUtil;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class RobotClass {
    public static void main(String[] args) throws AWTException {
        WebDriver driver= TaskUtil.setUpChromeDriver();
        driver.get("http://demo.guru99.com/test/upload/");

        TaskUtil.Wait(2);
        Robot robot=new Robot();


        for (int i = 0; i <21 ; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            TaskUtil.Wait(1);
        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        StringSelection stringSelection=new StringSelection("C:\\Users\\naime\\OneDrive\\Desktop\\New Text Document (2).txt");
        Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection,stringSelection);
        TaskUtil.Wait(2);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        TaskUtil.Wait(1);

        WebElement checkBox = driver.findElement(By.className("field_check"));
        checkBox.click();

        WebElement submitButton= driver.findElement(By.id("submitbutton"));
        submitButton.click();

        WebDriverWait wait=new WebDriverWait(driver,10);
        WebElement successMessage= driver.findElement(By.id("res"));

        wait.until(ExpectedConditions.visibilityOf(successMessage));



        System.out.println(successMessage.getText().contains("successfully"));




    }

}
