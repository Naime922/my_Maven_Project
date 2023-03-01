package technostudyB7.day10;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import seleniumTasks.TaskUtil;

import java.util.List;

public class ScrollExample {
    public static void main(String[] args) {
        WebDriver driver=TaskUtil.setUpChromeDriver();
        driver.get("https://www.youtube.com");

        //id="video-title"
        List<WebElement>videoList=driver.findElements(By.id("video-title"));
        System.out.println(videoList.size());

        while (videoList.size()<100){
            JavascriptExecutor js=(JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,500)");
            TaskUtil.Wait(3);
            videoList=driver.findElements(By.id("video-title"));
        }
        System.out.println(videoList.size());
        System.out.println(videoList.get(99).getText());
        driver.quit();


//        JavascriptExecutor js=(JavascriptExecutor) driver;
//         js.executeScript("window.scrollBy(0,)");
//         TaskUtil.Wait(3);
//         videoList=driver.findElements(By.id("video-title"));
//        System.out.println(videoList.size());


    }
}
