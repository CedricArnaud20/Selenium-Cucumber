package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class loginPage {
    private WebDriver driver;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/java/drivers/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
    }



    @Given("I acess the login portal university")
    public void i_acess_the_login_portal_university() {
            driver.get("https://www.webdriveruniversity.com/Login-Portal/index.html?");
    }
    @When("I enter the correct Username")
    public void i_enter_the_correct_username() {
        driver.findElement(By.id("text")).sendKeys("webdriver");
    }
    @And("I enter the correct password")
    public void i_enter_the_correct_password() {
        driver.findElement(By.id("password")).sendKeys("webdriver123");
    }
    @And("I click on login button")
    public void i_click_on_login_button() {
        driver.findElement(By.id("login-button")).click();
n 
n Then("I should be presented with a  message")
n ublic void i_should_be_presented_with_a_message() {
n   String login_message = driver.switchTo().alert().getText();
n    Assert.assertEquals(login_message,"validation succeeded");
n 
n 
n 
n /INCORRECT  LOGIN DATA
n 
n When("I enter the incorret Username")
n ublic void i_enter_the_incorret_username() {
n    driver.findElement(By.id("text")).sendKeys("webdrver");
n 
n And("I enter the incorrect password")
n ublic void i_enter_the_incorrect_password() {
n    driver.findElement(By.id("password")).sendKeys("webdriver123");
n 
n Then("I should be presented with a sucessful login message")
n ublic void i_should_be_presented_with_a_sucessful_login_message() {
n    String login_message = driver.switchTo().alert().getText();
n    Assert.assertEquals(login_message,"validation failed");
n 
n 


    @When("I enter a username webdriver")
    public void i_enter_a_username_webdriver() {
        driver.findElement(By.id("text")).sendKeys("webdriver");
    }
    @When("I enter a password webdriver123>")
    public void i_enter_a_password_webdriver123() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @And("I click on the login button")
    public void i_click_on_the_login_button() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("I should be presented with the following validatin message validation succeeded")
    public void i_should_be_presented_with_the_following_validatin_message_validation_succeeded() {
        String login_message = driver.switchTo().alert().getText();
        Assert.assertEquals(login_message,"validation failed");
    }


}
