package technostudyB7.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import seleniumTasks.TaskUtil;

public class GetNotPresentElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");

        /**Visit page
         * Click on start button
         * Verify hidden word is Hello world*/
        //<div id="start">
        //    <button>Start</button>
        //  </div>

        WebElement startButton= driver.findElement(By.cssSelector("#start>button"));
        startButton.click();
        Thread.sleep(5000);

        //<div id="finish" style=""><h4>Hello World!</h4></div>
        String expectedText="Hello World!";
        WebElement actualText= driver.findElement(By.cssSelector("#finish>h4"));

        if (expectedText.equals(actualText.getText())){
            System.out.println("Expected text is appear! Verification is passed");
        }else {
            System.out.println("Expected text is not appear");
        }
        driver.quit();

    }
}
