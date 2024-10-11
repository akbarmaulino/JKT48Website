package steps;

import Additional.Hooks;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class Login {
    WebDriver driver;
    LoginPage loginPages;
    HomePage homePages;

    @Given("User Access Website")
    public void user_access_website() {
        driver = Hooks.getDriver();
        loginPages = new LoginPage(driver);
        homePages = new HomePage(driver);

    }


    @And("User Klik Login Button")
    public void user_klik_login_button() {
        homePages.clicklogin();
    }

    @When("User Input Valid Credentials")
    public void user_input_valid_credentials() {
        loginPages.inputLoginId("maulinoakbar8@gmail.com");
        loginPages.inputPassword("Maulino1234@");
    }

    @And("User Click Login Button")
    public void user_click_login_button() {
        loginPages.clickLogin();
    }
    @Then("User Should Be Logged In")
    public void user_should_be_logged_in() {
        System.out.println("Sukses To Login");
    }
}
