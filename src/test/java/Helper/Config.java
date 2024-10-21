package Helper;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class Config {
public static WebDriver driver;
public static void confedge() {
	System.setProperty("webdriver.edge.driver", "c:/msedgedriver.exe");
}
public static void maximize() {
	driver.manage().window().maximize();
}
public static void attente(long s) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(s));
}
public static void quit() {
	driver.quit();
}
}
