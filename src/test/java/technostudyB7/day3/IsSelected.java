package technostudyB7.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
        /**Visit the page
         * locate the check box
         * select box
         *
         * */

        //<input type="checkbox" id="isAgeSelected" value="">

        WebElement checkBox=driver.findElement(By.cssSelector("input[id='isAgeSelected']"));
        checkBox.click();

        Thread.sleep(3000);

        if (checkBox.isSelected()){
            System.out.println("PASS");
        }else {
            System.out.println("FAILED");
        }
        driver.quit();


    }
}
