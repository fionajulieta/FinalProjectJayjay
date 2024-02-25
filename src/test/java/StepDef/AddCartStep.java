package StepDef;

import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddCartStep {
    HomePage homePage;

    public AddCartStep(){
        this.homePage = new HomePage();
    }
    @When("user click first item in homepage")
    public void userClickFirstItemInHomepage() {
        homePage.phoneProduct();
    }

    @When("user click second item in homepage")
    public void userClickSecondItemInHomepage() {
    }

    @And("user click add to cart button")
    public void userClickAddToCartButton() {
        homePage.addItemToCart();
    }

    @And("validate item is added in cart menu")
    public void validateItemIsAddedInCartMenu() {
    }

    @When("user delete an item from cart")
    public void userDeleteAnItemFromCart() {
        
    }

    @Then("item will disappeared from cart item list")
    public void itemWillDisappearedFromCartItemList() {
    }

    @When("user delete item {int} from cart")
    public void userDeleteItemFromCart(int arg0) {
        
    }

    @Then("item {int} will disappeared from cart item list")
    public void itemWillDisappearedFromCartItemList(int arg0) {
    }


}
