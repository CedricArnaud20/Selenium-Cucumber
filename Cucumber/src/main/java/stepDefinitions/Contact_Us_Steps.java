package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Contact_Us_Steps {
    private WebDriver driver;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/java/drivers/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
    }

// Forma mais soft de chamar o chromedriver pegando do  github.bonigarcia e instalando nas dependencias do pom.xml
//    WebDriverManager.chromedriver().setup();
//    driver = new ChromeDriver();

    @After
    public void tearDown (){
        driver.quit();
    }

    @Given("I acess the webdriver university contact us page")
    public void i_acess_the_webdriver_university_contact_us_page()  {
            driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");

    }

    //Scenario 1

    @When("I enter a first name")
    public void i_enter_a_first_name() {
        driver.findElement(new By.ByCssSelector("[name=\"first_name\"]")).sendKeys("Cedric");

    }
    @And("I enter a last name")
    public void i_enter_a_last_name() {
        driver.findElement(new By.ByCssSelector("[name=\"last_name\"]")).sendKeys("james");

    }
    @And("I enter an email address")
    public void i_enter_an_email_address()  {
        driver.findElement(new By.ByCssSelector("[name=\"email\"]")).sendKeys("Cedric@gmail.com");

    }
    @And("I enter a comment")
    public void i_enter_a_comment()  {
        driver.findElement(By.name("message")).sendKeys("Hello i´m here");

    }

   //Scenario 2
    @And("I enter a specific first name {word}")
    public void i_enter_a_specific_first_name(String firstName) {
        driver.findElement(new By.ByCssSelector("[name=\"first_name\"]")).sendKeys(firstName);
        System.out.println(firstName);
    }

    @And("I enter a specific last name {word}")
    public void i_enter_a_specific_last_name(String lastName) {
        driver.findElement(new By.ByCssSelector("[name=\"last_name\"]")).sendKeys(lastName);
        System.out.println(lastName);
    }

    @And("I enter a specific email address {word}")
    public void i_enter_a_specific_email_address(String email) {
        driver.findElement(new By.ByCssSelector("[name=\"email\"]")).sendKeys(email);
        System.out.println(email);
    }

    @And("I enter a specific comment {string}")
    public void i_enter_a_specific_comment(String comment) {
        driver.findElement(By.name("message")).sendKeys(comment);
        System.out.println(comment);
    }

    @And("I click on submit button")
    public void i_click_on_submit_button() {
        driver.findElement(By.cssSelector("[value=\"SUBMIT\"]")).click();
    }


    @Then("I should be presented with a sucessful contact us submission message")
    public void i_should_be_presented_with_a_sucessful_contact_us_submission_message() {
        WebElement contactUs_Submission_Message = driver.findElement(By.xpath("//div[@id='contact_reply']/h1[.='Thank You for your Message!']"));
        Assert.assertEquals(contactUs_Submission_Message.getText(), "Thank You for your Message!");

    }


}
