package technostudyB7.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import seleniumTasks.TaskUtil;

public class ActionsDragAndDrop {
    public static void main(String[] args) {
        WebDriver driver= TaskUtil.setUpChromeDriver();
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        //<div class="dragableBox" id="box3" dragableelement="2">Washington</div>

        //target==<div id="box103" class="dragableBoxRight">United States</div>
        WebElement unitedStates= driver.findElement(By.id("box103"));
        WebElement washington= driver.findElement(By.id("box3"));

        Actions actions=new Actions(driver);
        Action dragAndDropWashington=actions.dragAndDrop(washington,unitedStates).build();
        dragAndDropWashington.perform();
        System.out.println(washington.getCssValue("background-color"));

        WebElement copenhagen=driver.findElement(By.id("box4"));
        WebElement denmark=driver.findElement(By.id("box104"));

        Action dragAndDropDenmark=actions.dragAndDrop(copenhagen,denmark).build();
        dragAndDropDenmark.perform();


    }
}
