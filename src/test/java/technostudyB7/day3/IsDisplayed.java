package technostudyB7.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
        //Dynamically loaded page elements locating

        /**Enter the website
         * verify if the hidden text is displayed
         * click the start button
         * verify if hidden text is displayed*/
            //button
        //<div id="start">
        //    <button>Start</button>
        //  </div>
                //hidden text
        //<div id="finish" style="">
        //    <h4>Hello World!</h4>
        //  </div>

        WebElement button=driver.findElement(By.cssSelector("#start>button"));
        WebElement hiddenText=driver.findElement(By.cssSelector("#finish>h4"));
        System.out.println(hiddenText.isDisplayed());
        button.click();
        Thread.sleep(5000);
        System.out.println(hiddenText.isDisplayed());
        driver.quit();

    }
}
