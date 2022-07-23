import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IndexTest {
    private static final String PATH = "file:///C:/Users/marias/IdeaProjects/marias_BMI_calculator/src/test/resources/index.html";

    @Test
    public void checking3ElementsDisplayedTest() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(PATH);

        String welcomeToUser = driver.findElement(By.name("welcome_user")).getText();
        boolean welcomeMessage = welcomeToUser.equals("Welcome, Stranger!");
        Assert.assertTrue(welcomeMessage, "Welcome text doesn't exist!");

        WebElement select = driver.findElement(By.id("list"));
        boolean selectDisplayed = select.isDisplayed();
        Assert.assertTrue(selectDisplayed, "Select doesn't exist!");

        WebElement button = driver.findElement(By.id("button"));
        boolean buttonIsDisplayed = button.isDisplayed();
        Assert.assertTrue(buttonIsDisplayed, "Button doesn't exist!");

        driver.quit();
    }

    @Test
    public void nameIsDisplayedTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(PATH);

        String name = driver.findElement(By.name("my_name")).getText();
        boolean nameIsDisplayed = name.contains("Maria");
        Assert.assertTrue(nameIsDisplayed, "Name doesn't exist!");

        driver.quit();
    }

    @Test
    public void checkingLinkTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(PATH);

        String linkUrl = driver.findElement(By.id("link_w3school")).getAttribute("href");
        driver.get(linkUrl);
        boolean isTitleW3Schools = driver.getTitle().contains("W3Schools");
        Assert.assertTrue(isTitleW3Schools, "Title doesn't exist!");

        driver.quit();
    }

    @Test
    public void checkAltImageTextTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(PATH);

        String altText = driver.findElement(By.id("image")).getAttribute("alt");
        boolean isAltTextExist = !altText.isEmpty();
        Assert.assertTrue(isAltTextExist, "Alt text doesn't exist!");

        driver.quit();
    }
}
