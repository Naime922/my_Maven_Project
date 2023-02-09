package seleniumTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC5_BackAndForthNavigation {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=TaskUtil.setUpChromeDriver();
        driver.get("https://www.google.com");

        //<a class="gb_p" aria-label="Gmail" data-pid="23" href="https://mail.google.com/mail/&amp;ogbl" target="_top">Gmail</a>
        WebElement gmailButton= driver.findElement(By.cssSelector("a[class='gb_p']"));
        gmailButton.click();
        String expected="Gmail";
        String actual=driver.getTitle();
        if (actual.contains(expected)){
            System.out.println("Title contains Gmail verification PASSED");
        }else {
            System.out.println("Title does not contain Gmail verification FAILED");
        }

        Thread.sleep(3000);
        driver.navigate().back();
        String expectedTitle="Google";
        String actualTitle=driver.getTitle();
        if (expectedTitle.equals(actualTitle)){
            System.out.println("Verification completed result is: PASSED");
        }else {
            System.out.println("Verification is not completed result is: FAILED");
        }

    }
}
