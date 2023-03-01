package technostudyB7.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import seleniumTasks.TaskUtil;

import java.util.List;

public class FindElements {
    public static void main(String[] args) {
        WebDriver driver= TaskUtil.setUpChromeDriver();
        driver.get("https://www.youtube.com/");
        List<WebElement> videoTitles=driver.findElements(By.id("video-title"));
        System.out.println(videoTitles.get(10).getText());

        ///**1- Go to https://www.saucedemo.com/
        //     2- login with valid credentials
        //     3- Click on Sauce Labs Backpack and add to the cart
        //     4- Click on Back To Products
        //     5- Click on Sauce Labs Bolt T-Shirt and add to the cart
        //     6- Click on the cart
        //     7- Click on the Check Out button
        //     8- Fill the form and click on Continue
        //     9- Check if you see your products*/

    }
}
