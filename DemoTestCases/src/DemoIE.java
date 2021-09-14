import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DemoIE
{
    public static void main ( String [] args )
    {
        System.setProperty( "webdriver.ie.driver", "C:\\WebDrivers\\IEDriverServer.exe" );
        WebDriver driver = new InternetExplorerDriver();

        String url = "https://google.com";
        String title;

        driver.get( url );
        title = driver.getTitle();

        System.out.println( title );
    }
}
