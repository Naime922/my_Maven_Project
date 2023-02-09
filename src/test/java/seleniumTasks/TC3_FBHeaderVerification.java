package seleniumTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC3_FBHeaderVerification {
    public static void main(String[] args) {
        WebDriver driver=TaskUtil.setUpChromeDriver();
        driver.get("https://www.facebook.com");

        //<h2 class="_8eso">Connect with friends and the world around you on Facebook.</h2>
        WebElement headerText= driver.findElement(By.className("_8eso"));
        System.out.println("Actual header is: "+headerText.getText());
        String expectedHeader="Connect with friends and the world around you on Facebook.";
        String actualHeader=headerText.getText();

        if (expectedHeader.equals(actualHeader)){
            System.out.println("Verification completed result is: PASSED");
        }else {
            System.out.println("Verification is not completed result is: FAILED");
            System.out.println(actualHeader);
        }
    }
}
