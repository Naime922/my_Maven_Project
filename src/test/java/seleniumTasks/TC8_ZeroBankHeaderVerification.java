package seleniumTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC8_ZeroBankHeaderVerification {
    public static void main(String[] args) {
        WebDriver driver=TaskUtil.setUpChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");

        //<div class="page-header">
        //                <h3>Log in to ZeroBank</h3>
        //        </div>

        WebElement headerLink= driver.findElement(By.className("page-header"));
        System.out.println(headerLink.getText());

        String expectedHeaderText="Log in to ZeroBank";
        String actHeaderText=headerLink.getText();

        if (expectedHeaderText.equals(actHeaderText)){
            System.out.println("Verification of header is completed result is:PASSED");
        }else {
            System.out.println("Verification of header is not completed result is:FAILED");
        }
        driver.quit();
    }
}
