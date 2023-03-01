package seleniumTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC10_EtsySearchTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=TaskUtil.setUpChromeDriver();
        driver.get("https://www.etsy.com");

        /**<input id="global-enhancements-search-query" data-id="search-query" data-search-input="" type="text"
         * name="search_query" class="wt-input wt-input-btn-group__input global-enhancements-search-input-btn-group__input
         wt-pr-xs-7
         " placeholder="Search for anything" value="" autocomplete="off" autocorrect="off" autocapitalize="off">*/
        WebElement searchBox= driver.findElement(By.id("global-enhancements-search-query"));
        searchBox.sendKeys("bamboo pen"+Keys.ENTER);
        System.out.println(driver.getTitle());
        String expectedTitle="part of the item";
        String actTitle=driver.getTitle();
        if (expectedTitle.equals(actTitle)){
            System.out.println("Verification is completed result is:PASSED");
        }else {
            System.out.println("Verification is not completed result is:FAILED ");
            System.out.println("Actual title is: "+actTitle);
        }
        Thread.sleep(3000);

        /**<span class="wt-display-table-cell wt-text-left-xs">Gifts for Every Valentine</span>*/
        WebElement link= driver.findElement(By.cssSelector("span[class='wt-display-table-cell wt-text-left-xs']"));
        link.click();

        /**<h1 class="wt-text-display-01 wt-pb-xs-2 wt-text-black">Valentine's Day Gifts</h1>*/
        WebElement header=driver.findElement(By.cssSelector("h1[class='wt-text-display-01 wt-pb-xs-2 wt-text-black']"));
        System.out.println(header.getText());
        String expectedHeader="Gifts for every valentine";
        String actHeader=header.getText();
        if (expectedHeader.equals(actHeader)){
            System.out.println("Verification is completed header is matching to expected header verification result is:PASSED");
        }else {
            System.out.println("Verification is not completed header mismatched. Verification result is:FAILED ");
            System.out.println("Actual header text is: "+actHeader);
        }
        //driver.quit();

    }
}
