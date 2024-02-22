package DummyAPITest.Helper;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Utility {
    public static String shuffleTitle() {
        List<String> titleList = Arrays.asList("mr", "ms", "mrs", "miss", "dr");
        Collections.shuffle(titleList);

        Random rand = new Random();
        int randomIndex = rand.nextInt(titleList.size());
        return titleList.get(randomIndex);
    }

    public static String generateRandomPictureLink() {
        String allowedChars = "abcdefghijklmnopqrstuvwxyz" + "1234567890";
        String pictureLink = "";
        String temp = RandomStringUtils.randomAlphanumeric(10);
        pictureLink = "https://" + temp + ".jpg";
        return pictureLink;
    }
}