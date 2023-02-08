package technostudyB7.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTask2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://demo.seleniumeasy.com");
        driver.navigate().to("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        //<input type="text" class="form-control" placeholder="Enter value" id="sum1">

        WebElement valueBox1= driver.findElement(By.cssSelector("input[id='sum1']"));
        valueBox1.sendKeys("5");

        //<input type="text" class="form-control" placeholder="Enter value" id="sum2">

        WebElement valueBox2= driver.findElement(By.cssSelector("input[id='sum2']"));
        valueBox2.sendKeys("4");

        //<button type="button" onclick="return total()" class="btn btn-default">Get Total</button>
        WebElement getTotalBox= driver.findElement(By.cssSelector("button[onclick='return total()']"));
        getTotalBox.click();

        //<span id="displayvalue">14</span>

        WebElement result=driver.findElement(By.cssSelector("span[id='displayvalue']"));


        String expectedResult="9";
        String actResult=result.getText();
        System.out.println(expectedResult);

        if (expectedResult.equals(actResult)){
            System.out.println("Verification is completed result: PASSED.");
        }else {
            System.out.println("Verification is not completed result: FAILED.");
        }
    }
}
