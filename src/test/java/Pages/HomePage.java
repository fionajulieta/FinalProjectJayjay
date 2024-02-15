package Pages;

import org.openqa.selenium.By;

import static Helper.Utility.driver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomePage {

    By loginMenu = By.id("login2");
    By loginPopUpMenu = By.id("logInModal");
    By loginUserEmail = By.id("loginusername");
    By loginUserPassword = By.id("loginpassword");
    By loginButtoninPopUp = By.cssSelector("#logInModal > div > div > div.modal-footer > button.btn.btn-primary");
    By welcomeUserInHomepage = By.id("nameofuser");


    public void userGoToHomePage(){
        driver.get("https://www.demoblaze.com/index.html");
    }
    public void userClickLoginMenu(){
        driver.findElement(loginMenu).click();
    }
    public void validateLoginPopUpIsDisplayed(){
        driver.findElement(loginPopUpMenu).isDisplayed();
    }

    public void userInputEmailToLogin(String userEmail){
        driver.findElement(loginUserEmail).sendKeys(userEmail);
    }
    public void userInputPasswordToLogin(String userPassword){
        driver.findElement(loginUserPassword).sendKeys(userPassword);
    }
    public void userClickLoginButton(){
        driver.findElement(loginButtoninPopUp).click();
    }
    public void usernameIsDisplayedinHomepage(){
        assertEquals("Welcome "+"bottle123123@gmail.com",driver.findElement(welcomeUserInHomepage).getText());
    }
    public void homepageErrorPopUpMessage(String loginPopUpMessage){
        assertEquals(loginPopUpMessage,driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
    }

}
