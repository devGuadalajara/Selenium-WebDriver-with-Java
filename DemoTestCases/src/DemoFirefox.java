import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoFirefox
{
    public static void main ( String [] args )
    {
        System.setProperty( "webdriver.gecko.driver", "C:\\WebDrivers\\geckodriver.exe" );
        WebDriver driver = new FirefoxDriver();

        String url = "https://google.com";
        String title;

        driver.get( url );
        title = driver.getTitle();

        System.out.println( title );
    }
}
