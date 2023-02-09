package seleniumTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC9_ZeroBankLinkTextVerification {
    public static void main(String[] args) {
        WebDriver driver=TaskUtil.setUpChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");

        //<div class="container">
        //                <a href="/index.html" class="brand">Zero Bank</a>
        //            </div>
        WebElement linkText= driver.findElement(By.className("brand"));
        System.out.println(linkText.getText());
        String expLinkText="Zero Bank";
        String actLinkText=linkText.getText();
        if (expLinkText.equals(actLinkText)){
            System.out.println("Link text is matched :PASSED");
        }else {
            System.out.println("Link text is not matched:FAILED");
        }

        String actHREF=linkText.getAttribute("href");
        String expectedHref="index.html";

        if (actHREF.contains(expectedHref)){
            System.out.println("HREF contains expected value verification is:PASSED");
        }else {
            System.out.println("HREF is not contain expected value verification is:FAILED");
            System.out.println(actHREF);
        }


    }
}
