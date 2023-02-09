package seleniumTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC4_FBCreatePageLinkVerification {
    public static void main(String[] args) {
        WebDriver driver=TaskUtil.setUpChromeDriver();
        driver.get("https://www.facebook.com");

        //<a href="/pages/create/?ref_type=registration_form" class="_8esh">Create a Page</a>
        WebElement createPageLink= driver.findElement(By.cssSelector("a[href='/pages/create/?ref_type=registration_form']"));
      String actualLink= createPageLink.getAttribute("href");
      String expected="registration_form";

      if (actualLink.contains(expected)){
          System.out.println("Verification is completed result is:PASSED");
      }else {
          System.out.println("Verification is not completed");
      }






    }
}
