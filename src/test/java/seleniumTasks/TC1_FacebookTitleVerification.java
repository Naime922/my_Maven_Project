package seleniumTasks;

import org.openqa.selenium.WebDriver;

public class TC1_FacebookTitleVerification {
    public static void main(String[] args) {

        WebDriver driver=TaskUtil.setUpChromeDriver();
        driver.get("https://www.facebook.com");

        //<title id="pageTitle">Facebook - log in or sign up</title>
        System.out.println("Title of the Facebook page is: "+driver.getTitle());
        String expectedTitle="Facebook - log in or sign up";
        String actualTitle=driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("Verification is completed result: PASS");
        }else {
            System.out.println("Verification is not completed result is: FAILED");
            System.out.println(actualTitle);
        }

    }
}
