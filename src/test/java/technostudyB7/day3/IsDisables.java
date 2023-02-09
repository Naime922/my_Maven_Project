package technostudyB7.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisables {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://the-internet.herokuapp.com/dynamic_controls");
        /**visit the page
         * locate button
         *click the button
         *verify if it enabled*/
      // <form id="input-example">
        //    <input type="text" style="width: 30%;">
        //    <button autocomplete="off" type="button" onclick="swapInput()">Disable</button><p id="message">It's enabled!</p><div id="loading" style="display: none;">Wait for it... <img src="/img/ajax-loader.gif"></div><br>
        //  </form>
        WebElement enableButton=driver.findElement(By.cssSelector("#input-example>button"));
        WebElement inputField=driver.findElement(By.cssSelector("#input-example>input"));

        boolean isInputFieldEnabled=inputField.isSelected();
        System.out.println(isInputFieldEnabled);

        enableButton.click();
        Thread.sleep(10000);
        boolean isInputFieldEnabled2=inputField.isEnabled();

        System.out.println("after clicking enable button: "+isInputFieldEnabled2);
        if (isInputFieldEnabled2==true){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }
        driver.quit();




    }
}
