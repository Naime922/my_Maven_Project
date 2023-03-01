package technostudyB7.day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");

        WebElement startButton = driver.findElement(By.cssSelector("#start>button"));
        startButton.click();

        /**This method will be wait until text is visible */
        WebDriverWait wait=new WebDriverWait(driver,10);

        WebElement finishText = driver.findElement(By.cssSelector("#finish>h4"));
         System.out.println(finishText.getText());
         wait.until(ExpectedConditions.visibilityOf(finishText));

    }
}
