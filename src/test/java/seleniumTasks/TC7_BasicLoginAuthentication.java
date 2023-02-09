package seleniumTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC7_BasicLoginAuthentication {
    public static void main(String[] args) {
        WebDriver driver=TaskUtil.setUpChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        String expectedTitle="Web Orders Login";
        String actualTitle=driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title has been matched result of verification is: PASSED");
        }else {
            System.out.println("Title is not matched result of verification is: FAILED");
        }

        //<input name="ctl00$MainContent$username" type="text" id="ctl00_MainContent_username" class="txt" style="width:142px">
        WebElement usernameBox= driver.findElement(By.name("ctl00$MainContent$username"));
        usernameBox.sendKeys("Tester");

        //<input name="ctl00$MainContent$password" type="password" id="ctl00_MainContent_password" class="txt" style="width:142px">
        WebElement passwordBox= driver.findElement(By.name("ctl00$MainContent$password"));
        passwordBox.sendKeys("test");

        //<input type="submit" name="ctl00$MainContent$login_button" value="Login" id="ctl00_MainContent_login_button" class="button">
        WebElement signInButton=driver.findElement(By.name("ctl00$MainContent$login_button"));
        signInButton.click();

        String expectedNewTitle="Web Orders";
        String actualNewTitle=driver.getTitle();

        if (expectedNewTitle.equals(actualNewTitle)){
            System.out.println("New title matched verification is:PASSED");
        }else {
            System.out.println("New title is not matched verification is:FAILED");
        }
        driver.quit();

    }
}
