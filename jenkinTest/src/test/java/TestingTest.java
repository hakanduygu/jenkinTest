import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestingTest {

    public WebDriver driver;
    @BeforeMethod
    public void setUp() {
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testExample() {
        driver.get("https://www.instagram.com/");
        String Et = "Instagram";
        String At = "empty";
        System.out.println("Before Assertion " + Et + At);
        At = driver.getTitle();
//it will compare actual title and expected title
        Assert.assertEquals(At,Et);
//print out the result
        System.out.println("After Assertion " + Et + At + " Title matched ");
    }
}
