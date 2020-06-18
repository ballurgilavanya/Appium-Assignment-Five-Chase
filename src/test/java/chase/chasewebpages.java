package chase;
import java.util.List;
import java.io.IOException;
import java.net.MalformedURLException;import java.net.URL;import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;import org.openqa.selenium.WebElement;import org.openqa.selenium.remote.DesiredCapabilities;import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.util.Assert;import chase.commonutils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;import io.appium.java_client.remote.AndroidMobileCapabilityType;import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;import java.time.Duration;
import static io.appium.java_client.touch.offset.PointOption.point;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.TouchAction;public class chasewebpages {
public static AndroidDriver driver;

public static void launchwebsite()

{
driver=commonutils.getDriver();
driver.get("http://www.chase.com");
}

public static void sandwichmenu() {

driver.findElement(By.xpath("//*[@id=\"skip-sidemenu\"]")).click();

}

public static void customerservice()
{
driver.findElement(By.xpath("//*[@id=\"side-menu-header\"]/div[5]/div[2]/ul/li[1]/a")).click();

}

public static void populartopics()
{
driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
driver.findElement(By.xpath("//*[@id=\"SubHeaderOriginal\"]/ul/li[2]/a")).click();
driver.findElement(By.xpath("//*[@id=\"popular\"]/div[2]/div/div/div/div[2]/div/div/div/div/div/ul/li[8]/a")).click();

}

public static void searchprintrandomtopic()
{

driver.findElement(By.xpath("//*[@id=\"Module0\"]/section/section[1]/div[4]/form/label/input")).sendKeys("credit");
driver.pressKeyCode(66);
driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
 WebElement a=driver.findElement(By.xpath("//*[@id=\"Module0\"]/section/section[3]/div[2]/ul/li[1]/h4/a"));
 WebElement b=driver.findElement(By.xpath("//*[@id=\"Module0\"]/section/section[3]/div[2]/ul/li[1]/div/p"));
 System.out.println("This is heading of random topic - " + a.getText());
 System.out.println("This is content of random topic - " + b.getText());
}

public static void gotohomepage()
{
driver.findElement(By.xpath("//*[@id=\"skip-sidemenu\"]")).click();
driver.findElement(By.xpath("//*[@id=\"side-menu-header\"]/div[3]/div/ul/li[1]/a")).click();
driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
System.out.println("Home opened");

}

public static void givefeedback()
{
driver.findElement(By.xpath("//*[@id=\"skip-sidemenu\"]")).click();
driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
driver.findElement(By.xpath("//*[@id=\"side-menu-header\"]/div[5]/div[2]/ul/li[2]/a")).click();

}

public static void fillfeedbackform()
{
driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);	
driver.findElement(By.xpath("//*[@id=\"rater_buttons\"]/div[4]/label")).click();
driver.findElement(By.xpath("//*[@id=\"comment_box\"]")).sendKeys("Overall experience was good");
}


}