package seleniumTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC2_FBIncorrectLogInTitleVerification {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=TaskUtil.setUpChromeDriver();
        driver.get("https://www.facebook.com");
        //<input type="text" class="inputtext _55r1 _6luy" name="email" id="email" data-testid="royal_email"
        // placeholder="Email or phone number" autofocus="1"
        // aria-label="Email or phone number">
        WebElement userNameBox= driver.findElement(By.id("email"));
        userNameBox.sendKeys("nai");

        //<input type="password" class="inputtext _55r1 _6luy _9npi" name="pass" id="pass" data-testid="royal_pass" placeholder="Password" aria-label="Password">
        WebElement passwordBox= driver.findElement(By.id("pass"));
        passwordBox.sendKeys("naime12345");

        //<button value="1" class="_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy" name="login" data-testid="royal_login_button" type="submit" id="u_0_5_iY">Log In</button>
        WebElement logInButton=driver.findElement(By.name("login"));
        logInButton.click();
        Thread.sleep(3000);
        System.out.println("Expected title is: "+driver.getTitle());

        String expectedChangedTitle="Log into Facebook";
        String actualChangedTitle=driver.getTitle();

        if (expectedChangedTitle.equals(actualChangedTitle)){
            System.out.println("Verification is completed title changed result is: PASSED");
        }else {
            System.out.println("Verification is not completed result is: FAILED");
            System.out.println(actualChangedTitle);
        }

    }
}
