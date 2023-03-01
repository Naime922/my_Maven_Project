package technostudyB7.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import seleniumTasks.TaskUtil;

public class ArrowKeysAction {
    public static void main(String[] args) {
        WebDriver driver= TaskUtil.setUpChromeDriver();
        driver.get("https://demoqa.com/auto-complete");
        //div class="auto-complete__value-container auto-complete__value-container--is-multi css-1hwfws3"
        WebElement input= driver.findElement(By.cssSelector("div[class='auto-complete__value-container auto-complete__value-container--is-multi css-1hwfws3']"));
        Actions actions=new Actions(driver);
        Action typeBAction=actions.moveToElement(input).click().sendKeys("b").build();
        typeBAction.perform();
        Action arrowKeyAction=actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build();
        arrowKeyAction.perform();
        driver.quit();


    }
}
