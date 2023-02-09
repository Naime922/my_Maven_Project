package seleniumTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC6_GoogleSearch {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=TaskUtil.setUpChromeDriver();
        driver.get("https://google.com");

        //<input class="gLFyf" jsaction="paste:puy29d;" maxlength="2048" name="q" type="text" aria-autocomplete="both" aria-haspopup="false"
        // autocapitalize="off" autocomplete="off" autocorrect="off" autofocus="" role="combobox" spellcheck="false" title="Search" value=""
        // aria-label="Search" data-ved="0ahUKEwjymcaRlZP9AhVHiO4BHQ6iCRcQ39UDCAY">

        WebElement searchBox= driver.findElement(By.className("gLFyf"));
        searchBox.sendKeys("apple", Keys.ENTER);
        Thread.sleep(3000);

        String expectedWord="apple";
        String actualTitle=driver.getTitle();

        if (actualTitle.startsWith(expectedWord)){
            System.out.println("Verification completed title contains 'apple' result is: PASSED");
        }else {
            System.out.println("Verification is not completed result is: FAILED");
        }





    }
}
