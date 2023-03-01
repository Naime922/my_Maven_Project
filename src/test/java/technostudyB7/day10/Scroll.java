package technostudyB7.day10;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import seleniumTasks.TaskUtil;

public class Scroll {
    public static void main(String[] args) {
        WebDriver driver= TaskUtil.setUpChromeDriver();
        driver.get("https://www.youtube.com");

        TaskUtil.Wait(2);
        JavascriptExecutor js= (JavascriptExecutor) driver;
        //window.scrollBy(int x,int y)
        //positive value for y means scroll down,and negative value means scroll up by specified pixels
        //positive x value means scroll right and negative value means left
        //window.scrollTo(0,"document.body.scrollHeight") scroll to the end of the page
        //"arguments[0].scrollIntoView(true)",element; // scroll to the specified element

        js.executeScript("window.scrollBy(0,3000)");//Scrolled down 3000 pixels
        TaskUtil.Wait(3);
        js.executeScript("window.scrollBy(0,-3000)");//Scrolled up 3000 pixels
        driver.quit();





    }
}
