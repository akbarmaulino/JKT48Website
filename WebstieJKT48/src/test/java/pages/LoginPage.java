package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "login_id")
    private WebElement loginIdInput;

    @FindBy(id = "login_password")
    private WebElement passwordInput;

    @FindBy(css = "button.btn.btn-block.btn-pink" )
    private WebElement loginButton;

    public void inputLoginId(String loginId) {
        loginIdInput.sendKeys(loginId);
    }

    public void inputPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void clickLogin() {
        loginButton.click();
    }


}
