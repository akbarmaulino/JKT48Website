package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.PublicKey;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

public class HomePage {
    WebDriver driver;
    WebDriverWait wait;
    Actions actions;

    public HomePage(WebDriver webDrivers){
        driver = webDrivers;
        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        actions = new Actions(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "/html/body/div[2]/div[1]/div/div[2]/div[1]/a[1]")
    private WebElement loginbutton;

    public void clicklogin(){
        loginbutton.click();
    }


}
