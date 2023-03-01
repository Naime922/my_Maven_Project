package technostudyB7.day6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class XpathLearning {
    public static void main(String[] args) {
//        1- Go to https://www.saucedemo.com/
//        2- login with valid credentials
//        3- Click on Sauce Labs Backpack and add to the cart
//        4- Click on Back To Products
//        5- Click on Sauce Labs Bolt T-Shirt and add to the cart
//        6- Click on the cart
//        7- Click on the CheckOut button
//        8- Fill the form and click on Continue
//        9- Check if you see your products

      //tagName[attribute='value']"/
        //tagName[@attribute='value'] ==> relative xpath
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.worldometers.info/world-population/%22");

        WebElement worldPopulationTitle=driver.findElement(By.xpath("//div[@id='maincounter-wrap']//h1"));
        System.out.println(worldPopulationTitle.getText());
        WebElement worldPopulationNumber=driver.findElement(By.xpath("//span[@class='rts-counter']"));
        System.out.println(worldPopulationNumber.getText());
    }
    }

