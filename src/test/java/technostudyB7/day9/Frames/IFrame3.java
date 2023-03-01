package technostudyB7.day9.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import seleniumTasks.TaskUtil;

public class IFrame3 {
    public static void main(String[] args) {
        WebDriver driver= TaskUtil.setUpChromeDriver();
        driver.get("https://chercher.tech/practice/frames");
        driver.switchTo().frame("frame1");
        WebElement topicInput= driver.findElement(By.tagName("input"));
        topicInput.sendKeys("Naime");
        //<input id="a" type="checkbox">
        driver.switchTo().frame(0);
        WebElement checkBox= driver.findElement(By.id("a"));
        checkBox.click();
        driver.switchTo().defaultContent();
        WebElement topicMessage=driver.findElement(By.cssSelector("label[style='font-size:40px']"));
        System.out.println(topicMessage.getText());

        driver.switchTo().frame("frame2");
        //<select class="col-lg-3" id="animals">
        // <option value="cat">Cat</option><option value="babycat">Baby Cat</option>
        // <option value="big baby cat">Big Baby Cat</option><option value="avatar">Avatar</option></select>
        WebElement dropdownMenu= driver.findElement(By.id("animals"));
        Select select=new Select(dropdownMenu);
        select.selectByIndex(2);
    }
}
