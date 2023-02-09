package technostudyB7.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitByTryCatch {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");

        /**Visit page
         * Click on start button
         * Verify hidden word is Hello world*/
        //<div id="start">
        //    <button>Start</button>
        //  </div>

        WebElement startButton = driver.findElement(By.cssSelector("#start>button"));
        startButton.click();

        //<div id="finish" style="">
        // <h4>Hello World!</h4></div>
        String text="";
        int counter=0;
        while (text.equals("")){
            try {
                WebElement actualText = driver.findElement(By.cssSelector("#finish>h4"));
                text=actualText.getText();
            }
            catch (NoSuchElementException ex) {

                counter++;
            }
        }
        System.out.println(text);
        System.out.println(counter);


    }
}
