package technostudyB7.day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import seleniumTasks.TaskUtil;

import java.util.List;
import java.util.Set;

public class WindowSwitchExample {
    public static void main(String[] args) {
        WebDriver driver= TaskUtil.setUpChromeDriver();
        driver.get("https://www.selenium.dev/");

        String mainPageId=driver.getWindowHandle();
       List <WebElement> links=driver.findElements(By.cssSelector("a[target='_blank']"));

       for (WebElement link:links) {
            if (!link.getAttribute("href").contains("mailto")){
                link.click();
            }
        }

       Set<String>allIds=driver.getWindowHandles();
        for (String id:allIds) {
            if (!id.equals(mainPageId)){
                driver.switchTo().window(id);
                System.out.println(driver.getTitle());
                driver.close();

            }
            driver.switchTo().window(mainPageId);
            System.out.println(driver.getTitle());


        }


    }
}
