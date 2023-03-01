package technostudyB7.day10;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import seleniumTasks.TaskUtil;

public class Scroll2 {
    public static void main(String[] args) {
        WebDriver driver= TaskUtil.setUpChromeDriver();
        driver.get("https://triplebyte.com/");
        TaskUtil.Wait(2);
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
        TaskUtil.Wait(2);
        js.executeScript("window.scrollTo(0,0);");// always will scroll up to the page
        driver.quit();

    }
}
