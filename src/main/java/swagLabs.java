package PACKAGE_NAME;

public class swagLabs {
  import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;



public class swagLabs {
//    the main method in Java. It is the starting point of your program execution.
//    public Means the method can be accessed from anywhere.
//    static Means you can run this method without creating an object of the class.
//    void Means the method does not return any value.
//    main This is the special method name where Java starts execution.
//    string This stores command-line arguments.
//    throws This handles possible interruption errors from:
    public static void main(String[] args) throws InterruptedException {

// No cookies from previous sessions
//No cached data
//No saved login information
//Tests run in a clean browser environment
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");

//        Opens a new Chrome browser using the settings stored in options
//        Maximizes the browser window to full screen.
//        Opens the specified website in the browser.
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");


//     Find the username field and enter standard_user.
        WebElement user = driver.findElement(By.id("user-name"));
        user.sendKeys("standard_user");

//       Pauses the program for 2000 milliseconds (2 seconds).
        Thread.sleep(2000);
        WebElement pass = driver.findElement(By.id("password"));
        pass.sendKeys("secret_sauce");
        Thread.sleep(2000);
        WebElement log = driver.findElement(By.id("login-button"));
        log.click();

// Checks whether the page title contains the text "Swag Labs"
        if (driver.getTitle().contains("Swag Labs")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }


        Select dropdown;
// first dropdown
        dropdown = new Select(driver.findElement(By.className("product_sort_container")));
        dropdown.selectByVisibleText("Price (low to high)");
        Thread.sleep(2000);

//        second dropdown
        dropdown = new Select(driver.findElement(By.className("product_sort_container")));
        dropdown.selectByVisibleText("Price (high to low)");
        Thread.sleep(2000);

//        third dropdown
        dropdown = new Select(driver.findElement(By.className("product_sort_container")));
        dropdown.selectByVisibleText("Name (Z to A)");
        Thread.sleep(2000);

//        fourth
        dropdown = new Select(driver.findElement(By.className("product_sort_container")));
        dropdown.selectByVisibleText("Name (A to Z)");
        Thread.sleep(2000);

        //Scroll vertical
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0,600)", "");

//        WebElement cart = driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
//        cart.click();
//        Thread.sleep(2000);

//        WebElement cart1 = driver.findElement(By.id("remove-test.allthethings()-t-shirt-(red)"));
//        cart1.click();
//        Thread.sleep(2000);

        WebElement cart2 = driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
        cart2.click();
        Thread.sleep(2000);

//        sroll up
        JavascriptExecutor javascriptExecutor1 = (JavascriptExecutor) driver;
        javascriptExecutor1.executeScript
                ("window.scrollTo(document.body.scrollHeight, 0)");
        Thread.sleep(2000);

//        view cart
        WebElement viewcart = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
        viewcart.click();
        Thread.sleep(2000);



//to check similar item  is carted if its failed its bug
        if (driver.getTitle().contains("$15.99")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

//check out
        WebElement checkout = driver.findElement(By.id("checkout"));
        checkout.click();
        Thread.sleep(2000);

//        enter details in checkout page
        WebElement fname = driver.findElement(By.id("first-name"));
        fname.click();
        fname.sendKeys("Sana");
        Thread.sleep(2000);

        WebElement lname = driver.findElement(By.id("last-name"));
        lname.click();
        lname.sendKeys("P");
        Thread.sleep(2000);

        WebElement code = driver.findElement(By.id("postal-code"));
        code.click();
        code.sendKeys("679324");
        Thread.sleep(2000);

//        click on cancel
//        driver.findElement(By.id("cancel")).click();
//        Thread.sleep(2000);

        //check out
//        WebElement checkout1 = driver.findElement(By.id("checkout"));
//        checkout1.click();
//        Thread.sleep(2000);

//        continue
        driver.findElement(By.id("continue")).click();
        Thread.sleep(2000);


//scroll down
        JavascriptExecutor javascriptExecutor2 = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript
                ("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(2000);

//        click on finish
        driver.findElement(By.id("finish")).click();
        Thread.sleep(2000);


//click on back to product button
        driver.findElement(By.id("back-to-products")).click();
        Thread.sleep(2000);

// Menu
//        WebElement menu = driver.findElement(By.id("react-burger-menu-btn"));
//        menu.click();
        driver.findElement(By.id("react-burger-menu-btn")).click();

//        click on about
//        driver.findElement(By.xpath("//*[@id=\"about_sidebar_link\"]")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement about = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.id("about_sidebar_link")));
        about.click();

    }
}
}
