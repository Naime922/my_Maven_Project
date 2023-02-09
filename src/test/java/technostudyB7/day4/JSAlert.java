package technostudyB7.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAlert {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        /**Visit the page
         * click on JS alert
         * get the text
         * click ok*/

        //<button onclick="jsAlert()">Click for JS Alert</button>
//
//        WebElement jsAlertButton= driver.findElement(By.cssSelector("button[onclick='jsAlert()']"));
//        jsAlertButton.click();
//
//        /**it will give the text on the alert*/
//        String jsAlertText=driver.switchTo().alert().getText();
//        System.out.println(jsAlertText);
//
//        /**It will click on ok button on the allert*/
//        driver.switchTo().alert().accept();

        //<button onclick="jsConfirm()">Click for JS Confirm</button>
//        WebElement jSConfirmButton=driver.findElement(By.cssSelector("button[onclick ='jsConfirm()']"));
//        jSConfirmButton.click();
//
//       String text= driver.switchTo().alert().getText();
//        System.out.println(text);
//        driver.switchTo().alert().dismiss();

        //<button onclick="jsPrompt()">Click for JS Prompt</button>
        WebElement jsPrompt= driver.findElement(By.cssSelector("button[onclick='jsPrompt()']"));
        jsPrompt.click();
        driver.switchTo().alert().sendKeys("Naime");
        driver.switchTo().alert().accept();
       driver.quit();





    }

}
