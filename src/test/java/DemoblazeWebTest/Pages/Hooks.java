package DemoblazeWebTest.Pages;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static DemoblazeWebTest.Utility.WebUtility.driver;
import static DemoblazeWebTest.Utility.WebUtility.startDriver;


public class Hooks {

    @Before
    public void beforeTest() {
        System.out.println("Start of scenario");
        startDriver();
    }
    @AfterEach
    public void afterEach() throws InterruptedException {
        Thread.sleep(2000);
    }

    @After
    public void afterTest() throws InterruptedException {
        System.out.println("End of scenario");
        Thread.sleep(2000);
        driver.close();
    }
}
