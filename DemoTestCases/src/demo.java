import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo
{
    public static void main ( String [] args )
    {
        System.setProperty( "webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();

        String url = "https://google.com";
        String title;

        driver.get( url );
        title = driver.getTitle();

        System.out.println( title );
    }
}
