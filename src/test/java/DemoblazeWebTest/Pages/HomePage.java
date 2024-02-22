package DemoblazeWebTest.Pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import static DemoblazeWebTest.Utility.WebUtility.driver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomePage {
    static Faker faker = new Faker();
    String randomName = faker.name().firstName();
    String randomEmail = randomName + "@fionafinalproject.jayjay";

    By loginMenu = By.id("login2");
    By signUpMenu = By.id("signin2");
    By loginPopUpMenu = By.id("logInModal");
    By signUpPopUpMenu = By.id("signInModal");
    By loginUserEmail = By.id("loginusername");
    By signUpUserEmail = By.id("sign-username");
    By loginUserPassword = By.id("loginpassword");
    By signUpUserPassword = By.id("sign-password");
    By loginButtoninPopUp = By.cssSelector("#logInModal > div > div > div.modal-footer > button.btn.btn-primary");
    By signUpButtoninPopUp = By.cssSelector("#signInModal > div > div > div.modal-footer > button.btn.btn-primary");
    By welcomeUserInHomepage = By.id("nameofuser");


    public void userGoToHomePage(){
        driver.get("https://www.demoblaze.com/index.html");
    }
    public void userClickLoginMenu(){
        driver.findElement(loginMenu).click();
    }
    public void userClicksSignUpMenu(){
        driver.findElement(signUpMenu).click();
    }
    public void validateLoginPopUpIsDisplayed(){
        driver.findElement(loginPopUpMenu).isDisplayed();
    }
    public void validateSignUpPopUpIsDisplayed(){
        driver.findElement(signUpPopUpMenu).isDisplayed();
    }
    public void userInputEmailToLogin(String userEmail){
        driver.findElement(loginUserEmail).sendKeys(userEmail);
    }
    public void userInputEmailToSignUp(){
        driver.findElement(signUpUserEmail).sendKeys(randomEmail);
    }
    public void userInputExistingEmailToSignUp(String existingEmail){
        driver.findElement(signUpUserEmail).sendKeys(existingEmail);
    }

    public void userInputPasswordToLogin(String userPassword){
        driver.findElement(loginUserPassword).sendKeys(userPassword);
    }
    public void userInputPasswordToSignUp(String defaultPassword){
        driver.findElement(signUpUserPassword).sendKeys(defaultPassword);
    }
    public void userClickLoginButton(){
        driver.findElement(loginButtoninPopUp).click();
    }
    public void userClickSignUpButton(){
        driver.findElement(signUpButtoninPopUp).click();
    }

    public void usernameIsDisplayedinHomepage(){
        assertEquals("Welcome "+"bottle123123@gmail.com",driver.findElement(welcomeUserInHomepage).getText());
    }
    public void homepagePopUpMessage(String homepagePopUpMessage) throws InterruptedException {
        Thread.sleep(5000);
        assertEquals(homepagePopUpMessage,driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
    }
}
