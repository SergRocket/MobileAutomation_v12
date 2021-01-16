import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseTestClass {
    public static void main (String[] args) throws MalformedURLException {
        //code to launch the apk file
        File file = new File("src");
        File files = new File(file, "logo_fix.apk");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus5");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, files.getAbsolutePath());
        AndroidDriver<AndroidElement> androidDriver = new AndroidDriver<AndroidElement>
                ( new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);

    }
}
