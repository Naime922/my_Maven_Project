package technostudyB7.day9.window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import seleniumTasks.TaskUtil;

import java.util.Set;

public class Window {
    public static void main(String[] args) {
        WebDriver driver= TaskUtil.setUpChromeDriver();

        driver.get("https://www.selenium.dev/");
        String mainPageId= driver.getWindowHandle();
        WebElement registerNowButton = driver.findElement(By.xpath("//a[text()='Get Tickets']"));
        registerNowButton.click();
        Set<String> allIdS=driver.getWindowHandles();


        for (String id:allIdS) {
            if (!id.equals(mainPageId)){
                driver.switchTo().window(id);
            }

        }

        System.out.println(driver.getTitle());
        driver.close();
        driver.switchTo().window(mainPageId);
        System.out.println(driver.getTitle());

    }
}
