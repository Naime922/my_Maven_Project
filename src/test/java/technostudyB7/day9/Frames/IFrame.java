package technostudyB7.day9.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import seleniumTasks.TaskUtil;

public class IFrame {
    public static void main(String[] args) {
        WebDriver driver= TaskUtil.setUpChromeDriver();
        driver.get("https://chercher.tech/practice/frames");


        driver.switchTo().frame("frame1");
        WebElement  topicInput= driver.findElement(By.tagName("input"));

        topicInput.sendKeys("hey");
        driver.switchTo().defaultContent();
        //<label style="font-size:40px">Topic : <span>Not a Friendly Topic</span></label>
        WebElement topicMessage=driver.findElement(By.cssSelector("label[style='font-size:40px']"));
        System.out.println(topicMessage.getText());

    }
}
