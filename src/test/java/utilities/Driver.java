package utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
static private WebDriver driver;

public static WebDriver getDriver() {
	if(driver==null) {
		switch(Config.getProperties("browser")) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", Config.getProperties("chromedriverhead"));
			driver=new ChromeDriver();
		}
	}
	return driver;
}
}
