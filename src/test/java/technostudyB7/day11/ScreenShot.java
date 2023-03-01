package technostudyB7.day11;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import seleniumTasks.TaskUtil;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class ScreenShot {
    public static void main(String[] args) throws IOException {
        WebDriver driver= TaskUtil.setUpChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
        WebElement userName = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        userName.sendKeys("Admin");

        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys("11234");

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class=\"oxd-text oxd-text--p oxd-alert-content-text\"]")));
        WebElement errorMessage = driver.findElement(By.xpath("//p[@class=\"oxd-text oxd-text--p oxd-alert-content-text\"]"));

        if (errorMessage.isDisplayed()){
            TakesScreenshot takesScreenshot = (TakesScreenshot) driver; // got the screenshot
            File screenShotInTheMemory = takesScreenshot.getScreenshotAs(OutputType.FILE); // created a file for the screenshot
            FileUtils.copyFile(screenShotInTheMemory,new File("src/test/java/technostudyB7/screenshots/screenshot.png"));
        }
        driver.quit();

        //if you run this it will open a new file for each screenshot

       /** if (errorMessage.isDisplayed()){
            LocalDateTime localDateTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM_dd_yyyy_hh_mm_ss_SSS");
            TakesScreenshot takesScreenshot = (TakesScreenshot) driver; // got the screenshot
            File screenShotInTheMemory = takesScreenshot.getScreenshotAs(OutputType.FILE); // created a file for the screenshot
            FileUtils.copyFile(screenShotInTheMemory,new File("src/test/java/technostudyB7/screenshots/"+localDateTime.format(formatter)+"screenshot.png"));*/
        }


    }

