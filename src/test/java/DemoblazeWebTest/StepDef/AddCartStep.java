package DemoblazeWebTest.StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddCartStep {
    @When("user click item {int} in homepage")
    public void user_click_item_in_homepage(Integer int1) {
    }

    @And("user click add to cart button")
    public void userClickAddToCartButton() {
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
}
