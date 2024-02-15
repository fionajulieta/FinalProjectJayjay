package StepDef;

import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {

    HomePage homePage;

    public LoginStep(){
        this.homePage = new HomePage();
    }

    @Given("user is in homepage")
    public void user_is_in_homepage() {
        homePage.userGoToHomePage();
    }

    @When("user click login menu")
    public void userClickLoginMenu() {
        homePage.userClickLoginMenu();
    }

    @Then("validate login pop-up menu is displayed")
    public void validateLoginPopUpMenuIsDisplayed() {
        homePage.validateLoginPopUpIsDisplayed();
    }

    @And("user input email {string}")
    public void userInputEmail(String userEmail) {
        homePage.userInputEmailToLogin(userEmail);
    }

    @And("user input password {string}")
    public void userInputPassword(String userPassword) {
        homePage.userInputPasswordToLogin(userPassword);
    }

    @And("user click login button")
    public void userClickLoginButton() throws InterruptedException {
        homePage.userClickLoginButton();
        Thread.sleep(5000);
    }

    @Then("user will stayed in homepage with username displayed in menu")
    public void userWillStayedInHomepageWithUsernameDisplayedInMenu() {
        homePage.usernameIsDisplayedinHomepage();
    }

    @Then("website will displayed error pop-up message {string}")
    public void websiteWillDisplayedErrorPopUpMessage(String loginPopUpMessage) {
        homePage.homepageErrorPopUpMessage(loginPopUpMessage);
    }
}
