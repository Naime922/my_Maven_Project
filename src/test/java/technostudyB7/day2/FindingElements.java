package technostudyB7.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElements {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.techno.study");
        Thread.sleep(2000);

        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(3000);
        driver.navigate().back();
        //the get method wiat the page for loading, navigate().to() method does not wait for the page to load

        driver.navigate().forward();

        //finding the element on facebook page <h2 class="_8eso">Connect with friends and the world around you on Facebook.</h2>

        WebElement slogan =driver.findElement(By.className("_8eso"));

        String expectedSloganText="Connect with friends and the world around you on Facebook.";
        String actualSloganText=slogan.getText();

        if (expectedSloganText.equals(actualSloganText)){
            System.out.println("Verification is done: PASS");
        }else {
            System.out.println("Verification is failed.");
            System.out.println("Actual slogan is : "+actualSloganText);
        }




    }
}
