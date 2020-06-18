package chase;


import java.util.List;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
 

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.remote.AndroidMobileCapabilityType;

import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import java.time.Duration;
import static io.appium.java_client.touch.offset.PointOption.point;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.TouchAction;

public class chaseweb {
	
public static AndroidDriver driver;
@SuppressWarnings("rawtypes")



public static void main(String[] args) throws IOException{ 
	
commonutils.loadproperties("global.properties"); 
commonutils.setCapabilities();

chasewebpages.launchwebsite();
chasewebpages.sandwichmenu();
chasewebpages.customerservice();
chasewebpages.populartopics();
chasewebpages.searchprintrandomtopic();
chasewebpages.gotohomepage();
chasewebpages.givefeedback();
chasewebpages.fillfeedbackform();
}
}