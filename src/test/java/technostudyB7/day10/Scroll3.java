package technostudyB7.day10;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import seleniumTasks.TaskUtil;

public class Scroll3 {
    public static void main(String[] args) {
        WebDriver driver= TaskUtil.setUpChromeDriver();
        driver.get("https://triplebyte.com/");
        //<div class="home-white-tag">Hire faster</div>
        WebElement element= driver.findElement(By.xpath("//div[text()='Hire faster']"));
        TaskUtil.Wait(2);
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)",element);
        System.out.println(element.getText());

        driver.quit();

    }
}
