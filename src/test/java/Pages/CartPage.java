package Pages;

import org.openqa.selenium.By;

import java.util.Arrays;

import static Helper.Utility.driver;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

public class CartPage {
    By cartTableList = By.id("tbodyid");
    By deleteButtonLastAddedItem = By.xpath("//*[@id='tbodyid']/tr[@class='success' and td[2]/text()='Nokia lumia 1520']/td[4]/a");

    public void validateItemIsInCart(){
        String driverItemList = driver.findElement(cartTableList).getText();
        String expectedItem1 = "Nokia lumia 1520";
        assertTrue(driverItemList.contains(expectedItem1));
    }
    public void validateBothItemAreInCart(){
        String driverItemList = driver.findElement(cartTableList).getText();
        String expectedItem1 = "Nokia lumia 1520";
        String expectedItem2 = "Sony vaio i7";
        assertTrue(driverItemList.contains(expectedItem1));
        assertTrue(driverItemList.contains(expectedItem2));
    }
    public void setDeleteButtonLastAddedItem() throws InterruptedException {
        driver.findElement(deleteButtonLastAddedItem).click();
        Thread.sleep(5000);
    }

    public void validateCartDoesNotContainLastAddedItem(){
        String driverItemList = driver.findElement(cartTableList).getText();
        String expectedItem2 = "Nokia lumia 1520";
        assertFalse(driverItemList.contains(expectedItem2));
    }
}
