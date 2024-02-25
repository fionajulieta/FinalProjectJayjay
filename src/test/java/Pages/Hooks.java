package Pages;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import static Helper.WebUtility.driver;
import static Helper.WebUtility.startDriver;


public class Hooks {

    @BeforeAll
    public static void beforeTest() {
        System.out.println("Start of scenario");
        startDriver();
    }
    @AfterEach
    public void afterEach() throws InterruptedException {
        Thread.sleep(2000);
    }

    @AfterAll
    public static void afterTest() throws InterruptedException {
        System.out.println("End of scenario");
        Thread.sleep(2000);
        driver.close();
    }
}
