import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class bmiCalculator {

    @Test
    public void starvationResultTest() {
        //Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // Open url HealthUnify
        driver.get("https://healthunify.com/bmicalculator/");

        //Set 'Weight'
        driver.findElement(By.name("wg")).sendKeys("35");

        //Set 'Height'
        driver.findElement(By.name("ht")).sendKeys("163");

        //Click 'Calculate'
        driver.findElement(By.cssSelector("[value=Calculate]")).click();

        //Add Check
        String resultText = driver.findElement(By.name("desc")).getAttribute("value");
        driver.quit();
        Assert.assertEquals(resultText,"Your category is Starvation");
    }

    @Test
    public void underweightResultTest() {
        //Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Open url HealthUnify
        driver.get("https://healthunify.com/bmicalculator");

        //Set 'Weight'
        driver.findElement(By.name("wg")).sendKeys("45");

        //Set 'Height'
        driver.findElement(By.name("ht")).sendKeys("163");

        //Click 'Calculate'
        driver.findElement(By.cssSelector("[value=Calculate]")).click();

        //Add Check
        String resultText = driver.findElement(By.name("desc")).getAttribute("value");
        driver.quit();
        Assert.assertEquals(resultText,"Your category is Underweight");
    }

    @Test
    public void normalResultTest() {
        //Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Open url HealthUnify
        driver.get("https://healthunify.com/bmicalculator");

        //Set 'Weight'
        driver.findElement(By.name("wg")).sendKeys("55");

        //Set 'Height'
        driver.findElement(By.name("ht")).sendKeys("163");

        //Click 'Calculate'
        driver.findElement(By.cssSelector("[value=Calculate]")).click();

        //Add Check
        String resultText = driver.findElement(By.name("desc")).getAttribute("value");
        driver.quit();
        Assert.assertEquals(resultText,"Your category is Normal");
    }

    @Test
    public void overweightResultTest() {
        //Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Open url HealthUnify
        driver.get("https://healthunify.com/bmicalculator");

        //Set 'Weight'
        driver.findElement(By.name("wg")).sendKeys("75");

        //Set 'Height'
        driver.findElement(By.name("ht")).sendKeys("163");

        //Click 'Calculate'
        driver.findElement(By.cssSelector("[value=Calculate]")).click();
        //Add Check
        String resultText = driver.findElement(By.name("desc")).getAttribute("value");
        driver.quit();
        Assert.assertEquals(resultText,"Your category is Overweight");
    }

    @Test
    public void obeseResultTest() {
        //Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Open url HealthUnify
        driver.get("https://healthunify.com/bmicalculator");

        //Set 'Weight'
        driver.findElement(By.name("wg")).sendKeys("85");

        //Set 'Height'
        driver.findElement(By.name("ht")).sendKeys("163");

        //Click 'Calculate'
        driver.findElement(By.cssSelector("[value=Calculate]")).click();

        //Add Check
        String resultText = driver.findElement(By.name("desc")).getAttribute("value");
        driver.quit();
        Assert.assertEquals(resultText,"Your category is Obese");
    }

}
