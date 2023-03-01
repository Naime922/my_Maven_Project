package technostudyB7.day6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Xpath {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        //<input class="input_error form_input" placeholder="Username" type="text" data-test="username" id="user-name" name="user-name"
        // autocorrect="off" autocapitalize="none" value="">

        WebElement userName= driver.findElement(By.xpath("//input[@id='user-name']"));
        userName.sendKeys("standard_user");

        //<input class="input_error form_input" placeholder="Password" type="password" data-test="password" id="password"
        // name="password" autocorrect="off" autocapitalize="none" value="">
        WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");

        //<input type="submit" class="submit-button btn_action" data-test="login-button" id="login-button"
        // name="login-button" value="Login">
        WebElement logInButton=driver.findElement(By.xpath("//input[@data-test='login-button']"));
        logInButton.click();

        //<div class="inventory_item"><div class="inventory_item_img"><a href="#" id="item_4_img_link"><img alt="Sauce Labs Backpack"
        // class="inventory_item_img" src="/static/media/sauce-backpack-1200x1500.34e7aa42.jpg"></a></div><div class="inventory_item_description"><div
        // class="inventory_item_label"><a href="#" id="item_4_title_link"><div class="inventory_item_name">Sauce Labs Backpack</div></a><div
        // class="inventory_item_desc">carry.allTheThings() with the sleek,
        // streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.</div></div><div class="pricebar"><div
        // class="inventory_item_price">$29.99</div><button class="btn btn_primary btn_small btn_inventory"
        // data-test="add-to-cart-sauce-labs-backpack" id="add-to-cart-sauce-labs-backpack" name="add-to-cart-sauce-labs-backpack">Add to cart</button></div></div></div>
        WebElement backPack=driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
        String product1Text=backPack.getText();
        backPack.click();

        //<button class="btn btn_primary btn_small btn_inventory"
        // data-test="add-to-cart-sauce-labs-backpack" id="add-to-cart-sauce-labs-backpack"
        // name="add-to-cart-sauce-labs-backpack">Add to cart</button>

        WebElement addToCartButton=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        addToCartButton.click();

        driver.navigate().back();

        //<div class="inventory_item_name">Sauce Labs Bolt T-Shirt</div>
        WebElement secondItem=driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        String product2Text=secondItem.getText();
        secondItem.click();

        //<button class="btn btn_primary btn_small btn_inventory" data-test="add-to-cart-sauce-labs-bolt-t-shirt"
        // id="add-to-cart-sauce-labs-bolt-t-shirt" name="add-to-cart-sauce-labs-bolt-t-shirt">Add to cart</button>

        WebElement addToCartButton2=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
        addToCartButton2.click();

        //<a class="shopping_cart_link"><span class="shopping_cart_badge">2</span></a>
        WebElement shoppingCartButton=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        shoppingCartButton.click();

        WebElement checkOutButton = driver.findElement(By.xpath("//button[@class='btn btn_action btn_medium checkout_button']"));
        checkOutButton.click();

        WebElement customerName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        customerName.sendKeys("John");

        WebElement customerLastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        customerLastName.sendKeys("Snow");

        WebElement zipCode = driver.findElement(By.xpath("//input[@placeholder='Zip/Postal Code']"));
        zipCode.sendKeys("548965");

        WebElement continueButton = driver.findElement(By.xpath("//input[@type='submit']"));
        continueButton.click();

        WebElement checkOutProduct1=driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[1]"));
        WebElement checkOutProduct2=driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[2]"));

        List<String>checkOutList=new ArrayList<>();
        checkOutList.add(checkOutProduct1.getText());
        checkOutList.add(checkOutProduct2.getText());

        System.out.println(checkOutList.contains(product1Text));
        System.out.println(checkOutList.contains(product2Text));
        driver.quit();






    }
}
